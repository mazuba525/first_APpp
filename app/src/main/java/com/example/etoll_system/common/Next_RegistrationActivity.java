package com.example.etoll_system.common;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.etoll_system.R;

public class Next_RegistrationActivity extends AppCompatActivity {

    Button lastNextBtn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_next__registration);


        lastNextBtn=findViewById(R.id.next_button);

        lastNextBtn.setOnClickListener(view -> {
            Intent intent =new Intent(Next_RegistrationActivity.this,Last_RegistrationActivity.class);
            startActivity(intent);
        });



    }


}