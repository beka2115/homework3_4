package com.example.homework3_4;

import android.graphics.Bitmap;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.example.homework3_4.databinding.FragmentFirstBinding;
import com.example.homework3_4.databinding.FragmentSecondBinding;


public class SecondFragment extends Fragment {
    private FragmentSecondBinding binding;
    private Integer positionNum;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSecondBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (getArguments() != null) {
            Continent continent = (Continent) getArguments().getSerializable(FirstFragment.KEY_FOR_CONTINENT);
            positionNum = continent.getPositionNum();
            if (positionNum == 0) {
                binding.textView1.setText("Sidney");
                binding.textView2.setText("Sidney");
                binding.textView3.setText("Sidney");
                binding.textView4.setText("Sidney");
                binding.textView5.setText("Sidney");
                Glide.with(binding.flag2).load("https://www.pngall.com/wp-content/uploads/2016/05/Australia-Flag-PNG.png").into(binding.flag2);
                Glide.with(binding.flag3).load("https://www.pngall.com/wp-content/uploads/2016/05/Australia-Flag-PNG.png").into(binding.flag3);
                Glide.with(binding.flag4).load("https://www.pngall.com/wp-content/uploads/2016/05/Australia-Flag-PNG.png").into(binding.flag4);
                Glide.with(binding.flag5).load("https://www.pngall.com/wp-content/uploads/2016/05/Australia-Flag-PNG.png").into(binding.flag5);
                Glide.with(binding.flag1).load("https://www.pngall.com/wp-content/uploads/2016/05/Australia-Flag-PNG.png").into(binding.flag1);
            }
            if (positionNum == 1) {
                binding.textView1.setText("USA");
                binding.textView2.setText("Mexico");
                binding.textView3.setText("Canada");
                binding.textView4.setText("Jamaica");
                binding.textView5.setText("Cuba");
                Glide.with(binding.flag1).load("https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/2560px-Flag_of_the_United_States.svg.png").into(binding.flag1);
                Glide.with(binding.flag2).load("https://upload.wikimedia.org/wikipedia/commons/1/17/Flag_of_Mexico.png").into(binding.flag2);
                Glide.with(binding.flag3).load("https://upload.wikimedia.org/wikipedia/en/thumb/c/cf/Flag_of_Canada.svg/1280px-Flag_of_Canada.svg.png").into(binding.flag3);
                Glide.with(binding.flag4).load("https://upload.wikimedia.org/wikipedia/commons/b/b4/Flag_of_Jamaica.png").into(binding.flag4);
                Glide.with(binding.flag5).load("https://upload.wikimedia.org/wikipedia/commons/9/92/Flag_of_Cuba.png").into(binding.flag5);

            }
            if (positionNum == 2) {
                binding.textView1.setText("Argentina");
                binding.textView2.setText("Brazil");
                binding.textView3.setText("Chile");
                binding.textView4.setText("Uruguay");
                binding.textView5.setText("Peru");
                Glide.with(binding.flag1).load("https://upload.wikimedia.org/wikipedia/commons/thumb/1/1a/Flag_of_Argentina.svg/2560px-Flag_of_Argentina.svg.png").into(binding.flag1);
                Glide.with(binding.flag2).load("https://upload.wikimedia.org/wikipedia/commons/9/92/Flag_of_Cuba.png").into(binding.flag2);
                Glide.with(binding.flag3).load("https://upload.wikimedia.org/wikipedia/commons/a/ae/Flag_of_Chile.png").into(binding.flag3);
                Glide.with(binding.flag4).load("https://upload.wikimedia.org/wikipedia/commons/thumb/f/fe/Flag_of_Uruguay.svg/1280px-Flag_of_Uruguay.svg.png").into(binding.flag4);
                Glide.with(binding.flag5).load("https://upload.wikimedia.org/wikipedia/commons/f/f1/Peru_flag_with_coat_of_arms_300.PNG").into(binding.flag5);


            }
            if (positionNum == 3) {
                binding.textView1.setText("Russia");
                binding.textView2.setText("China");
                binding.textView3.setText("Kyrgyzstan");
                binding.textView4.setText("Kazakhstan");
                binding.textView5.setText("India");
                Glide.with(binding.flag1).load("https://uxwing.com/wp-content/themes/uxwing/download/flags-landmarks/russia-flag-icon.png").into(binding.flag1);
                Glide.with(binding.flag2).load("https://upload.wikimedia.org/wikipedia/commons/2/2e/Flag_of_China.png").into(binding.flag2);
                Glide.with(binding.flag3).load("https://seekflag.com/app/uploads/2021/12/Flag-of-kyrgyzstan-01.png").into(binding.flag3);
                Glide.with(binding.flag4).load("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d3/Flag_of_Kazakhstan.svg/1280px-Flag_of_Kazakhstan.svg.png").into(binding.flag4);
                Glide.with(binding.flag5).load("https://upload.wikimedia.org/wikipedia/commons/b/bc/Flag_of_India.png").into(binding.flag5);


            }
            if (positionNum == 4) {
                binding.textView1.setText("Algeria");
                binding.textView2.setText("Benin");
                binding.textView3.setText("Chad");
                binding.textView4.setText("Gambia");
                binding.textView5.setText("Congo");

                Glide.with(binding.flag1).load("https://upload.wikimedia.org/wikipedia/commons/9/90/Flag_of_Algeria.png").into(binding.flag1);
                Glide.with(binding.flag2).load("https://upload.wikimedia.org/wikipedia/commons/thumb/0/0a/Flag_of_Benin.svg/2560px-Flag_of_Benin.svg.png").into(binding.flag2);
                Glide.with(binding.flag3).load("https://upload.wikimedia.org/wikipedia/commons/thumb/4/4b/Flag_of_Chad.svg/2560px-Flag_of_Chad.svg.png").into(binding.flag3);
                Glide.with(binding.flag4).load("https://upload.wikimedia.org/wikipedia/commons/8/8e/Flag_of_the_Gambia.png").into(binding.flag4);
                Glide.with(binding.flag5).load("https://upload.wikimedia.org/wikipedia/commons/thumb/6/6f/Flag_of_the_Democratic_Republic_of_the_Congo.svg/1280px-Flag_of_the_Democratic_Republic_of_the_Congo.svg.png").into(binding.flag5);

            }


        }


    }
}