package com.example.DaggerExample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.DaggerExample.component.DaggerMobileComponent;
import com.example.DaggerExample.component.MobileComponent;
import com.example.DaggerExample.model.Mobile;
import com.example.DaggerExample.modules.SnapDragonModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Mobile mobile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //old method
//        Mobile mobile= new Mobile(new Processor(),new Battery());
//        mobile.run();


        //phase 1

        MobileComponent mobileComponent = DaggerMobileComponent
                .builder().setCore(4).setClockSpeed(3)
                .build();
        //Mobile mobile= mobileComponent.getMobile();
        mobileComponent.inject(this);


        mobile.run();



    }
}