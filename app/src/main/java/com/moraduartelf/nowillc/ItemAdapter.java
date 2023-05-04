package com.moraduartelf.nowillc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ramotion.foldingcell.FoldingCell;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder>{

    private List<ItemObject> mListItems;
    public void setData(List<ItemObject> list){
        this.mListItems = list;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item, parent,false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        ItemObject itemObject = mListItems.get(position);
        if(itemObject == null){
            return;
        }
        holder.dnow_products.setText(itemObject.getTitle());
        holder.products_content.setText(itemObject.getContent());

        holder.foldingCell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.foldingCell.toggle(false);
            }
        });

        holder.dnow_products.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.foldingCell.toggle(false);
                //Toast.makeText(v.getContext(),itemObject.getTitle(),Toast.LENGTH_SHORT).show();
            }
        });

        holder.products_content.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.foldingCell.toggle(false);
                //Toast.makeText(v.getContext(),itemObject.getContent(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        if (mListItems != null){
            return mListItems.size();
        }
        return 0;
    }

    public class ItemViewHolder extends RecyclerView.ViewHolder {

        private FoldingCell foldingCell;
        private TextView products_content;
        private TextView dnow_products;

        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);

            foldingCell = itemView.findViewById(R.id.folding_cell);
            products_content = itemView.findViewById(R.id.products_content);
            dnow_products = itemView.findViewById(R.id.dnow_products);
        }
    }
}
