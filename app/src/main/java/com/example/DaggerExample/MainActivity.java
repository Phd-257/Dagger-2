package com.example.DaggerExample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //old method
//        Mobile mobile= new Mobile(new Processor(),new Battery());
//        mobile.run();


        

    }
}