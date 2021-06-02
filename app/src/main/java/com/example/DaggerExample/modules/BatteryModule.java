package com.example.DaggerExample.modules;

import com.example.DaggerExample.model.Battery;
import com.example.DaggerExample.model.Cobalt;
import com.example.DaggerExample.model.Lithium;

import dagger.Module;
import dagger.Provides;

@Module
public class BatteryModule {


    @Provides
    Cobalt getCobalt(){

        return new Cobalt();

    }

    @Provides
    Lithium getLithium(){

        Lithium lithium = new Lithium();
        lithium.done();
        return lithium;
    }

    @Provides
    Battery getBattery(){

        return new Battery(getCobalt(),getLithium());
    }
}
