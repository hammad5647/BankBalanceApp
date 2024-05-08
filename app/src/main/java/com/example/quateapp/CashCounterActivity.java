package com.example.quateapp;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.quateapp.databinding.ActivityCashCounterBinding;

public class CashCounterActivity extends AppCompatActivity {
    ActivityCashCounterBinding binding;

    int twothsnd,fiveHndrd,twoHndrd,oneHndrd,ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityCashCounterBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());

        binding.twoThsndValue.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String twoThsndInput = binding.twoThsndValue.getText().toString();

                twothsnd = Integer.parseInt(twoThsndInput) * 2000;
                binding.twoThsndTotal.setText("" + twothsnd);
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });


        binding.fiveHndrdValue.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String fiveHndrdInput = binding.fiveHndrdValue.getText().toString();

                fiveHndrd = Integer.parseInt(fiveHndrdInput) * 500;
                binding.fiveHndrdTotal.setText("" + fiveHndrd);


            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });


        binding.twoHndrdValue.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String twoHndrdInput = binding.twoHndrdValue.getText().toString();

                twoHndrd = Integer.parseInt(twoHndrdInput) * 200;
                binding.twoHndrdTotal.setText("" + twoHndrd);

            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });


        binding.oneHndrdValue.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String oneHndrdInput = binding.oneHndrdValue.getText().toString();

                oneHndrd = Integer.parseInt(oneHndrdInput) * 100;
                binding.oneHndrdTotal.setText("" + oneHndrd);

            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        binding.backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }
}