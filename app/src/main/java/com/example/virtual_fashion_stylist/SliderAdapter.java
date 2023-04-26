package com.example.virtual_fashion_stylist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import com.makeramen.roundedimageview.RoundedImageView;

import java.util.List;

public class SliderAdapter extends RecyclerView.Adapter<SliderAdapter.SliderViewHolder> {

    // The list of items to display in the slider
    private List<SliderItem> sliderItems;
    // The ViewPager2 instance that this adapter is attached to
    private ViewPager2 viewPager2;

    public SliderAdapter(List<SliderItem> sliderItems, ViewPager2 viewPager2) {
        this.sliderItems = sliderItems;
        this.viewPager2 = viewPager2;
    }

    @NonNull
    @Override
    public SliderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Inflate the slide_item_container layout and return a new SliderViewHolder instance
        return new SliderViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(
                        R.layout.slide_item_container, parent,false)
        );
    }

    @Override
    public void onBindViewHolder(@NonNull SliderViewHolder holder, int position) {
        // Set the image for the current slider item in the holder's ImageView
        holder.setImage(sliderItems.get(position));
    }

    @Override
    public int getItemCount() {
        // Return the number of items in the slider
        return sliderItems.size();
    }

    // ViewHolder class for the slider items
    class SliderViewHolder extends RecyclerView.ViewHolder {
        private RoundedImageView imageView;

        public SliderViewHolder(@NonNull View itemView) {
            super(itemView);
            // Find the RoundedImageView in the slide_item_container layout and set it as a member variable
            imageView = itemView.findViewById(R.id.imageSlide);
        }

        // Set the image for the ImageView in this holder
        void setImage(SliderItem sliderItem) {
            imageView.setImageResource(sliderItem.getImage());
        }
    }
}
