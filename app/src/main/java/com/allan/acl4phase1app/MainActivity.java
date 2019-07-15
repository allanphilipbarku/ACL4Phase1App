package com.allan.acl4phase1app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button aboutACL = findViewById(R.id.button_acl);
        Button myProfile = findViewById(R.id.my_profile);

        aboutACL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent aboutPage = new Intent(MainActivity.this, AboutACL4.class);
                startActivity(aboutPage);
            }
        });

        myProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myProfile = new Intent(MainActivity.this, MyProfile.class);
                startActivity(myProfile);
            }
        });
    }
}
