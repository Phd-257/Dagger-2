package com.example.DaggerExample;

import android.util.Log;

import javax.inject.Inject;

public class Processor {

    @Inject
    public Processor() {
        Log.i("In Processor","Processor Constructor");
    }
}
