package com.example.londonbaby;

import android.app.Activity;
import android.content.ClipData;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {

    List<MainActivity.Item> dataSet = new ArrayList<MainActivity.Item>();

    Activity activity;

    public ItemAdapter(Activity activity){
        this.activity = activity;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.holder_item, parent, false);

        ImageView imageView = view.findViewById(R.id.imageview_holder);
        TextView textView = view.findViewById(R.id.textview_holder);

        ImageView imageView1 = view.findViewById(R.id.imageview_holder1);
        TextView textView1 = view.findViewById(R.id.textview_holder1);

        return new ViewHolder(view, imageView, textView, imageView1, textView1);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {

        if(position % 2 != 0) {
            viewHolder.itemView.setVisibility(View.GONE);
            viewHolder.itemView.setLayoutParams(new RecyclerView.LayoutParams(0, 0));

            return;
        }

        viewHolder.itemView.setVisibility(View.VISIBLE);
        viewHolder.itemView.setLayoutParams(new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        viewHolder.imageView.setImageDrawable(dataSet.get(position).image);
        viewHolder.textView.setText(dataSet.get(position).title);

        viewHolder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity.getBaseContext(), DetailedActivity.class);
                intent.putExtra("place", dataSet.get(position).place);
                activity.startActivity(intent);
            }
        });

        //next
        if(position + 1 >= dataSet.size()) {
            viewHolder.imageView1.setVisibility(View.INVISIBLE);
            viewHolder.textView1.setVisibility(View.INVISIBLE);

            return;
        }

        viewHolder.imageView1.setVisibility(View.VISIBLE);
        viewHolder.textView1.setVisibility(View.VISIBLE);

        viewHolder.imageView1.setImageDrawable(dataSet.get(position+1).image);
        viewHolder.textView1.setText(dataSet.get(position+1).title);

        viewHolder.imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity.getBaseContext(), DetailedActivity.class);
                intent.putExtra("place", dataSet.get(position+1).place);
                activity.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        if(dataSet == null || dataSet.size() == 0)
            return 0;

        return dataSet.size();
    }

    public void updateAdapter(List<MainActivity.Item> newList){
        dataSet.clear();
        dataSet.addAll(newList);

        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public ImageView imageView;
        public TextView textView;
        public ImageView imageView1;
        public TextView textView1;

        public ViewHolder(View view, ImageView imageView, TextView textView, ImageView imageView1, TextView textView1){
            super(view);

            this.imageView = imageView;
            this.textView = textView;
            this.imageView1 = imageView1;
            this.textView1 = textView1;
        }
    }
}
