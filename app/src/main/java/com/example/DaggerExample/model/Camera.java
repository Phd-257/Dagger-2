package com.example.DaggerExample.model;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

import dagger.BindsInstance;

public class Camera {

    int megaPixel;

    @Inject
    public Camera( @Named("megaPixel")int megaPixel) {
        this.megaPixel = megaPixel;
        Log.i("Dagger Camera ","MegaPixel is "+megaPixel);

    }
}
