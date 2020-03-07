package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class ListAdapter extends RecyclerView.Adapter {

    private ArrayList<ListAdapter> listHero;

    public ListAdapter(ArrayList<ListAdapter> list) {
        this.listHero = list;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((ListViewHolder) holder).bindView(position);
    }

    @Override
    public int getItemCount() {
        return OurData.title.length;
    }

    public class ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        private TextView itemTitle;
        private TextView itemDeskripsi;
        private TextView itemDateline;

        public ListViewHolder(View itemView){

            super(itemView);
            itemTitle = (TextView) itemView.findViewById(R.id.title);
            itemDeskripsi = (TextView) itemView.findViewById(R.id.deskripsi);
            itemDateline = (TextView) itemView.findViewById(R.id.dateline);
            itemView.setOnClickListener(this);

        }

        public void bindView(int position){

            itemTitle.setText(OurData.title[position]);
            itemDeskripsi.setText(OurData.deskripsi[position]);
            itemDateline.setText(OurData.dateline[position]);


        }

        public void onClick(View view){

        }


    }
}
