package com.atomicfourtech.charmex_v02.perfil;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.atomicfourtech.charmex_v02.R;
import com.atomicfourtech.charmex_v02.adapters.PagerAdapter;
import com.atomicfourtech.charmex_v02.agendar.FragmentAgendar;

public class FragmentPerfilProfissional extends Fragment {

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.fragment_tela_perfil_empresa, container, false);
            ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("Perfil do Profissional");

            //evento do fabAgendar
            final FloatingActionButton fabAgendar = view.findViewById(R.id.fabAgendar);
            fabAgendar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    irParaTelaAgendar(fabAgendar);
                }
            });

            TabLayout tabLayout = view.findViewById(R.id.tab_layout);
            tabLayout.addTab(tabLayout.newTab().setText("Serviços"));
            tabLayout.addTab(tabLayout.newTab().setText("Promoções"));
            tabLayout.addTab(tabLayout.newTab().setText("Informações"));
            tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

            final ViewPager viewPager = view.findViewById(R.id.view_pager);
            final PagerAdapter adapter = new PagerAdapter
                    (getChildFragmentManager(), tabLayout.getTabCount());
            viewPager.setAdapter(adapter);
            viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
            tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
                @Override
                public void onTabSelected(TabLayout.Tab tab) {
                    viewPager.setCurrentItem(tab.getPosition());
                }

                @Override
                public void onTabUnselected(TabLayout.Tab tab) {

                }

                @Override
                public void onTabReselected(TabLayout.Tab tab) {

                }
            });

            return view;
        }


        //muda do FragmentPerfilProfissional para o FragmentAgendar e esconde o icone do FloatingActionButton
        private void irParaTelaAgendar(FloatingActionButton fabAgendar) {
            Fragment childFragment = new FragmentAgendar();
            FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
            transaction.replace(R.id.container_fragment_agendar, childFragment).commit();
            fabAgendar.hide();
            ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("Agendar Horário");

        }

}

