package com.example.carslist;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

public class CarsListViewHolder extends RecyclerView.ViewHolder {

    private TextView tvCarsList;

    public CarsListViewHolder(@NonNull View itemView) {
        super(itemView);
        tvCarsList =itemView.findViewById(R.id.tv_cars_list);
    }

    public void onBind(String carsList) {
        if (carsList.equals("Lexus")) {
            Context context = tvCarsList.getContext();
            tvCarsList.setTextColor(ContextCompat.getColor(context, R.color.yellow));
        }
        tvCarsList.setText(carsList);
    }
}
