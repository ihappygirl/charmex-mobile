package com.atomicfourtech.charmex_v02.home;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.atomicfourtech.charmex_v02.R;
import com.atomicfourtech.charmex_v02.outrasactivities.ListarProfissionais;


public class FragmentInicio extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        ImageButton btnZonaNorte = view.findViewById(R.id.imgBtnZonaNorte);
        ImageButton btnZonaSul = view.findViewById(R.id.imgBtnZonaSul);
        ImageButton btnZonaLeste = view.findViewById(R.id.imgBtnZonaLeste);
        ImageButton btnZonaOeste = view.findViewById(R.id.imgBtnZonaOeste);
        ImageButton btnCentro = view.findViewById(R.id.imgBtnCentro);

        btnZonaNorte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listarZonaNorte();
            }
        });

        btnZonaSul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listarZonaSul();
            }
        });

        btnZonaLeste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listarZonaLeste();
            }
        });

        btnZonaOeste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listarZonaOeste();
            }
        });

        btnCentro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listarCentro();
            }
        });

        return view;

    }

    private void listarZonaNorte() {
        Fragment childFragment = new ListarProfissionais();
        FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
        transaction.replace(R.id.container_listar_profissionais, childFragment).commit();
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("Profissionais da Zona Norte");
    }

    private void listarZonaSul() {
        Fragment childFragment = new ListarProfissionais();
        FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
        transaction.replace(R.id.container_listar_profissionais, childFragment).commit();
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("Profissionais da Zona Sul");
    }

    private void listarZonaLeste() {
        Fragment childFragment = new ListarProfissionais();
        FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
        transaction.replace(R.id.container_listar_profissionais, childFragment).commit();
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("Profissionais da Zona Leste");
    }

    private void listarZonaOeste(){
        Fragment childFragment = new ListarProfissionais();
        FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
        transaction.replace(R.id.container_listar_profissionais, childFragment).commit();
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("Profissionais da Zona Oeste");
    }

    private void listarCentro(){
        Fragment childFragment = new ListarProfissionais();
        FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
        transaction.replace(R.id.container_listar_profissionais, childFragment).commit();
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("Profissionais do Centro");
    }

}
