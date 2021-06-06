package com.example.DaggerExample.model;

import android.util.Log;

import com.example.DaggerExample.model.Battery;
import com.example.DaggerExample.model.Processor;

import javax.inject.Inject;

public class Mobile {


    Processor processor;

    Battery battery;

    @Inject
    public Mobile(Battery battery,Processor processor) {
        this.processor = processor;
        this.battery=battery;
        Log.i("Dagger Mobile","Mobile Constructor");
    }


    public void run(){

        Log.i("Dagger Mobile","in run method");
    }


    public void connectCharger(Charger charger){

        charger.setCharger(this);
    }
}
