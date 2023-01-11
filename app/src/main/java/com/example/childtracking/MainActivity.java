package com.example.childtracking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText uname,upass;
    private TextView register,forget;
    private Button login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uname=findViewById(R.id.username);
        upass=findViewById(R.id.pass);
        register=findViewById(R.id.register);
        forget=findViewById(R.id.forgotpass);
        login=findViewById(R.id.login);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registrationintent=new Intent(MainActivity.this, Registration.class);
                startActivity(registrationintent);
            }
        });

        forget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent forgotpassintent=new Intent(MainActivity.this, forgotpassword.class);
                startActivity(forgotpassintent);
            }
        });

    }
}