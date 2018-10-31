package com.meeple.abanovilla;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

/**
 * ACTIVITY 1
 * IN QUESTA CLASSE ESEGUO IL CARICAMENTO DEI DATI DAL FILE XML E TERMINATO AVVIO AUTOMATICAMENTE LA SCHERMATA DI INIZIO, OVVERO HOME
* */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Handler mHandler = new Handler();
        mHandler.postDelayed(new Runnable() {

            @Override
            public void run() {
                Intent intent = new Intent(getApplicationContext(),Home.class);
                //PASSAGGIO PARAMETRI
                startActivity(intent);
                finish();
            }

        }, 1000L);
    }
}
