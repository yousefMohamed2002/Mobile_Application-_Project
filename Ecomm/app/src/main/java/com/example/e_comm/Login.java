package com.example.e_comm;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {
    TextView F_Password;
    TextView t;
    TextView test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        t = findViewById(R.id.SignUpTXT);
        t.setOnClickListener(v -> startActivity(new Intent(Login.this, Signup.class)));

        F_Password = findViewById(R.id.ForgetPassword);
        F_Password.setOnClickListener(v -> startActivity(new Intent(Login.this, ForgetPassword.class)));

        test = findViewById(R.id.Test);
        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Login.this, MainActivity.class));
            }
        });
    }
}
