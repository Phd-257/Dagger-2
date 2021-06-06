package com.example.DaggerExample.modules;



import com.example.DaggerExample.model.Processor;
import com.example.DaggerExample.model.SnapDragon;

import dagger.Module;
import dagger.Provides;

@Module
public class SnapDragonModule {

   public int clockSpeed;

//    @Provides
//    static SnapDragon getSnapDragon(){
//        return new SnapDragon(3);
//    }

    @Provides
     int getClockSpeed() {
        return clockSpeed;
    }

    public SnapDragonModule(int clockSpeed) {
        this.clockSpeed = clockSpeed;
    }

    @Provides
    Processor getProcessor(SnapDragon snapDragon){

        return snapDragon;
    }
}
