package com.cursoandroid.somdosbichos;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView cao;
    private ImageView gato;
    private ImageView leao;
    private ImageView macaco;
    private ImageView ovelha;
    private ImageView vaca;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cao = findViewById(R.id.cao);
        gato = findViewById(R.id.gato);
        leao = findViewById(R.id.leao);
        macaco = findViewById(R.id.macaco);
        ovelha = findViewById(R.id.ovelha);
        vaca = findViewById(R.id.vaca);

    }
}
