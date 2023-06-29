package com.example.ejercicio12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ActionMenuView;
import android.widget.ArrayAdapter;

import com.example.ejercicio12.databinding.ActivityMenuBinding;

import java.util.ArrayList;
import java.util.List;


public class MenuActivity extends AppCompatActivity {
    private ActivityMenuBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMenuBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        List<String> listaMenu= new ArrayList<>();


        listaMenu.add("Puré de calabacín");
        listaMenu.add("Tortilla de patatas");
        listaMenu.add("Albóndigas de pollo");
        listaMenu.add("Ensalada de tomate");
        listaMenu.add("Leche, pan con aceite y fruta");
        listaMenu.add("Lentejas vegetales");
        listaMenu.add("Croquetas de atún");
        listaMenu.add("Menestra de verduras");
        listaMenu.add("Sardinas al horno");
        listaMenu.add("Leche, pan con aceite y fruta");
        listaMenu.add("Macarrones con verduras");
        listaMenu.add("Pollo a la cerveza");
        listaMenu.add("Sopa juliana");
        listaMenu.add("Corvina al ajillo");
        listaMenu.add("Leche, pan con aceite y fruta");

        ArrayAdapter adpter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listaMenu);
        binding.listView.setAdapter(adpter);
    }
}