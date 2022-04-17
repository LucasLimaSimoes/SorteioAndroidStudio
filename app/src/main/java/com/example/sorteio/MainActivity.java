package com.example.sorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionarBotao(View v){ //funcao pra quando apertar o botao
        int x = new Random().nextInt(10); //x recebe um número aleatorio de 0 a 9
        TextView texto = findViewById(R.id.textoNumero); //atribui a texto o item textoNumero
        texto.setText("Número sorteado: "+x); //atualiza o texto
    }
}