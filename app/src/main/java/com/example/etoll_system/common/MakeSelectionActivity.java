package com.example.etoll_system.common;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.etoll_system.R;

public class MakeSelectionActivity extends AppCompatActivity {

    Button viaSmsBtn;
    Button viaEmailBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_selection);


        viaSmsBtn=findViewById(R.id.via_sms_button);
        viaEmailBtn=findViewById(R.id.via_email_button);


        viaSmsBtn.setOnClickListener(view -> {
            Intent intent =new Intent(MakeSelectionActivity.this, VerifyOTPActivity.class);
            startActivity(intent);

        });


        viaEmailBtn.setOnClickListener(view -> {
            Intent intent =new Intent(MakeSelectionActivity.this, VerifyOTPActivity.class);
            startActivity(intent);

        });



    }
}