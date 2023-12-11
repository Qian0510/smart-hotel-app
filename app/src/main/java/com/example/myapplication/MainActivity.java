package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btn = null;
    private TextView text1 = null;
    private String input = "";
    private EditText EdittView;
    private EditText EditView1;
    private String input1;
    private Button btn_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.register);
        text1=findViewById(R.id.forget_password);
        EdittView = findViewById(R.id.user);
        EditView1 = findViewById(R.id.pwd);
        btn_2 = findViewById(R.id.btn_2);
        btn.setOnClickListener(this);
        TextWatcher textWatcher = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                boolean hasText1 = s.length() > 0;
                boolean hasText2 = s.length() > 0;
                btn_2.setEnabled(hasText1 && hasText2);
            }

        };

        EditView1.addTextChangedListener(textWatcher);
    }



    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.register){
            Intent intent = new Intent(this, registration_page.class);
            startActivity(intent);
        }
    }
}

