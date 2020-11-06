package com.xb.thread;

public class RunnableDemo implements Runnable {
  private int i;
  @Override
  public void run() {
    for (; i < 100; i++) {
      System.out.println(Thread.currentThread().getName()+i);
    }
  }
}
