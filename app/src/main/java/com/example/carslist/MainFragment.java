package com.example.carslist;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class MainFragment extends Fragment {

    private RecyclerView rvCarsList;
    private ArrayList<String> carsArrayList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rvCarsList = requireActivity().findViewById(R.id.rv_cars_list);
        loadData();
        CarsListAdapter adapter = new CarsListAdapter(carsArrayList);
        rvCarsList.setAdapter(adapter);
    }

    private void loadData() {
        carsArrayList.add("Mercedes-Benz");
        carsArrayList.add("Toyota");
        carsArrayList.add("Audi");
        carsArrayList.add("Honda");
        carsArrayList.add("KIA");
        carsArrayList.add("Chevrolet");
        carsArrayList.add("Volvo");
        carsArrayList.add("Nissan");
        carsArrayList.add("Subaru");
        carsArrayList.add("BMW");
        carsArrayList.add("Hyundai");
        carsArrayList.add("Dodge");
        carsArrayList.add("Lexus");
    }
}