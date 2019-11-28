package com.cursoandroid.somdosbichos;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import static com.cursoandroid.somdosbichos.R.raw.*;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView cao;
    private ImageView gato;
    private ImageView leao;
    private ImageView macaco;
    private ImageView ovelha;
    private ImageView vaca;

    private MediaPlayer mplayer;


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

        cao.setOnClickListener(this);
        gato.setOnClickListener(this);
        leao.setOnClickListener(this);
        macaco.setOnClickListener(this);
        ovelha.setOnClickListener(this);
        vaca.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.cao:
                mplayer = MediaPlayer.create(MainActivity.this, R.raw.cao);
                tocarSom();
                break;
            case R.id.gato:
                mplayer = MediaPlayer.create(MainActivity.this, R.raw.gato);
                tocarSom();
                break;
            case R.id.leao:
                mplayer = MediaPlayer.create(MainActivity.this, R.raw.leao);
                tocarSom();
                break;
            case R.id.macaco:
                mplayer = MediaPlayer.create(MainActivity.this, R.raw.macaco);
                tocarSom();
                break;
            case R.id.ovelha:
                mplayer = MediaPlayer.create(MainActivity.this, R.raw.ovelha);
                tocarSom();
                break;
            case R.id.vaca:
                mplayer = MediaPlayer.create(MainActivity.this, R.raw.vaca);
                tocarSom();
                break;
        }

    }

    private void tocarSom() {
        if (mplayer != null){
            mplayer.start();
        }
    }

    @Override
    protected void onDestroy() {
        if (mplayer != null){
            mplayer.release();
            mplayer = null;
        }
        super.onDestroy();
    }
}
