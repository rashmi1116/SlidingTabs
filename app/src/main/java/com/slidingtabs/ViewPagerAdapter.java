package com.slidingtabs;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rashmi.ramesh on 13-12-2017.
 */

class ViewPagerAdapter extends FragmentPagerAdapter {
    private final List<Fragment> fragmentList = new ArrayList<>();//CONTAINS THE FRAGMENTS AS A LIST
    private final List<String> fragmentTitleList = new ArrayList<>();//CONTAINS THE FRAGMENT TITLE AS A LIST

    ViewPagerAdapter(FragmentManager manager) {
        super(manager);//MUST USE THIS AS IT AS A SUPER CLASS CONTAINS SOME DEFAULT PROPERTIES
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);//current position of tab start from 0 first tab
    }

    @Override
    public int getCount() {
        return fragmentList.size();//here the size is 3
    }

    void addFragment(Fragment fragment, String title) {
        fragmentList.add(fragment);//adds the fragment
        fragmentTitleList.add(title);//adds the title for respective fragment
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return fragmentTitleList.get(position);
    }
}

