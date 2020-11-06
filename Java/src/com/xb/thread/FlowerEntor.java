package com.xb.thread;

public class FlowerEntor {
  public static void main(String[] args) {
    Flower flower = new Flower(20);
    RunnableFlower runnableFlower = new RunnableFlower(flower);
    new Thread(runnableFlower,"猴1").start();
    new Thread(runnableFlower,"猴2").start();
    new Thread(runnableFlower,"猴3").start();
  }
}
