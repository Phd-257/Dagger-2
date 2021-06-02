package com.example.DaggerExample.model;

import android.util.Log;

import javax.inject.Inject;

public class MediaTek implements Processor{

    @Inject
    public MediaTek() {
        Log.i("Dagger MediaTek", "Mediatek Cons");
    }

    @Override
    public void run() {
        Log.i("Dagger MediaTek","Run as MediaTek");
    }
}
