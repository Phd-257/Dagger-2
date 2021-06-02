package com.example.DaggerExample.modules;

import com.example.DaggerExample.model.Battery;
import com.example.DaggerExample.model.Cobalt;
import com.example.DaggerExample.model.Lithium;

import dagger.Module;
import dagger.Provides;

@Module
public class BatteryModule {


    @Provides
    static Cobalt getCobalt(){

        return new Cobalt();

    }

    @Provides
    static Lithium getLithium(){

        Lithium lithium = new Lithium();
        lithium.done();
        return lithium;
    }

    @Provides
    static Battery getBattery(){

        return new Battery(getCobalt(),getLithium());
    }
}
