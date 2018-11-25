package com.atomicfourtech.charmex_v02.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.atomicfourtech.charmex_v02.perfil.FragmentInfoEmpresa;
import com.atomicfourtech.charmex_v02.perfil.FragmentPromocoesEmpresa;
import com.atomicfourtech.charmex_v02.perfil.FragmentServicoEmpresa;

public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                FragmentServicoEmpresa tab1 = new FragmentServicoEmpresa();
                return tab1;
            case 1:
                FragmentPromocoesEmpresa tab2 = new FragmentPromocoesEmpresa();
                return tab2;
            case 2:
                FragmentInfoEmpresa tab3 = new FragmentInfoEmpresa();
                return tab3;
            default:
                return null;

        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
