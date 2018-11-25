package com.atomicfourtech.charmex_v02.outrasactivities;

import android.os.Bundle;
import android.support.annotation.Nullable;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.atomicfourtech.charmex_v02.R;

public class ListarProfissionais extends Fragment {


    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_tela_lista_empresas, container, false);

        return v;

    }
}
