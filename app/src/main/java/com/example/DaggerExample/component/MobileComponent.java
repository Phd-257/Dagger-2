package com.example.DaggerExample.component;


import com.example.DaggerExample.MainActivity;
import com.example.DaggerExample.model.Mobile;
import com.example.DaggerExample.model.SnapDragon;
import com.example.DaggerExample.modules.BatteryModule;
import com.example.DaggerExample.modules.MediaTekModule;
import com.example.DaggerExample.modules.SnapDragonModule;

import dagger.Component;

@Component(modules = {BatteryModule.class, SnapDragonModule.class})
public interface MobileComponent {


    //Mobile getMobile();

    void inject(MainActivity activity);


}
