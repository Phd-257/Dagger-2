package com.example.DaggerExample;

import android.util.Log;

import javax.inject.Inject;

public class Battery {

    @Inject
    public Battery() {
        Log.i("Battery","In Battery constructor");
    }
}
