package com.example.DaggerExample.model;

import android.util.Log;

import javax.inject.Inject;

public class Cobalt {

    @Inject
    public Cobalt() {

        Log.i("Dagger Cobalt","In Cobalt Constructor");
    }
}
