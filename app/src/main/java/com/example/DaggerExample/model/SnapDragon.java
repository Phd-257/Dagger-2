package com.example.DaggerExample.model;

import android.util.Log;

import javax.inject.Inject;

public class SnapDragon implements Processor {

    int clockSpeed;


    @Inject
    public SnapDragon(int clockSpeed) {

        this.clockSpeed=clockSpeed;

        Log.i("Dagger SnapDragon", "in SnapDragon "+clockSpeed);

    }


    @Inject
    @Override
    public void start() {
        Log.i("Dagger SnapDragon", "Run as SnapDragon"+clockSpeed);
    }
}
