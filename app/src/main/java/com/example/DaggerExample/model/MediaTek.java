package com.example.DaggerExample.model;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

public class MediaTek implements Processor{

    int clockSpeed;
    int core;

    @Inject
    public MediaTek(@Named("clockSpeed")int clockSpeed, @Named("core")int core) {
        this.core=core;
        this.clockSpeed=clockSpeed;
        Log.i("Dagger MediaTek", "Mediatek Cons and clock speed is " + clockSpeed+" core :"+ core);
    }

    @Override
    public void start() {
        Log.i("Dagger MediaTek","Run as MediaTek");
    }



}
