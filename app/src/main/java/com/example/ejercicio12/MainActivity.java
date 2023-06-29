package com.example.ejercicio12;



import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ejercicio12.databinding.ActivityMainBinding;


    public class MainActivity extends AppCompatActivity {
        private ActivityMainBinding binding;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            binding = ActivityMainBinding.inflate(getLayoutInflater());
            setContentView(binding.getRoot());


            binding.button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent( MainActivity.this, MenuActivity.class);
                    startActivity(intent);
                }
            });
        }


    }
