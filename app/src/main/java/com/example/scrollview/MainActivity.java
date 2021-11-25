package com.example.scrollview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void cereza(View view) {
        Toast.makeText(this, "Cereza", Toast.LENGTH_SHORT).show();
    }

    public void mango(View view) {
        Toast.makeText(this, "mango", Toast.LENGTH_SHORT).show();
    }

    public void manzana(View view) {
        Toast.makeText(this, "manzana", Toast.LENGTH_SHORT).show();
    }

    public void materna(View view) {
        Toast.makeText(this, "materna", Toast.LENGTH_SHORT).show();
    }

    public void melocoton(View view) {
        Toast.makeText(this, "melocoton", Toast.LENGTH_SHORT).show();
    }

    public void naranja(View view) {
        Toast.makeText(this, "naranja", Toast.LENGTH_SHORT).show();
    }

    public void pera(View view) {
        Toast.makeText(this, "pera", Toast.LENGTH_SHORT).show();
    }

    public void pina(View view) {
        Toast.makeText(this, "pina", Toast.LENGTH_SHORT).show();
    }
}