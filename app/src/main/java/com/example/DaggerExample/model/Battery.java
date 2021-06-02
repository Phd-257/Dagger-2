package com.example.DaggerExample.model;

import android.util.Log;

import javax.inject.Inject;

public class Battery {

    Cobalt cobalt;
    Lithium lithium;

    public Battery(Cobalt cobalt, Lithium lithium) {
        this.cobalt = cobalt;
        this.lithium = lithium;
        Log.i(" Dagger Battery","In Battery Constructor");
    }
}
