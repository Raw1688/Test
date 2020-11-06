package com.xb.thread;

public class RunTest {
  public static void main(String[] args) {
    RunnableDemo runnableDemo = new RunnableDemo();
    Thread thread = new Thread(runnableDemo);
    thread.setName("小王");
    thread.start();

    new Thread(new Runnable() {
      @Override
      public void run() {
        Thread.currentThread().setName("线程A");
        for (int i = 0; i < 100; i++) {
          System.out.println(Thread.currentThread().getName()+i);
        }
      }
    }).start();
  }
}
