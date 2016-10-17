package com.netforceinfotech.tablayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;


public class MainActivity extends AppCompatActivity {

  /* *************
   Global Variable and every method in the MainActivity can access it


   */


    Toolbar toolBar;

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
         */

         toolBar = (Toolbar) findViewById(R.id.toolBar);
         setSupportActionBar(toolBar);




    }

}
