package com.example.belajarandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.google.android.material.tabs.TabLayout;

public class TabsActivity extends AppCompatActivity {

    TabLayout tabLayout;
    FrameLayout frameLayout;
    CardView videoSatu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabs);
        if(getSupportActionBar() != null){
            getSupportActionBar().hide();
        }
        tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        frameLayout = (FrameLayout) findViewById(R.id.frame);


        getSupportFragmentManager().beginTransaction().replace(R.id.frame, new TabFragment1())
                .addToBackStack(null)
                .commit();

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                Fragment fragment = null;
                switch (tab.getPosition()){
                    case 0:
                        fragment = new TabFragment1();
                        break;
                    case 1:
                        fragment = new TabFragment2();
                        break;
                    case 2:
                        fragment = new TabFragment3();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.frame,fragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit();

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

        public boolean onCreateOptionsMenu(Menu menu) {
            getMenuInflater().inflate(R.menu.menu_main, menu);
            return true;
        }

        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            int id = item.getItemId();
            if (id == R.id.action_settings) {
                return true;
            }
            return super.onOptionsItemSelected(item);
        }
}