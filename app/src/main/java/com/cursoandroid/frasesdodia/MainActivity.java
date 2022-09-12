package com.cursoandroid.frasesdodia;

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
                "“Tá pensando o que? Rapadura é doce, mas não é mole, não!” - Yusuke Urameshi (Marco Ribeiro)",
                "\"Tô mais quebrado do que arroz de terceira.\" - Yusuke Urameshi (Marco Ribeiro)",
                "\"Você é grande, mas não é dois; eu sou pequeno, mas não sou metade!\" - Yusuke Urameshi (Marco Ribeiro)",
                "\"Dane-se o mundo, que eu não me chamo Raimundo!\" - Yusuke Urameshi (Marco Ribeiro)",
                "\"Quando a esmola é muita, o santo desconfia.\" - Yusuke Urameshi (Marco Ribeiro)",
                "\"Ah, eu sou mais eu, né?\" - Yusuke Urameshi (Marco Ribeiro)",
                "“Cara feia pra mim é fome, valeu?” - Yusuke Urameshi (Marco Ribeiro)",
                "\"Tô na área, derrubou é pênalti!\" - Yusuke Urameshi (Marco Ribeiro)"
        };
        int numero = new Random().nextInt(8);

        TextView texto = findViewById(R.id.textResultado);
        texto.setText( frases[ numero ] );

    }

}