package com.example.DaggerExample.component;


import com.example.DaggerExample.MainActivity;
import com.example.DaggerExample.model.Mobile;
import com.example.DaggerExample.model.SnapDragon;
import com.example.DaggerExample.modules.BatteryModule;
import com.example.DaggerExample.modules.CameraModule;
import com.example.DaggerExample.modules.MediaTekModule;
import com.example.DaggerExample.modules.SnapDragonModule;

import dagger.Component;

@Component(modules = {BatteryModule.class, SnapDragonModule.class})
public interface MobileComponent {


    //Mobile getMobile();

    void inject(MainActivity activity);

<<<<<<< Updated upstream
=======
//    @Component.Builder
//    interface Builder{
//
//
//        Builder setClockSpeed(@BindsInstance @Named("clockSpeed") int clockSpeed);
//
//
//        Builder setCore(@BindsInstance@Named("core") int core);
//
//        MobileComponent build();
//
//    }

    @Component.Factory
    interface Factory{

        MobileComponent create(@BindsInstance @Named("clockSpeed") int clockSpeed,
                               @BindsInstance@Named("core") int core,
                               @BindsInstance @Named("megaPixel") int mp
                               );
    }

>>>>>>> Stashed changes

}
