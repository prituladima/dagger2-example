package com.prituladima.myapplication;

import android.app.Application;

public class MainApplication  extends Application {


    private static ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        applicationComponent = DaggerApplicationComponent.builder().build();
    }



    public static ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }


}