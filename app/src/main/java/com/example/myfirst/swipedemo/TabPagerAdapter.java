package com.example.myfirst.swipedemo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by bridgelabz3 on 19/12/15.
 */
public class TabPagerAdapter extends FragmentPagerAdapter
{
    public TabPagerAdapter(FragmentManager fm)
    {
        super(fm);
    }
    Fragment f1;

    @Override
    public Fragment getItem(int i) {
        switch (i) {
            case 0:
                return new Android();
            case 1:
                return new Ios();
            case 2:
                return new Windows();
            //case 3:
                //return new Pick();
                //return f1;
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
