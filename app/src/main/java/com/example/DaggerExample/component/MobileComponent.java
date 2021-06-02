package com.example.DaggerExample.component;


import com.example.DaggerExample.MainActivity;
import com.example.DaggerExample.model.Mobile;

import dagger.Component;

@Component
public interface MobileComponent {


    Mobile getMobile();

    void inject(MainActivity activity);


}
