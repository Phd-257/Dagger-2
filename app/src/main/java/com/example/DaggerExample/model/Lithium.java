package com.example.DaggerExample.model;

import android.util.Log;

import javax.inject.Inject;

public class Lithium {

    @Inject
    public Lithium() {

        Log.i("Dagger Lithium","In Lithium Constructor");
    }

    public void done(){

        Log.i("Dagger Lithium","In Lithium Done()");
    }
}
