package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home_screen extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        findViewById(R.id.iv_back1).setOnClickListener(this);
        findViewById(R.id.btn_customer).setOnClickListener(this);
        findViewById(R.id.btn_museum).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.iv_back1){
            finish();
        }
        else if (v.getId() == R.id.btn_customer) {
            Intent intent = new Intent(this,customer_service.class);
            startActivity(intent);
        }
        else if (v.getId() == R.id.btn_museum) {
            Intent intent = new Intent(this,Museum_information.class);
            startActivity(intent);
        }
    }
}