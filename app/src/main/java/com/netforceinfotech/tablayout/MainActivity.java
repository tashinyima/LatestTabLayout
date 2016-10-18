package com.netforceinfotech.tablayout;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

  /**************
   * Global Variable and every method in the MainActivity can access it
   *
   *
   */

    Toolbar toolBar;
    TabLayout tabLayout;
    ViewPager viewPager;
    ViewPagerAdapter viewPagerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Steps involved in creating TabLayout with VieWPager

        //   Create ToolBar and Remove the ActionBar

        /***************************
         * Add toolbar custom layout in the layout folder.
         * change ActionBar to NoActionBar in the style
         * include the toolBar in the main XML layout or respective layout
         *
         * Create Variable for the toolBar
         * set the variable for the Support Action Bar
         *
         * Create TabLayout and ViewPager Variables and initialise them
         */

         toolBar = (Toolbar) findViewById(R.id.toolBar);
         setSupportActionBar(toolBar);
         getSupportActionBar().setDisplayShowTitleEnabled(false);


        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        viewPager = (ViewPager) findViewById(R.id.viewPager);

        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());

        viewPagerAdapter.addFragments( new HomeFragment(),"Home");
        viewPagerAdapter.addFragments( new TopFreeFragment(),"Top Free");
        viewPagerAdapter.addFragments( new TopPaidFragment(),"To Paid");
        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);



    }

}
