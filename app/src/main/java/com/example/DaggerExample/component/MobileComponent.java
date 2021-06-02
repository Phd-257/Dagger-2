package com.example.DaggerExample.component;


import com.example.DaggerExample.MainActivity;
import com.example.DaggerExample.model.Mobile;
import com.example.DaggerExample.modules.BatteryModule;

import dagger.Component;

@Component(modules = BatteryModule.class)
public interface MobileComponent {


    //Mobile getMobile();

    void inject(MainActivity activity);


}
