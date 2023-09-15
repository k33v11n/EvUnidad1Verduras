package com.example.verdurass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class resultado extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        double resultado = getIntent().getDoubleExtra("result", 0.0);

        TextView textViewResultado = findViewById(R.id.txtresult);
        textViewResultado.setText(String.valueOf(resultado));

        Button btnvolver = findViewById(R.id.btnvolver);
        btnvolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(resultado.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}