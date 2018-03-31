package com.prituladima.myapplication;

import org.junit.Before;
import org.junit.Test;

import rx.subjects.PublishSubject;

public class ExampleUnitTest {

  Presenter presenter;
  PublishSubject<Boolean> subject;

  @Before
  public void prepare() {

    subject = PublishSubject.create();

    presenter = new Presenter(subject);
  }

  @Test
  public void addition_isCorrect() {

  }

}