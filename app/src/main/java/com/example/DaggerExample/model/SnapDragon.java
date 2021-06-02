package com.example.DaggerExample.model;

import android.util.Log;

import javax.inject.Inject;

public class SnapDragon implements Processor {

    
    public SnapDragon() {

        Log.i("Dagger SnapDragon", "in SnapDragon");

    }


    @Inject
    @Override
    public void run() {
        Log.i("Dagger SnapDragon", "Run as SnapDragon");
    }
}
