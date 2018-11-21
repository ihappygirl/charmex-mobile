package com.atomicfourtech.charmex_v02.outrasactivities;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.atomicfourtech.charmex_v02.R;
import com.atomicfourtech.charmex_v02.login.TelaLogin;

public class TelaSplash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(TelaSplash.this, TelaLogin.class);
                startActivity(i);
                finish();
            }
        }, 3*1000);
    }
}
