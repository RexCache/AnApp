package com.example.anapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.anapp.databinding.ActivityMainBinding;
import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.loginBtn.setOnClickListener(v -> {
            if (!binding.emailET.getText().toString().equals("") && !binding.passwordET.getText().toString().equals("")) {
                String email = AnApp.getString("email");
                String pass = AnApp.getString("password");
                if (binding.emailET.getText().toString().equals(email) && binding.passwordET.getText().toString().equals(pass)) {
                     startActivity(new Intent(this,MainActivity3.class));
                }else {
                    Toast.makeText(this, "Incorrect Credential!", Toast.LENGTH_SHORT).show();
                }
            }else{
                Toast.makeText(this, "Empty fields!", Toast.LENGTH_SHORT).show();
            }
        });

        binding.signupBtn.setOnClickListener(v -> {
            startActivity(new Intent(this, MainActivity2.class));
        });

    }
}