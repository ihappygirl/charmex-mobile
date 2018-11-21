package com.atomicfourtech.charmex_v02.login;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.atomicfourtech.charmex_v02.R;

public class TelaCadastro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cadastro);
        getSupportActionBar().setTitle("Crie sua Conta :)");

    }
}
