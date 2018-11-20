package com.atomicfourtech.charmex_v02;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.ListMenuItemView;
import android.view.MenuItem;

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
                        // change icon to arrow drawable
                        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_chevron_left);
                    }

                    return true;
                }
            };

}