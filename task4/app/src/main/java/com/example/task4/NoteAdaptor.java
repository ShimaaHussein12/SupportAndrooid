package com.example.task4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class NoteAdaptor extends  RecyclerView.Adapter<NoteAdaptor.ViewHolder>{
    ArrayList<String>items=new ArrayList<String>();
    Context context;
    public NoteAdaptor( Context context) {

        this.context = context;
    }
    public void setDate( ArrayList<String>items){
        this.items=items;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.TV.setText(items.get(position));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
TextView TV;
ImageView favIMG;
RadioButton buttonRB;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            TV=itemView.findViewById(R.id.TV);
//            favIMG=itemView.findViewById(R.id.favIMG);
//            buttonRB=itemView.findViewById(R.id.buttonRB);
        }
    }
}
