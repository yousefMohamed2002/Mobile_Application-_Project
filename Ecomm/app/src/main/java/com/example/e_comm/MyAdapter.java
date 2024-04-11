package com.example.e_comm;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<myViewHolder> {
Context context;
List<item>items;

    public MyAdapter(Context context, List<item> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new myViewHolder(LayoutInflater.from(context).inflate(R.layout.item_view_recycleview,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
    holder.imageView.setImageResource(items.get(position).getImage());
     holder.nameView.setText(items.get(position).getName());
     holder.Discription.setText(items.get(position).getDescription());
     holder.price.setText( items.get(position).getPrice());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
