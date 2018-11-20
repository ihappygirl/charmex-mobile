package com.atomicfourtech.charmex_v02;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class TelaLogin extends AppCompatActivity {

    Button btnLogin;
    Button btnCadastreSe;
    Button btnEsqueciSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_login);

        btnLogin = (Button) findViewById(R.id.btnEntrar);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), TelaPrincipal.class);
                view.getContext().startActivity(intent);}
        });

        btnEsqueciSenha = (Button) findViewById(R.id.btnTelaEsqueciSenha);
        btnEsqueciSenha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), TelaEsqueciMinhaSenha.class);
                view.getContext().startActivity(intent);}
        });

        btnCadastreSe = (Button) findViewById(R.id.btnCadastro);
        btnCadastreSe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), TelaCadastro.class);
                view.getContext().startActivity(intent);}
        });

    }
}
