package com.example.ciit;

import android.Manifest;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationManager;
import android.os.Handler;
import android.os.Message;
import android.provider.Settings;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.ActivityCompat;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;
import android.view.animation.GridLayoutAnimationController;

import java.util.ArrayList;
import java.util.List;

public class Home extends AppCompatActivity {
    android.widget.SearchView searchView;
    TextView loc;
    Context mContext;
    int keycode;
    KeyEvent event;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        final DrawerLayout drawer;
        NavigationView navigation;
        ActionBarDrawerToggle actionBarDrawerToggle;
        CardView card;
        final RecyclerView rec;
        AppLocationService appLocationService;
        PopupMenu popupMenu;
        searchView = (SearchView) findViewById(R.id.searchv);
        searchView.setIconifiedByDefault(true);

        Toolbar toolbar =(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        drawer = findViewById(R.id.drawer);
        navigation = findViewById(R.id.navigate);
        card = findViewById(R.id.cardView);
        rec = findViewById(R.id.recview);
        loc = findViewById(R.id.loc);

        appLocationService = new AppLocationService(Home.this);
        Location location = appLocationService.getLocation();
        if (location != null) {
            double latitude = location.getLatitude();
            double longitude = location.getLongitude();
            LocationAddress locationAddress = new LocationAddress();
            locationAddress.getAddressFromLocation(latitude, longitude, getApplicationContext(), new GeocoderHandler());
        }

         actionBarDrawerToggle = new ActionBarDrawerToggle(this,drawer,toolbar,R.string.drawer_open,R.string.drawer_close);
        drawer.addDrawerListener(actionBarDrawerToggle);


        navigation.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {


                switch (menuItem.getItemId()){
                    case R.id.view_patient:
                        menuItem.setChecked(true);
                        Intent in = new Intent(Home.this, viewPatients.class);
                        startActivity(in);
                        drawer.closeDrawers();
                        menuItem.setChecked(false);
                        return true;
                    case R.id.add_patient:
                        menuItem.setChecked(true);
                        Intent a = new Intent(Home.this, Add.class);
                        startActivity(a);
                        drawer.closeDrawers();
                        menuItem.setChecked(false);
                        return true;

                    case R.id.view_evaluator:
                        menuItem.setChecked(true);
                        Intent i = new Intent(Home.this, evaluator_page.class);
                        startActivity(i);
                        drawer.closeDrawers();
                        menuItem.setChecked(false);
                        return true;
                    case R.id.add_evaluator:
                        menuItem.setChecked(true);
                        Intent b = new Intent(Home.this, Add_Evaluator.class);
                        startActivity(b);
                        drawer.closeDrawers();
                        menuItem.setChecked(false);
                        return true;

                    case R.id.hospital_report:
                        menuItem.setChecked(true);
                        Intent k = new Intent(Home.this, Hospital_Report.class);
                        startActivity(k);
                        drawer.closeDrawers();
                        menuItem.setChecked(false);
                        return true;
                    case R.id.patient_report:
                        menuItem.setChecked(true);
                        Intent q = new Intent(Home.this, Patient_Report.class);
                        startActivity(q);
                        drawer.closeDrawers();
                        menuItem.setChecked(false);
                        return true;
                    case R.id.visit_report:
                        menuItem.setChecked(true);
                        Intent p = new Intent(Home.this, Visit_Report.class);
                        startActivity(p);
                        drawer.closeDrawers();
                        menuItem.setChecked(false);
                        return true;


                    case R.id.hospital:
                        menuItem.setChecked(true);
                        Intent j = new Intent(Home.this, Hospital.class);
                        startActivity(j);
                        drawer.closeDrawers();
                        menuItem.setChecked(false);
                        return true;


                    case R.id.account_info:
                        menuItem.setChecked(true);
                        Intent l= new Intent(Home.this, AccountInformation.class);
                        startActivity(l);
                        drawer.closeDrawers();
                        menuItem.setChecked(false);
                        return true;
                    case R.id.sys_logout:
                        menuItem.setChecked(true);
                        Intent g= new Intent(Home.this, Login.class);
                        startActivity(g);
                        drawer.closeDrawers();
                        menuItem.setChecked(false);
                        return true;

                }


                return false;
            }
        });

        List<Recycle_view_data> data = fill_with_data();

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recview);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2 ));
        Recycler_View_Adapter adapter = new Recycler_View_Adapter(data, getApplication(),Home.this);
        recyclerView.setAdapter(adapter);

        searchView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                searchView.setIconified(false);
                ///searchView.onActionViewExpanded();
                InputMethodManager im = ((InputMethodManager) getSystemService(INPUT_METHOD_SERVICE));
                im.showSoftInput(searchView, 0);

            }

        });



    }
    @Override
    protected void onResume() {
        super.onResume();

        searchView.setQuery("", false);
        searchView.onActionViewCollapsed();
        searchView.clearFocus();
    }

    public List<Recycle_view_data> fill_with_data() {

        List<Recycle_view_data> data = new ArrayList<>();

        data.add(new Recycle_view_data("Patients", R.drawable.patient));
        data.add(new Recycle_view_data("Evaluator", R.drawable.evaluator ));
        data.add(new Recycle_view_data("Hospital", R.drawable.hospital));
        data.add(new Recycle_view_data("My Account", R.drawable.my_account));
        data.add(new Recycle_view_data("Reports", R.drawable.report));
        data.add(new Recycle_view_data("Near By", R.drawable.maps));
        data.add(new Recycle_view_data("Rotarians", R.drawable.rotarian));
        data.add(new Recycle_view_data("Refer", R.drawable.refer));
        data.add(new Recycle_view_data("Events", R.drawable.events));
        data.add(new Recycle_view_data("Parents", R.drawable.parents));
        return data;
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState){
        ActionBarDrawerToggle actionBarDrawerToggle;
        final DrawerLayout drawer;
        drawer = findViewById(R.id.drawer);
        Toolbar toolbar =(Toolbar)findViewById(R.id.toolbar);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this,drawer,toolbar,R.string.drawer_open,R.string.drawer_close);

        super.onPostCreate(savedInstanceState);
        actionBarDrawerToggle.syncState();
    }


    private void display_Message(String message){
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();
    }


    private class GeocoderHandler extends Handler {
        @Override
        public void handleMessage(Message message) {
            String locationAddress;
            switch (message.what) {
                case 1:
                    Bundle bundle = message.getData();
                    locationAddress = bundle.getString("address");
                    break;
                default:
                    locationAddress = null;
            }
            loc.setText(locationAddress);
        }
    }

}
