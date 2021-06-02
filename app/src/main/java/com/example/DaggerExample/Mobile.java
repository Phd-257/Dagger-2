package com.example.DaggerExample;

import android.util.Log;

import javax.inject.Inject;

public class Mobile {

    Processor processor;
    Battery battery;

    @Inject
    public Mobile(Processor processor, Battery battery) {
        this.processor = processor;
        this.battery = battery;
        Log.i("Mobile","In Mobile Constructor");
    }

    void run(){

        Log.i("Mobile","in run method");
    }
}
