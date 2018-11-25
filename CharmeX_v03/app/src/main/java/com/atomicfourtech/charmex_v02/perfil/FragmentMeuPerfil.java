package com.atomicfourtech.charmex_v02.perfil;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.atomicfourtech.charmex_v02.R;
import com.atomicfourtech.charmex_v02.login.TelaCadastro;


public class FragmentMeuPerfil extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_meu_perfil, container, false);


        //evento do fabEditar
        final FloatingActionButton fabEditarPerfil = view.findViewById(R.id.fabEditar);
        fabEditarPerfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irParaEditarPerfil(fabEditarPerfil);
            }
        });

        return view;

    }

    //muda do FragmentMeuPerfil para o FragmentEditarPerfil e muda o icone do FloatingActionButton
    private void irParaEditarPerfil(FloatingActionButton fabEditarPerfil) {
        Fragment childFragment = new FragmentEditarPerfil();
        FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
        transaction.replace(R.id.container_fragment_editar_perfil, childFragment).commit();
        fabEditarPerfil.setImageResource(R.drawable.ic_check_black_24dp);
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("Editar Perfil");
    }
}
