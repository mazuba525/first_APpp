package com.example.etoll_system.common;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.etoll_system.R;

import java.util.Calendar;

public class Registration2Activity extends AppCompatActivity {

    //Variables
    Button nextBtn;
    RadioGroup radioGroup;
    RadioButton selectedGender;
    DatePicker datePicker;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration2);


        //Hooks
        nextBtn=findViewById(R.id.next2_button);
        radioGroup=findViewById(R.id.radio_group);
        datePicker=findViewById(R.id.date_picker);

        nextBtn.setOnClickListener(view -> {
            if(!validateGender() | !validateAge()){
                return;
            }

                selectedGender=findViewById(radioGroup.getCheckedRadioButtonId());
                 String gender = selectedGender.getText().toString();

                 int day = datePicker.getDayOfMonth();
                 int month = datePicker.getMonth();
                 int year = datePicker.getYear();

                 String date = day+"/"+month+"/"+year;


                Intent receiveIntent=getIntent();
                Bundle bundle = receiveIntent.getExtras();

                Intent intent =new Intent(Registration2Activity.this,Last_RegistrationActivity.class);
                //passing all fields to the next activity
                intent.putExtra("page 1 info",bundle);
                intent.putExtra("gender",gender);
                intent.putExtra("date",date);

                startActivity(intent);

        });
    }


    //validation function for Gender
    private boolean validateGender() {
        if (radioGroup.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Please Select Gender", Toast.LENGTH_SHORT).show();
            return false;
        } else {
            return true;
        }
    }


   //validation function for Age
    private boolean validateAge() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int userAge = datePicker.getYear();
        int isAgeValid = currentYear - userAge;

        if (isAgeValid < 18) {
            Toast.makeText(this, "You must be above 18 to register", Toast.LENGTH_SHORT).show();
            return false;
        } else
            return true;
    }

}