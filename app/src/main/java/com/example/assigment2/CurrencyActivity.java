package com.example.assigment2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;

import com.example.assigment2.databinding.ActivityMainBinding;

public class CurrencyActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        getSupportActionBar().hide();
        View view = binding.getRoot();
        setContentView(view);
        CurrencyActivityViewModel model = new ViewModelProvider(this).get(CurrencyActivityViewModel.class);
        binding.setLifecycleOwner(this);
        binding.setUser(model);
    }
}