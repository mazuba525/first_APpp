package com.example.etoll_system.common;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.etoll_system.R;

public class ForgetPassword1Activity extends AppCompatActivity {

    Button forgetNext_Btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password1);


        forgetNext_Btn=findViewById(R.id.forgetPasswordNext_button);

        forgetNext_Btn.setOnClickListener(view -> {
            Intent forgetIntent =new Intent(ForgetPassword1Activity.this, MakeSelectionActivity.class);
            startActivity(forgetIntent);
        });

    }


}