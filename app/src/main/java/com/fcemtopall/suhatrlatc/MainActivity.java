package com.fcemtopall.suhatrlatc;

import android.os.Bundle;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BeginActivity beginActivity = new BeginActivity();

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.add(R.id.beginFragment,beginActivity,"");

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawer,toolbar,
                R.string.navigation_drawer_open,R.string.navigation_drawer_close);


        drawer.addDrawerListener(toggle);
        toggle.syncState();






    }

    @Override
    public void onBackPressed() {

    if (drawer.isDrawerOpen(GravityCompat.START)){
        drawer.closeDrawer(GravityCompat.START);
    }else{
        super.onBackPressed();
    }

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){

            case R.id.water:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new WaterFragment()).commit();
                break;
            case R.id.eat:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new EatFragment()).commit();
                break;
            case R.id.work:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new WorkFragment()).commit();
                break;
            case R.id.sport:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new SportFragment()).commit();
                break;
            case R.id.message:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new DarlingFragment()).commit();
                break;
            case R.id.dailyCalendar:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new DailyCalendarFragment()).commit();
                break;
            case R.id.weeklyCalendar:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new WeeklyCalendarFragment()).commit();
                break;
            case R.id.monthlyCalendar:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new MonthlyCalendarFragment()).commit();
                break;
            case R.id.yearlyCalendar:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new YearlyCalendarFragment()).commit();
                break;
            case R.id.settings:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new SettingsFragment()).commit();
                break;
        }

        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}