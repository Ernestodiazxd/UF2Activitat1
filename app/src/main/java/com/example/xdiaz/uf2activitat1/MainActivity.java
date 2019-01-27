package com.example.xdiaz.uf2activitat1;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.ColorDrawable;
import android.os.CountDownTimer;
import android.support.constraint.Constraints;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView imatge1;
    ImageView imatge2;
    ImageView imatge3;
    ImageView imatge4;
    boolean correcto=false;
    TextView texto;
    ImageView animacio;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imatge1 = (ImageView) findViewById(R.id.Kappa1);
        imatge2 = (ImageView) findViewById(R.id.Kappa2);
        imatge3 = (ImageView) findViewById(R.id.Kappa3);
        imatge4 = (ImageView) findViewById(R.id.Kappa4);
        texto=(TextView) findViewById(R.id.textView);
        animacio=(ImageView)findViewById(R.id.gif);
        AnimationDrawable gif=(AnimationDrawable)animacio.getDrawable();
        gif.start();




    }

    public void onClick1(View v) {
        imatge1.setImageResource(R.mipmap.charander);
        comprovacio(correcto);
        new CountDownTimer(2000, 5000) { // 5000 = 5 sec

            public void onTick(long millisUntilFinished) {
            }

            public void onFinish() {
                imatge1.setImageResource(R.mipmap.kappa);
                texto.setText(R.string.frase);
                texto.setTextColor(Color.BLACK);
            }
        }.start();

    }

    public void onClick2(View v) {
        imatge2.setImageResource(R.mipmap.caballito);
        comprovacio(correcto);
        new CountDownTimer(2000, 5000) { // 5000 = 5 sec

            public void onTick(long millisUntilFinished) {
            }

            public void onFinish() {
                imatge2.setImageResource(R.mipmap.kappa);
                texto.setText(R.string.frase);
                texto.setTextColor(Color.BLACK);
            }
        }.start();

    }

    public void onClick3(View v) {
        imatge3.setImageResource(R.mipmap.theway);
        correcto=true;
        comprovacio(correcto);
        Animation animacioCorrecte=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.animacio);
        imatge3.startAnimation(animacioCorrecte);

    }

    public void onClick4(View v) {
        imatge4.setImageResource(R.mipmap.solaire);
        comprovacio(correcto);
        new CountDownTimer(2000, 5000) { // 5000 = 5 sec

            public void onTick(long millisUntilFinished) {
            }

            public void onFinish() {
                imatge4.setImageResource(R.mipmap.kappa);
                texto.setText(R.string.frase);
                texto.setTextColor(Color.BLACK);
            }
        }.start();
    }


    public void comprovacio(boolean correcto){
      if (correcto==false){
        texto.setText(R.string.malament);
        texto.setTextColor(Color.RED);


      } else {
          texto.setText(R.string.correcte);
          texto.setTextColor(Color.GREEN);
          imatge1.setEnabled(false);
          imatge2.setEnabled(false);
          imatge4.setEnabled(false);

      }

    }


}
