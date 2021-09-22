package com.example.etoll_system.common;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.etoll_system.R;

public class RegistrationActivity extends AppCompatActivity {

  //creating variables
    ImageView backBtn;
    Button next;
    TextView titleText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_registration);

        //hooks
        backBtn = findViewById(R.id.registration_back_button);
        next = findViewById(R.id.registrationNext_button);
        titleText = findViewById(R.id.registrationTextView);

    }


    public void callNextRegistrationScreen(View view){

        Intent intent = new Intent(getApplicationContext(),Next_RegistrationActivity.class);

        Pair[] pairs = new Pair[3];

        pairs[0] = new Pair<View,String>(backBtn,"transition_backArrow_button");
        pairs[1] = new Pair<View,String>(next,"transition_Next_button");
        pairs[2] = new Pair<View,String>(titleText,"transition_title_text");


        if (android.os.Build.VERSION.SDK_INT>=android.os.Build.VERSION_CODES.LOLLIPOP) {
            ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(RegistrationActivity.this, pairs);
            startActivity(intent,options.toBundle());
        }
        else{
            startActivity(intent);
        }
    }

    public void callLastRegistrationScreen(View view) {

        Intent intent = new Intent(getApplicationContext(),Next_RegistrationActivity.class);

        Pair[] pairs = new Pair[3];

        pairs[0] = new Pair<View,String>(backBtn,"transition_backArrow_button");
        pairs[1] = new Pair<View,String>(next,"transition_Next_button");
        pairs[2] = new Pair<View,String>(titleText,"transition_title_text");


        if (android.os.Build.VERSION.SDK_INT>=android.os.Build.VERSION_CODES.LOLLIPOP) {
            ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(RegistrationActivity.this, pairs);
            startActivity(intent,options.toBundle());
        }
        else{
            startActivity(intent);
        }
    }
}