package com.brab.frases_do_dia;

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


    public void gerarNovaFrase(View view){

        String[] frases = {
                "Não é a linguagem de programação que define o programador, mas sim sua lógica.",
                "Faça como um programador. Quando tudo está errado e confuso, apague tudo e recomece do zero.",
                "Linguagens não morrem mas sim seus programadores.",
                "Imagine um programador de software com idéias pré-estabelecidas... Ele Cria o ambiente, as personagens e a estória, já está com tudo imaginado e pronto, e insere você nisso como um de seus personagens curiosos........",
                "Programador: É simples, pode ser composto. Se firma no concreto e torna-se, abstrato.",
                "Mesmo que eu seja um programador, na vida, não acredito em lógica condicional. Mesmo conseguindo escrever o algoritmo, jamais conseguiremos executá-lo e explorar os dois argumentos, pois o tempo não retrocede.\n" +
                        "\n" +
                        "Abdiel Leal",
                "Faça da sua vida mais \"Responsivo\"\n" +
                        "- Dica para Programadores de Sistemas."
        };

        int numero = new Random().nextInt(4);

            TextView texto = findViewById(R.id.textResultado);
            texto.setText(frases[numero]);
        }

}