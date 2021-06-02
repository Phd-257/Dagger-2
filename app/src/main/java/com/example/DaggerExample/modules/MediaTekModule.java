package com.example.DaggerExample.modules;

import com.example.DaggerExample.model.MediaTek;
import com.example.DaggerExample.model.Processor;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class MediaTekModule {






    @Binds
    abstract Processor getProcessor(MediaTek mediaTek);
}
