package com.example.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.example.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

       binding.loginBtn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               binding.loginBtn.setText("Login");
           }
       });

       binding.goToGoogleMaps.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               binding.goToNaver.setText("Naver");
           }
       });

       binding.goToNaver.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               binding.goToGoogleMaps.setText("Google");
           }
       });
    }
}
