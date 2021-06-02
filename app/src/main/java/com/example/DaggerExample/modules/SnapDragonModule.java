package com.example.DaggerExample.modules;


import com.example.DaggerExample.model.Processor;
import com.example.DaggerExample.model.SnapDragon;

import dagger.Module;
import dagger.Provides;

@Module
public class SnapDragonModule {


    @Provides
    static SnapDragon getSnapDragon(){
        return new SnapDragon();
    }


    @Provides
    static Processor getProcessor(){

        return getSnapDragon();
    }
}
