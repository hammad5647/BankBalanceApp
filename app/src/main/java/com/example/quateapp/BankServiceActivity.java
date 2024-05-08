package com.example.quateapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.quateapp.databinding.ActivityBankServiceBinding;

public class BankServiceActivity extends AppCompatActivity {

    ActivityBankServiceBinding binding;

    String[] balanceCheck = {"8468001111", "09223766666", "1800-270-3333", "09223920000", "09015483483", "18004195959", "9215676766", "1800 274 0110"};
    String[] miniStatement = {"8468001122", "09223866666", "1800 270 3355", "82912-01200", "09015734734", "18004196969", "9594613613", "18002740110"};
    String[] customerCare = {"1800 5700", "1800-425-3800", "1800 202 6161", "1800 1200", "1800 1030", "1800 103 5577", "1800 1080", "1860 266 2666"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityBankServiceBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        String bankName = binding.bankName.getText().toString();

        binding.bankName.setText("" + bankName);

        binding.backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        binding.balanceDialer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String balanceNo = binding.bankBalanceCheckNumber.getText().toString();


                Intent intent1 = new Intent(Intent.ACTION_DIAL);
                intent1.setData(Uri.parse("tel:" + balanceNo));
                startActivity(intent1);


            }
        });
        binding.statementDialer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String statementNo = binding.miniStatementNumber.getText().toString();

                Intent intent2 = new Intent(Intent.ACTION_DIAL);
                intent2.setData(Uri.parse("tel:" + statementNo));
                startActivity(intent2);

            }
        });
        binding.careDialer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String careNo = binding.customerCareNumber.getText().toString();

                Intent intent3 = new Intent(Intent.ACTION_DIAL);
                intent3.setData(Uri.parse("tel:" + careNo));
                startActivity(intent3);
            }
        });
    }
}