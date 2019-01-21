package com.example.xdiaz.uf2activitat1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imatge1 = (ImageView) findViewById(R.id.Kappa1);
    ImageView imatge2 = (ImageView) findViewById(R.id.Kappa2);
    ImageView imatge3 = (ImageView) findViewById(R.id.Kappa3);
    ImageView imatge4 = (ImageView) findViewById(R.id.Kappa4);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void onClick1(View v) {
        imatge1.setImageResource(R.mipmap.charander);

    }

    public void onClick2(View v) {
        imatge2.setImageResource(R.mipmap.caballito);

    }

    public void onClick3(View v) {
        imatge3.setImageResource(R.mipmap.theway);
    }

    public void onClick4(View v) {
        imatge4.setImageResource(R.mipmap.solaire);

    }
}
