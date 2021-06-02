package com.example.DaggerExample.model;

import android.util.Log;

import javax.inject.Inject;

public class Processor {

    @Inject
    public Processor() {
        Log.i("Dagger Processor","In Processor Constructor");
    }
}
