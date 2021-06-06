package com.example.DaggerExample.component;


import com.example.DaggerExample.MainActivity;
import com.example.DaggerExample.model.Mobile;
import com.example.DaggerExample.model.SnapDragon;
import com.example.DaggerExample.modules.BatteryModule;
import com.example.DaggerExample.modules.MediaTekModule;
import com.example.DaggerExample.modules.SnapDragonModule;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;

@Component(modules = {BatteryModule.class, MediaTekModule.class})
public interface MobileComponent {


    //Mobile getMobile();

    void inject(MainActivity activity);

    @Component.Builder
    interface Builder{

        @BindsInstance
        Builder setClockSpeed(@Named("clockSpeed") int clockSpeed);

        @BindsInstance
        Builder setCore(@Named("core") int core);

        MobileComponent build();

    }


}
