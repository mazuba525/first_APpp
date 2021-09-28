package com.example.etoll_system.common;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.etoll_system.R;
import com.google.android.material.textfield.TextInputLayout;

public class RegistrationActivity extends AppCompatActivity {

    //EditText fullName, userName, email, password;

    Button nextBtn;
   TextInputLayout fullName, userName, email, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_registration);

        nextBtn=findViewById(R.id.registrationNext_button);

        //Hooks for getting data
        fullName=findViewById(R.id.registration_full_name);
        userName=findViewById(R.id.registration_username);
        email=findViewById(R.id.registration_email);
        password=findViewById(R.id.registration_password);

        nextBtn.setOnClickListener(view -> {
           /*if(!validateName() | !validatePassword()  | !validateEmail() | !validateUsername()){
                return;
            }*/

            //get text from intent
            String fullName=getIntent().getStringExtra("fullName");
            String userName=getIntent().getStringExtra("userName");
            String email=getIntent().getStringExtra("email");
            String password=getIntent().getStringExtra("password");

            Intent intent =new Intent(RegistrationActivity.this, Registration2Activity.class);
           //passing all fields to the next activity
            intent.putExtra("fullName",fullName);
            intent.putExtra("userName",userName);
            intent.putExtra("email",email);
            intent.putExtra("password",password);

            startActivity(intent);
        });

    }

/*
    private Boolean validateEmail() {
        String val = email.getEditText().getText().toString();
        String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

        if (val.isEmpty()) {
            email.setError("Field cannot be empty");
            return false;
        } else if (!val.matches(emailPattern)) {
            email.setError("Invalid email address");
            return false;
        } else {
            email.setError(null);
            email.setErrorEnabled(false);
            return true;
        }
    }

    private Boolean validateName(){
        String val = fullName.getEditText().getText().toString();

        if (val.isEmpty()) {
            fullName.setError("Field cannot be empty");
            return false;
        }
        else {
            fullName.setError(null);
            fullName.setErrorEnabled(false);
            return true;
        }
    }


    private Boolean validateUsername() {
        String val = userName.getEditText().getText().toString();
        String noWhiteSpace = "\\A\\w{4,20}\\z";

        if (val.isEmpty()) {
            userName.setError("Field cannot be empty");
            return false;
        } else if (val.length() >= 15) {
            userName.setError("Username too long");
            return false;
        } else if (!val.matches(noWhiteSpace)) {
            userName.setError("White Spaces are not allowed");
            return false;
        } else {
            userName.setError(null);
            userName.setErrorEnabled(false);
            return true;
        }
    }

    private Boolean validatePassword() {
        String val = password.getEditText().getText().toString();
        String passwordVal = "^" +
                //"(?=.*[0-9])" +         //at least 1 digit
                //"(?=.*[a-z])" +         //at least 1 lower case letter
                //"(?=.*[A-Z])" +         //at least 1 upper case letter
                "(?=.*[a-zA-Z])" +      //any letter
                "(?=.*[@#$%^&+=])" +    //at least 1 special character
                "(?=\\S+$)" +           //no white spaces
                ".{4,}" +               //at least 4 characters
                "$";

        if (val.isEmpty()) {
            password.setError("Field cannot be empty");
            return false;
        } else if (!val.matches(passwordVal)) {
            password.setError("Password is too weak");
            return false;
        } else {
            password.setError(null);
            password.setErrorEnabled(false);
            return true;
        }
    }*/


}