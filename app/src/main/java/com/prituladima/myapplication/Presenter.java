package com.prituladima.myapplication;

import android.content.Context;

import javax.inject.Inject;

import rx.subjects.PublishSubject;

public class Presenter {

  @Inject public PublishSubject<Boolean> subject;

  @Inject
  public Presenter(PublishSubject<Boolean> subject) {
    this.subject = subject;
  }
}
