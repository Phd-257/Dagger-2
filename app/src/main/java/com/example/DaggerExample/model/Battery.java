package com.example.DaggerExample.model;

import android.util.Log;

import javax.inject.Inject;

public class Battery {

    @Inject
    public Battery() {
        Log.i("Dagger Battery","In Battery constructor");
    }
}
