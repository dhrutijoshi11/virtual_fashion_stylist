package com.example.virtual_fashion_stylist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.makeramen.roundedimageview.RoundedImageView;

import java.util.ArrayList;
import java.util.List;

public class photosAdapter extends RecyclerView.Adapter<photosAdapter.photoViewHolder> {

    // List to hold photos
    private List<photos> mlist= new ArrayList<>();

    // Constructor to initialize the list of photos
    public photosAdapter(List<photos> mlist) {
        this.mlist = mlist;
    }

    // Method to create a new photoViewHolder object when needed
    @NonNull
    @Override
    public photoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Inflate the each_item.xml layout file into a View object
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.each_item,parent,false);
        // Return a new photoViewHolder object with the inflated View object as parameter
        return new photoViewHolder(view);
    }

    // Method to bind the data to the views in the photoViewHolder
    @Override
    public void onBindViewHolder(@NonNull photoViewHolder holder, int position) {
        // Set the image resource of the photo to the ImageView in the photoViewHolder
        holder.imageView.setImageResource(mlist.get(position).getImage());
    }

    // Method to get the number of photos in the list
    @Override
    public int getItemCount() {
        return mlist.size();
    }

    // Inner class to hold the views of each item in the RecyclerView
    public class photoViewHolder extends RecyclerView.ViewHolder {
        RoundedImageView imageView;
        public photoViewHolder(@NonNull View itemView) {
            super(itemView);
            // Find the ImageView in the inflated layout and assign it to the imageView variable
            imageView =itemView.findViewById(R.id.imageView);
        }
    }

}
