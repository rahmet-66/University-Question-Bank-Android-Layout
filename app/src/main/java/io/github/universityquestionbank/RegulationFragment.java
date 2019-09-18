package io.github.universityquestionbank;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nic.annauniversity2marks.R;

import io.github.sahalnazar.universityquestionbank.CustomFragmentPagerAdapter;

public class RegulationFragment extends Fragment {

    public RegulationFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.regulation_pager, container, false);

        TabLayout tabLayout = view.findViewById(R.id.regulation_tab);
        ViewPager viewPager = view.findViewById(R.id.regulation_view_pager);

        viewPager.setAdapter(new CustomFragmentPagerAdapter(getChildFragmentManager()));
        tabLayout.setupWithViewPager(viewPager);

        return view;
    }
}
