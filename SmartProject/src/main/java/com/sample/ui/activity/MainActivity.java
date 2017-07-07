package com.sample.ui.activity;

import android.provider.CalendarContract;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;

import com.sample.ui.fragment.FragmentHome;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.sample.R;
import com.sample.ui.fragment.FragmentA;
import com.sample.ui.fragment.FragmentPersonCenter;
import com.smart.rx.RxBus;

import org.reactivestreams.Subscription;

import eu.long1.spacetablayout.SpaceTabLayout;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {
    private SpaceTabLayout tabLayout;
    private Subscription rxSubscription;
    private CompositeDisposable mCompositeDisposable;
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

    private void registRX() {


    }
    private void initRxBus() {
        Disposable subscribe =
                RxBus.getDefault()
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(new Consumer<String>() {
                            @Override
                            public void accept(String s) throws Exception {
//                                String text = "{ [" + tag + "]:" + s+" }";
//                                Log.d("RxBus”,text);
                            }
                        });
    }

}
