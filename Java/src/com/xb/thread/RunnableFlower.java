package com.xb.thread;

public class RunnableFlower implements Runnable {
  private Flower flower;

  public RunnableFlower(Flower flower) {
    this.flower = flower;
  }

  @Override
  public void run() {
    while (true) {
      if (flower.getNumber() <= 0) {
        break;
      }
      flower.fetch();
    }
  }
}
