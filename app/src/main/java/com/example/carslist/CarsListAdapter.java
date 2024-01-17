package com.example.carslist;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CarsListAdapter extends RecyclerView.Adapter<CarsListViewHolder> {

    private ArrayList<String> carsArrayList;

    public CarsListAdapter(ArrayList<String> carsArrayList) {
        this.carsArrayList = carsArrayList;
    }

    @NonNull
    @Override
    public CarsListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CarsListViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_cars_list, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CarsListViewHolder holder, int position) {
        holder.onBind(carsArrayList.get(position));
    }

    @Override
    public int getItemCount() {
        return carsArrayList.size();
    }
}
