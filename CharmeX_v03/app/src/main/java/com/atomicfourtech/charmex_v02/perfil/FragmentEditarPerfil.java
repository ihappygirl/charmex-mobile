package com.atomicfourtech.charmex_v02.perfil;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.atomicfourtech.charmex_v02.R;

public class FragmentEditarPerfil extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_meu_perfil_editar, container, false);

        FloatingActionButton fabEditarPerfil = (FloatingActionButton) view.findViewById(R.id.fabSalvar);
        fabEditarPerfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                voltarParaPerfilSalvo();
            }
        });

        return view;

    }

    //retorna pra FragmentMeuPerfil
    private void voltarParaPerfilSalvo() {
        Fragment childFragment = new FragmentMeuPerfil();
        FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
        transaction.replace(R.id.child_fragment_container, childFragment).commit();

    }
}


