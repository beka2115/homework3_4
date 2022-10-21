package com.example.homework3_4;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.homework3_4.databinding.ItemFirstBinding;

import java.util.ArrayList;

public class ContinentAdapter extends RecyclerView.Adapter<ContinentAdapter.ContinentViewHolder> {

    private ArrayList<Continent> continentList;
    private OnClick onClick;

    public ContinentAdapter(ArrayList<Continent> continentList, OnClick onClick) {
        this.continentList = continentList;
        this.onClick=onClick;
    }

    @NonNull
    @Override
    public ContinentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ContinentViewHolder(ItemFirstBinding.inflate(LayoutInflater.from(parent.getContext()), parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ContinentViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.bind(continentList.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClick.onItemClick(position);

            }
        });
    }

    @Override
    public int getItemCount() {
        return continentList.size();
    }

    public Continent getContinent(int position) {
        return continentList.get(position);

    }

    class ContinentViewHolder extends RecyclerView.ViewHolder {
        private ItemFirstBinding binding;

        public ContinentViewHolder(@NonNull ItemFirstBinding binding) {
            super(binding.getRoot());
            this.binding=binding;
        }
        private void bind (Continent continent){
            binding.textContinent.setText(continent.getName());
            Glide.with(binding.image1).load(continent.getFlag()).into(binding.image1);
        }
    }

}
