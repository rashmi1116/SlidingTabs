package com.slidingtabs;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());//contains the number of views
        adapter.addFragment(SectionFragment.newInstance(getResources().getString(R.string.section_content1)),
                getResources().getString(R.string.section_title_sports));
        adapter.addFragment(SectionFragment.newInstance(getResources().getString(R.string.section_content2)),
                getResources().getString(R.string.section_title_technologies));
        adapter.addFragment(SectionFragment.newInstance(getResources().getString(R.string.section_content3)),
                getResources().getString(R.string.section_title_design));
        adapter.addFragment(SectionFragment.newInstance(getResources().getString(R.string.section_content4)),
                getResources().getString(R.string.section_title_politics));
        adapter.addFragment(SectionFragment.newInstance(getResources().getString(R.string.section_content5)),
                getResources().getString(R.string.section_title_movies));


        viewPager.setAdapter(adapter);

    }

}


