package com.example.DaggerExample.modules;

import com.example.DaggerExample.model.Camera;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Module;
import dagger.Provides;



public abstract class CameraModule {



    static Camera getCamera(@Named("megaPixel") int megaPixel){

        return new Camera(megaPixel);
    }
}
