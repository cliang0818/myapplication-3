package com.example.raymond.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.util.Log;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private static final String TAG_NAV ="Navigation";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        //Sets the toolbar as the actionbar
        setSupportActionBar(toolbar);
        Log.e(TAG_NAV, "Toolbar set");

        //Toolbar activities
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        //Enables Toolbar to be seen in other activities
        toggle.syncState();
        //Declaring a listener for the navigation view
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }
        //If drawer is open and the back button is pressed, drawer is then closed.
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
        Log.e(TAG_NAV, "Back pressed");
    }



    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        //Switch case to go between activities
        switch (id) {
            case R.id.course:
                Intent intent = new Intent(MainActivity.this, CourseList.class);
                startActivityForResult(intent, 0);
                Log.e(TAG_NAV, "CourseList initiated");
                break;

            case R.id.usecases:
                Intent intent2 = new Intent(MainActivity.this, usecases.class);
                startActivityForResult(intent2,0);
                Log.e(TAG_NAV, "usecases intiated");
                break;
            case R.id.designthinking:
                Intent intent3 = new Intent(MainActivity.this, designthinking.class);
                startActivityForResult(intent3,0);
                Log.e(TAG_NAV, "design thinking initiated");
                break;
            case R.id.agilescrum:
                Intent intent4 = new Intent(MainActivity.this, agilescrum.class);
                startActivityForResult(intent4,0);
                Log.e(TAG_NAV, "agile scrum initiated");
                break;
            case R.id.quiz:
                Intent intent5 = new Intent(MainActivity.this, QuizActivity.class);
                startActivityForResult(intent5, 0);
                Log.e(TAG_NAV, "Quiz Activity Initiated");
                break;
            default:
                Intent intent6 = new Intent(MainActivity.this, MainActivity.class);
                startActivityForResult(intent6, 0);
                Log.e(TAG_NAV, "Home Page");
                break;

        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
