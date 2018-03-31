package com.prituladima.myapplication;


import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import rx.subjects.PublishSubject;

@Module
public class MainScreenModule {



    @Provides
    @Singleton
    public Presenter presenter(PublishSubject<Boolean> providesPublishSubject){
        return new Presenter(providesPublishSubject);
    }


    @Provides
    @Singleton
    public PublishSubject<Boolean> providesPublishSubject(){
        return PublishSubject.create();
    }


}