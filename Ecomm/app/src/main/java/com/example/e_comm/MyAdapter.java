package com.example.e_comm;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.myViewHolder> {
    Context context;
    List<item> items;
    private final RecycleViewInterface recycleViewInterface;

    public MyAdapter(Context context, List<item> items, RecycleViewInterface recycleViewInterface) {
        this.context = context;
        this.items = items;
        this.recycleViewInterface = recycleViewInterface;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return (new myViewHolder(LayoutInflater.from(context).inflate(R.layout.item_view_recycleview, parent, false)));
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
        holder.imageView.setImageResource(items.get(position).getImage());
        holder.nameView.setText(items.get(position).getName());
        holder.Discription.setText(items.get(position).getDescription());
        holder.price.setText(items.get(position).getPrice());
    }

    @Override
    public int getItemCount() {
        return items.size();

    }

    public  class myViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView nameView, Discription, price;

        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.PhotoProduct1);
            nameView = itemView.findViewById(R.id.PhotoProduct1TXTName);
            Discription = itemView.findViewById(R.id.PhotoProduct1TXTDecscription);
            price = itemView.findViewById(R.id.PhotoProduct1TXTPrice);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (recycleViewInterface!=null) {
                        int pos=getAdapterPosition();
                        if(pos!=RecyclerView.NO_POSITION)
                        {
                            recycleViewInterface.OnIteamClick(pos);
                        }
                    }


                }
            });
        }
    }
}



