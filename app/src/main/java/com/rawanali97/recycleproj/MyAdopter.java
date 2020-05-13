package com.rawanali97.recycleproj;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdopter extends RecyclerView.Adapter<MyAdopter.holder_Item> {

    public TextView textView;
    private List <String> itemList;


    public MyAdopter(List<String> itemList) {
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public holder_Item onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        TextView textView = (TextView)LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item,parent,false);
        return new holder_Item(textView);
    }

    @Override
    public void onBindViewHolder(@NonNull holder_Item holder, int position) {
         String name = itemList.get(position);
         holder.itemName.setText((name));
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public class holder_Item extends RecyclerView.ViewHolder {
       public TextView itemName;
        public holder_Item(@NonNull TextView v) {
            super(v);
            itemName=v;
        }
    }
}
