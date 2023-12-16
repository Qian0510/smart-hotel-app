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
    private EditText EdittView;
    private EditText EditView1;
    private Button btn_2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.register);
        btn_2 = findViewById(R.id.btn_2);
        text1=findViewById(R.id.forget_password);
        EdittView = findViewById(R.id.user);
        EditView1 = findViewById(R.id.pwd);
        btn.setOnClickListener(this);
        btn_2.setOnClickListener(this);
        EdittView.addTextChangedListener(new HideTextWatcher(EdittView));
        EditView1.addTextChangedListener(new HideTextWatcher(EditView1));


    }

    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.register){
            Intent intent = new Intent(this, registration_page.class);
            startActivity(intent);
        } else if (v.getId() == R.id.btn_2) {
            Intent intent = new Intent(this,Home_screen.class);
            startActivity(intent);
        }
    }

    private class HideTextWatcher implements TextWatcher {

        public HideTextWatcher(EditText v ) {
        }

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable s) {
            String text1 = EdittView.getText().toString().trim();
            String text2 = EditView1.getText().toString().trim();
            btn_2.setEnabled(!text1.isEmpty() && !text2.isEmpty());
        }
    }
}

