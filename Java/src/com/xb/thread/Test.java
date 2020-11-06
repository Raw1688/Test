package com.xb.thread;

public class Test {
  public static void main(String[] args) {
    MyThread threadDemo = new MyThread();

    threadDemo.start();
    for (int i = 0; i < 20; i++) {
      System.out.println(Thread.currentThread().getName()+i);
    }
  }
}
