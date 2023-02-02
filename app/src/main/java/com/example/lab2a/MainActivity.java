package com.example.lab2a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.lab2a.databinding.ActivityMainBinding;

import java.math.BigDecimal;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
    }

    public void onClick(View view) {
        BigDecimal bill = new BigDecimal(binding.editTotalBill.getText().toString());
        BigDecimal tip = new BigDecimal(binding.editTipPercentage.getText().toString());
        BigDecimal numOfPeople = new BigDecimal(binding.editNumOfPeople.getText().toString());

        String tpp = "Total Per Person: $" + TipCalculator.calculateTip(bill, tip, numOfPeople);

        binding.totalPerPerson.setText(tpp);
    }
}