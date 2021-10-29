package com.example.registration;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.view.View.OnClickListener;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity implements OnClickListener {


    EditText txtLog;
    EditText txtPass;
    EditText txtLName;
    EditText txtFName;

    Button btnSubmit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txtLog = findViewById(R.id.txtLog);
        txtPass= findViewById(R.id.txtPass);
        txtLName = findViewById(R.id.txtLName);
        txtFName = findViewById(R.id.txtFName);

        btnSubmit = findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, ThirdAcivity.class);
        intent.putExtra("fName", txtFName.getText().toString());
        intent.putExtra("lName", txtLName.getText().toString());
        intent.putExtra("log", txtLog.getText().toString());
        intent.putExtra("pass", txtPass.getText().toString());
        startActivity(intent);
    }
}