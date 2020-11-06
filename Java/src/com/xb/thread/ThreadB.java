package com.xb.thread;

public class ThreadB extends Thread {
  private ThreadA threadA;

  public ThreadB(ThreadA threadA) {
    this.threadA = threadA;
  }

  @Override
  public void run() {
    try {
      threadA.join();
      for (int i = 0; i < 10; i++) {
        System.out.println(getName()+i);
      }
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {
    ThreadA threadA = new ThreadA();
    threadA.setName("线程A");
    ThreadB threadB = new ThreadB(threadA);
    threadB.setName("线程B");
    threadA.start();
    threadB.start();
  }
}
