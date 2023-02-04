package com.example.e_commerceapp.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.e_commerceapp.R;

public class RegisterActivity extends AppCompatActivity {

    private Button reg_btn;
    private TextView go_log;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        reg_btn =  findViewById(R.id.register);

        go_log = findViewById(R.id.go_log);

        go_log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegisterActivity.this, LoginActivty.class);
                startActivity(intent);
            }
        });
    }
}