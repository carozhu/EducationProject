package edu.simple.ui.activity;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import edu.simple.R;
import edu.simple.ui.fragment.FragmentA;
import edu.simple.ui.fragment.FragmentHome;
import edu.simple.ui.fragment.FragmentPersonCenter;
import eu.long1.spacetablayout.SpaceTabLayout;

public class MainActivity extends AppCompatActivity {
    private  SpaceTabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //add the fragments you want to display in a List
        List<Fragment> fragmentList = new ArrayList<>();
        fragmentList.add(new FragmentA());
        fragmentList.add(new FragmentHome());
        fragmentList.add(new FragmentPersonCenter());

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);
        tabLayout = (SpaceTabLayout) findViewById(R.id.spaceTabLayout);
        //we need the savedInstanceState to retrieve the position
        tabLayout.initialize(viewPager, getSupportFragmentManager(), fragmentList, savedInstanceState);
    }
}
