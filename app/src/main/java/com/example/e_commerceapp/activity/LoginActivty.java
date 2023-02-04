package com.example.e_commerceapp.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.e_commerceapp.R;

public class LoginActivty extends AppCompatActivity {

    private Button log_btn;
    private TextView go_reg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        log_btn =  findViewById(R.id.login);

        go_reg = findViewById(R.id.go_reg);

        go_reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivty.this, RegisterActivity.class);
                startActivity(intent);
            }
        });
    }
}