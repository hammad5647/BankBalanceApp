package com.example.quateapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.quateapp.databinding.ActivityMainBinding;
import com.example.quateapp.databinding.ActivityMissedCallBinding;

public class MissedCallActivity extends AppCompatActivity {

    ActivityMissedCallBinding binding;

    String[] bankName = {"Bank of Baroda", "State Bank of India", "HDFC Bank", "Yes Bank", "Canara Bank", "Axis Bank", "ICICI Bank", "Kotak Mahindra Bank"};
    int[] bankLogo = {R.drawable.boblogo, R.drawable.sbilogo, R.drawable.hdfclogo, R.drawable.yesbanklogo, R.drawable.canaralogo, R.drawable.axislogo, R.drawable.icicilogo, R.drawable.kotaklogo};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMissedCallBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        bankAdapter bankAdapter = new bankAdapter(bankName, bankLogo);
        binding.bankBranchList.setAdapter(bankAdapter);

        binding.bankBranchList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MissedCallActivity.this,BankServiceActivity.class);
                startActivity(intent);
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