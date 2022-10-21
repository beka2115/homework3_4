package com.example.homework3_4;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.homework3_4.databinding.FragmentFirstBinding;

import java.util.ArrayList;

public class FirstFragment extends Fragment implements OnClick{

    private FragmentFirstBinding binding;
    private ContinentAdapter adapter;
    private ArrayList<Continent> continentsList = new ArrayList<>();
    public final static String KEY_FOR_CONTINENT="Key";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        adapter = new ContinentAdapter(continentsList, this);
        binding.recycler1.setAdapter(adapter);

    }

    private void loadData() {
        continentsList.clear();
        continentsList.add(new Continent("Australia", "https://illustoon.com/photo/839.png",0));
        continentsList.add(new Continent("North America", "https://upload.wikimedia.org/wikipedia/en/e/e9/North_America.PNG",1));
        continentsList.add(new Continent("South America", "https://upload.wikimedia.org/wikipedia/en/e/ef/Flags_south_america.png",2));
        continentsList.add(new Continent("Eurasia", "https://upload.wikimedia.org/wikipedia/commons/thumb/8/82/Flag_map_of_Asia.png/955px-Flag_map_of_Asia.png",3));
        continentsList.add(new Continent("Africa", "https://upload.wikimedia.org/wikipedia/commons/9/91/Africa_Flag_Map.png",4));


    }

    @Override
    public void onItemClick(int position) {
       Continent continent= adapter.getContinent(position);
       Bundle bundle=new Bundle();
       bundle.putSerializable(KEY_FOR_CONTINENT,continent);
       Fragment fragment=new SecondFragment();
       fragment.setArguments(bundle);
       requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment).addToBackStack(null).commit();

    }
}