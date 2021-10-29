package com.example.registration;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class ThirdAcivity extends AppCompatActivity {

    TextView txtLogin;
    TextView txtFName;
    TextView txtLName;
    TextView txtPass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        txtFName = findViewById(R.id.txtFName);
        txtLName = findViewById(R.id.txtLName);
        txtLogin = findViewById(R.id.txtLogin);
        txtPass = findViewById(R.id.txtPass);

        Intent intent = getIntent();

        String fName = intent.getStringExtra("fName");
        String lName = intent.getStringExtra("lName");
        String Log = intent.getStringExtra("log");
        String Password = intent.getStringExtra("pass");

        txtFName.setText("Твое Имя: " + fName);
        txtLName.setText("Твоя Фамилия: " + lName);
        txtLogin.setText("Твой Логин: " + Log);
        txtPass.setText("Твой Пароль: " + Password);


    }
}