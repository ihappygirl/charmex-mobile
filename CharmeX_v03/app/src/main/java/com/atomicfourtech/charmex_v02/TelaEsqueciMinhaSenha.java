package com.atomicfourtech.charmex_v02;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class TelaEsqueciMinhaSenha extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_esqueci_minha_senha);
        getSupportActionBar().setTitle("Esqueci Minha Senha :(");
    }
}

