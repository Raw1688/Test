package com.xb.thread;

public class Flower {
  private int number;

  public Flower(int number) {
    this.number = number;
  }

  public int getNumber() {
    return number;
  }

  public synchronized void fetch() {
    if (number>0) {
      System.out.println(Thread.currentThread().getName()+"拿了第"+number+"朵花");
      number--;
    }
  }

}
