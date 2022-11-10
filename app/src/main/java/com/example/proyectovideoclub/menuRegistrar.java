package com.example.proyectovideoclub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class menuRegistrar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_registrar);
    }

    public void  activityMain (View view){


        Intent activity_main = new Intent (this, MainActivity.class);


        startActivity(activity_main);

        finish();

    }
}