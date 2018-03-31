package com.prituladima.myapplication;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {MainScreenModule.class})
public interface ApplicationComponent {

  void inject(MainActivity activity);

}
