package com.example.gymworkout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

import java.io.File;

public class DashboardActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ImageView absButton, backButton,bicepsButton,calfButton,chestButton,forearmsButton,legsButton,shoulderButton,tricepsButton,cardioButton;
    Toolbar toolbar;
private long backPressTime;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        absButton= findViewById(R.id.absButton);
        backButton= findViewById(R.id.backButton);
        bicepsButton= findViewById(R.id.bicepsButton);
        calfButton= findViewById(R.id.calfButton);
        chestButton= findViewById(R.id.chestButton);

        forearmsButton= findViewById(R.id.forearmsButton);
        legsButton= findViewById(R.id.legsButton);
        shoulderButton= findViewById(R.id.shoulderButton);
        tricepsButton= findViewById(R.id.tricepsButton);
        cardioButton= findViewById(R.id.cardioButton);
        toolbar=findViewById(R.id.toolbar);
        drawerLayout=findViewById(R.id.drawerlayout);
        navigationView=findViewById(R.id.navigationView);



       legsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DashboardActivity.this,LegsActivity.class));
            }
        }); chestButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DashboardActivity.this,ChestActivity.class));
            }
        });

       cardioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DashboardActivity.this,CardioActivity.class));
            }
        });

       bicepsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DashboardActivity.this,BicepsActivity.class));
            }
        });

        tricepsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DashboardActivity.this,TricepsActivity.class));
            }
        });
        calfButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DashboardActivity.this,CalfActivity.class));
            }
        });
        forearmsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DashboardActivity.this,ForeArmsActivity.class));
            }
        });
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DashboardActivity.this,BackActivity.class));
            }
        });
        shoulderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               startActivity(new Intent(DashboardActivity.this,ShoulderActivity.class));
            }
        });
        absButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DashboardActivity.this,AbsActivity.class));
            }
        });

        setSupportActionBar(toolbar);


        ActionBarDrawerToggle actionBarDrawerToggle=new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open,R.string.close);

        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override

            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId())
                {
                    case R.id.excersize:
                        Intent intent = new Intent(DashboardActivity.this,DashboardActivity.class);
                        startActivities(intent);
                        Toast.makeText(DashboardActivity.this, "excersize", Toast.LENGTH_SHORT).show();
                        drawerLayout.closeDrawer(GravityCompat.START);

                        break;
                    case R.id.workout:
                        Toast.makeText(DashboardActivity.this, "excrsizeq", Toast.LENGTH_SHORT).show();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.setting:
                        Toast.makeText(DashboardActivity.this, "excrsize", Toast.LENGTH_SHORT).show();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.sharewith:
                        ApplicationInfo applicationInfo=getApplicationContext().getApplicationInfo();
                        String  apkpath=applicationInfo.sourceDir;
                        Intent intent1=new Intent(Intent.ACTION_SEND);
                        intent1.setType("application/vnd.android.package-achive");
                        intent1.putExtra(Intent.EXTRA_STREAM, Uri.fromFile(new File(apkpath)));
                        startActivity(Intent.createChooser(intent1, "Sharevia"));
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.exit:
                        AlertDialog.Builder alert=new AlertDialog.Builder(DashboardActivity.this);
                        // Setting Alert Dialog Title
                        alert.setTitle("Confirm Exit..!!!");
                        alert.setMessage("Sure You wants to exit");

                        alert.setPositiveButton("yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finishAffinity();
                            }
                        });
                        alert.setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                            }
                        });
                        alert.show();



                        

                        
                       
                        

                }


                return true;
            }

            private void startActivities(Intent intent) {
            }
        });








    }

    @Override
    public void onBackPressed() {

        if(backPressTime + 2000 >System.currentTimeMillis())
        {//for double click to exit
            super.onBackPressed();
            return;
        }
        else {
            Toast.makeText(this, "press back again to exit ", Toast.LENGTH_SHORT).show();
        }

        backPressTime=System.currentTimeMillis();
    }
}