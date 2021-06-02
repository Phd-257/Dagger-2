package com.example.DaggerExample.model;

import android.util.Log;

import com.example.DaggerExample.model.Battery;
import com.example.DaggerExample.model.Processor;

import javax.inject.Inject;

public class Mobile {


    Processor processor;
    @Inject
    Battery battery;

    @Inject
    public Mobile(Processor processor) {
        this.processor = processor;

        Log.i("Dagger Mobile","Mobile Constructor");
    }

    public void run(){

        Log.i("Dagger Mobile","in run method");
    }

    @Inject
    public void connectCharger(Charger charger){

        charger.setCharger(this);
    }
}
