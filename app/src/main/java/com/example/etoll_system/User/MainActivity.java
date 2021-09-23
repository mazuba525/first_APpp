package com.example.etoll_system.User;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.etoll_system.R;
import com.example.etoll_system.common.RegistrationActivity;

public class MainActivity extends AppCompatActivity {



    Button loginBtn;
    Button createBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_login);


        loginBtn=findViewById(R.id.loginBtn);
        createBtn=findViewById(R.id.create_account_btn);


        loginBtn.setOnClickListener(view -> {
            Intent intent =new Intent(MainActivity.this, MainActivity.class);
            startActivity(intent);
        });

        createBtn.setOnClickListener(view -> {
            Intent intent =new Intent(MainActivity.this, RegistrationActivity.class);
            startActivity(intent);
        });



    }
}