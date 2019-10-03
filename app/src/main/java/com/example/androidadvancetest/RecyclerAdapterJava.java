package com.example.androidadvancetest;

import android.content.ClipData;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerAdapterJava extends RecyclerView.Adapter<RecyclerAdapterJava.RecyclerViewholder>  {

    private ArrayList<NameModel> list;
    private ClickItem item;

    RecyclerAdapterJava(ArrayList<NameModel> list , ClickItem item){

        this.list = list;
        this.item = item;
    }
    
    @NonNull
    @Override
    public RecyclerViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_recycler_adapter , parent , false);
        return new RecyclerViewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewholder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }



    class RecyclerViewholder extends RecyclerView.ViewHolder{
        TextView textView;
        View v;

        public RecyclerViewholder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textView);
            v=itemView;
        }

         void onBind(final NameModel model) {
            textView.setText(model.getName());
            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    item.onItemClicked(model.getFamily());
                }
            });
        }

    }


}
