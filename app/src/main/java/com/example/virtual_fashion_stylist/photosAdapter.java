package com.example.virtual_fashion_stylist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.makeramen.roundedimageview.RoundedImageView;

import java.util.ArrayList;
import java.util.List;

public class photosAdapter extends RecyclerView.Adapter<photosAdapter.photoViewHolder>
{
    private List<photos> mlist= new ArrayList<>();

    public photosAdapter(List<photos> mlist) {
        this.mlist = mlist;
    }

    @NonNull
    @Override
    public photoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.each_item,parent,false);
        return new photoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull photoViewHolder holder, int position) {
        holder.imageView.setImageResource(mlist.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return mlist.size();
    }

    public class photoViewHolder extends RecyclerView.ViewHolder
    {
        RoundedImageView imageView;
        public photoViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView =itemView.findViewById(R.id.imageView);
        }
    }

}
