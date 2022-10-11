package com.example.descomplica.descomplicaaula02classer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvMensagem = findViewById(R.id.mensagem);
        tvMensagem.setText("Ola você esta acessando o texto usando a classe R");

    }
}