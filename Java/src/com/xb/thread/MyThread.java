package com.xb.thread;

public class MyThread extends Thread {
  @Override
  public void run() {
    for (int i = 0; i < 6; i++) {
      System.out.println(" ");
      for (int j = 0; j < 2*i-1; j++) {
        System.out.print("☆"+"\t");
      }
    }
  }
}
