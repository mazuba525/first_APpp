package com.example.etoll_system.User;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.etoll_system.R;
import com.example.etoll_system.common.ForgetPassword1Activity;
import com.example.etoll_system.common.RegistrationActivity;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    //declaring button variables
          Button createBtn;
          Button loginBtn;
          Button forgetBtn;
    //Get data variable
        TextInputLayout loginUserName, loginPassword;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        //Hooks for buttons
        createBtn=findViewById(R.id.create_account_btn);
        loginBtn=findViewById(R.id.loginBtn);
        forgetBtn=findViewById(R.id.forget_btn);

        //Hooks for getting data
        loginPassword=findViewById(R.id.login_password);
        loginUserName=findViewById(R.id.login_username);


        createBtn.setOnClickListener(this);
        loginBtn.setOnClickListener(this);
        forgetBtn.setOnClickListener(this);





    }



    @Override
    public void onClick(View view) {

          switch (view.getId()){

              case R.id.create_account_btn:
                  Intent intent =new Intent(MainActivity.this, RegistrationActivity.class);
                  startActivity(intent);
                  break;

              case R.id.loginBtn:

                  if( !validatePassword() | !validateUsername()){
                      return;
                  }
                  Intent intent2 =new Intent(MainActivity.this,Dashboard.class);
                  startActivity(intent2);
                  break;

              case R.id.forget_btn:
                  Intent intent3 =new Intent(MainActivity.this, ForgetPassword1Activity.class);
                  startActivity(intent3);
                  break;
          }
    }








    //Validation functions


    private Boolean validateUsername() {
        String val = loginUserName.getEditText().getText().toString();
        String noWhiteSpace = "\\A\\w{4,20}\\z";

        if (val.isEmpty()) {
            loginUserName.setError("Field cannot be empty");
            return false;
        } else if (val.length() >= 15) {
            loginUserName.setError("Username too long");
            return false;
        } else if (!val.matches(noWhiteSpace)) {
            loginUserName.setError("White Spaces are not allowed");
            return false;
        } else {
            loginUserName.setError(null);
            loginUserName.setErrorEnabled(false);
            return true;
        }
    }

    private Boolean validatePassword() {
        String val = loginPassword.getEditText().getText().toString();
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
            loginPassword.setError("Field cannot be empty");
            return false;
        } else if (!val.matches(passwordVal)) {
            loginPassword.setError("Password is too weak");
            return false;
        } else {
            loginPassword.setError(null);
            loginPassword.setErrorEnabled(false);
            return true;
        }
    }




}