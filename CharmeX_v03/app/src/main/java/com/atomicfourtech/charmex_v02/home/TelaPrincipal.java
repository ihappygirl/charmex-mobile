package com.atomicfourtech.charmex_v02.home;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.atomicfourtech.charmex_v02.R;
import com.atomicfourtech.charmex_v02.agendar.FragmentAgendar;
import com.atomicfourtech.charmex_v02.agendar.FragmentMeusAgendamentos;
import com.atomicfourtech.charmex_v02.perfil.FragmentEditarPerfil;
import com.atomicfourtech.charmex_v02.perfil.FragmentMeuPerfil;

public class TelaPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);

        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(navListener);

        getSupportActionBar().setTitle("Inicio");

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    new FragmentInicio()).commit();
        }
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;
                    String title = "";

                    switch (item.getItemId()) {
                        case R.id.nav_home:
                            selectedFragment = new FragmentInicio();
                            title = "Inicio";
                            break;
                        case R.id.nav_favorites:
                            selectedFragment = new FragmentMeusAgendamentos();
                            title = "Meus Agendamentos";
                            break;
                        case R.id.nav_search:
                            selectedFragment = new FragmentMeuPerfil();
                            title = "Meu Perfil";
                            break;

                        default:
                            selectedFragment = new FragmentInicio();
                            title = "Inicio";
                            break;
                    }

                    if (selectedFragment != null) {
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                                selectedFragment).commit();
                        getSupportActionBar().setTitle(title);
                    }

                    return true;
                }
            };


}
