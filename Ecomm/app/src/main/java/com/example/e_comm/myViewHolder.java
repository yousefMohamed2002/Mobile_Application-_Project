package com.example.e_comm;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class myViewHolder extends RecyclerView.ViewHolder {
   ImageView imageView;
   TextView nameView,Discription,price;
    public myViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView=itemView.findViewById(R.id.PhotoProduct1);
        nameView=itemView.findViewById(R.id.PhotoProduct1TXTName);
        Discription=itemView.findViewById(R.id.PhotoProduct1TXTDecscription);
        price=itemView.findViewById(R.id.PhotoProduct1TXTPrice);

    }
}
