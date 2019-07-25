package com.example.ciit;

import android.content.Intent;
import android.os.Handler;
import android.print.PrinterId;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;
import android.view.animation.GridLayoutAnimationController;


public class MainActivity extends AppCompatActivity {
    private  static int SPLASH_SCREEN_TIME_OUT = 2000;
    private Toolbar tool;
    private DrawerLayout drawer;
    private NavigationView navigation;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        tool = findViewById(R.id.toolbar);
        setSupportActionBar(tool);


        drawer = findViewById(R.id.drawer);
        navigation = findViewById(R.id.navigate);




        new Handler().postDelayed(new Runnable(){
            @Override
            public void run(){
                Intent i = new Intent(MainActivity.this, Login.class);
                startActivity(i);
                finish();
            }
        },SPLASH_SCREEN_TIME_OUT);


    }


}
