package com.example.simplerecylerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by hp on 9/1/2016.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolderRv>{
    ArrayList<String> itemsListText;
    ArrayList itemsListImages;


    MyAdapter(ArrayList<String> itemsListText, ArrayList itemsListImages ){
        this.itemsListText = itemsListText;
        this.itemsListImages = itemsListImages;
    }

    @Override
    public ViewHolderRv onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row,parent,false); //Inflating the layout
        ViewHolderRv vhItem = new ViewHolderRv(v,viewType); //Creating ViewHolder and passing the object of type view
        return vhItem;
    }

    @Override
    public void onBindViewHolder(ViewHolderRv holder, int position) {
        holder.textView.setText(itemsListText.get(position)); // Setting the Text with the array of our Titles
        holder.imageView.setImageResource((int)itemsListImages.get(position));
    }

    @Override
    public int getItemCount() {
        return itemsListText.size();
    }


    public class ViewHolderRv extends RecyclerView.ViewHolder{
        TextView textView;
        ImageView imageView;

        ViewHolderRv(View itemView, int ViewType){
            super(itemView);

            textView = (TextView) itemView.findViewById(R.id.textView);
            imageView = (ImageView) itemView.findViewById(R.id.imageView);
        }
    }
}
