package com.example.DaggerExample.model;

import android.util.Log;

import javax.inject.Inject;

public class Charger {


    @Inject
    public Charger() {
        Log.i("Dagger Charger","In charger Constructor");
    }



    public void setCharger(Mobile mobile){

        Log.i("Dagger Charger","Charger has been set");

    }
}
