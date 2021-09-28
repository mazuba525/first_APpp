package com.example.etoll_system.common;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.etoll_system.R;

public class Last_RegistrationActivity extends AppCompatActivity {

    //variables
           Button submitBtn;
           EditText phoneNumber;
         //  CountryCodePicker countryCodePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_last__registration);

        submitBtn=findViewById(R.id.submit_button);
        phoneNumber=findViewById(R.id.editTextPhone);
        //countryCodePicker=findViewById(R.id.countryCodePicker);

        submitBtn.setOnClickListener(view -> {
          //  if(!validatePhoneNumber()){
            //    return;
           // }


          //  Intent receiveIntent=getIntent();
           // Bundle page1Info = receiveIntent.getBundleExtra("page 1 info ");
          //  Bundle page2Info= receiveIntent.getExtras();

          // String getUserEnteredPhoneNumber = phoneNumber.getEditableText().toString().trim(); //Get Phone number
           // String phoneNo = "+"+countryCodePicker.getFormattedFullNumber()+getUserEnteredPhoneNumber;




            Intent intent =new Intent(Last_RegistrationActivity.this, SetNewPasswordActivity.class);

            //passing all fields to the next activity
           // intent.putExtra("page 1 Info",page1Info );
           // intent.putExtra("page 2 Info",page2Info);
            //intent.putExtra("phoneNumber",phoneNo);
            startActivity(intent);
        });



    }

        private boolean validatePhoneNumber() {
        String val = phoneNumber.getEditableText().toString().trim();
       // String checkspaces = "Aw{1,20}z";
        if (val.isEmpty()) {
            phoneNumber.setError("Field cannot be empty");
            return false;
        }
       /* } else if (!val.matches(checkspaces)) {
            phoneNumber.setError("No White spaces are allowed!");
            return false;
        } */
        else{
            phoneNumber.setError(null);
            phoneNumber.setEnabled(false);
            return true;
        }
    }

}