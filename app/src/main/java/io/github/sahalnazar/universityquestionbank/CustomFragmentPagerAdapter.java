package io.github.sahalnazar.universityquestionbank;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import io.github.universityquestionbank.CseFragmentReg13;
import io.github.universityquestionbank.CseFragmentReg17;

public class CustomFragmentPagerAdapter extends FragmentPagerAdapter {

    private static final int RegulationCount = 2;

    public CustomFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {

            case 0:
                return new CseFragmentReg13();

            case 1:
                return new CseFragmentReg17();
        }

        return null;
    }

    @Override
    public int getCount() {
        return RegulationCount;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {

            case 0:
                return "Regulation 2013";

            case 1:
                return "Regulation 2017";
        }
        return null;
    }
}
