package com.meeple.abanovilla;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void bottone00(View view){

    }
    public void bottone01(View view){

    }
    public void bottone02(View view){

    }
    public void bottone10(View view){

    }
    public void bottone11(View view){

    }
    public void bottone12(View view){

    }
    public void bottone20(View view){

    }
    public void bottone21(View view){

    }
    public void bottone22(View view){

    }
}
