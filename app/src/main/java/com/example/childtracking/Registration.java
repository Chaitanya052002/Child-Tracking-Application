package com.example.childtracking;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;

public class Registration extends AppCompatActivity {


    private EditText Parentname,Parentmail,Childname,Parentpass1,Parentpass2,Parentpass,Phoneno;
    private TextView Registrationtext;
    private Button regButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        regButton = (Button)findViewById(R.id.button);

        regButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setupUIViews();
             /*   if(ValidateName() && validateUsername() && validateEmail() && validatePhoneNo() && validatePassword() )
                {
                    //Code to update data in database;

                } */
            }
        });
    }



    private Boolean validateName() {
        String val = Parentname.getText().toString();
        if (val.isEmpty()) {
            Parentname.setError("Field cannot be empty");
            return false;
        }
        else {
            Parentname.setError(null);
           // Parentname.setErrorEnabled(false);
            return true;
        }
    }




    private void setupUIViews()
    {
        Parentname = (EditText)findViewById(R.id.parentname);
        Parentmail = (EditText)findViewById(R.id.parentmail);
        Childname = (EditText)findViewById(R.id.childname);
        Parentpass1 = (EditText)findViewById(R.id.parentpass1);
        Parentpass2 = (EditText)findViewById(R.id.parentpass2);
        Phoneno = (EditText)findViewById(R.id.phoneno);
    }
}