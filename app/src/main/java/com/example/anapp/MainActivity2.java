package com.example.anapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.anapp.databinding.ActivityMain2Binding;
import com.example.anapp.databinding.ActivityMain3Binding;
import com.google.android.material.button.MaterialButton;

public class MainActivity2 extends AppCompatActivity {
    ActivityMain2Binding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.loginBtn.setOnClickListener(v->{
            startActivity(new Intent(this,MainActivity.class));
        });

        binding.signupBtn.setOnClickListener(v->{
            if (!binding.emailET.getText().toString().equals("") && !binding.passwordET.getText().toString().equals("")) {
                AnApp.putString("email",binding.emailET.getText().toString());
                AnApp.putString("password",binding.passwordET.getText().toString());

                Toast.makeText(this, "Account created successfully", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(this,MainActivity.class));
                finish();
            }else{
                Toast.makeText(this, "Please enter email and password to create an account", Toast.LENGTH_SHORT).show();
            }

        });
    }
}