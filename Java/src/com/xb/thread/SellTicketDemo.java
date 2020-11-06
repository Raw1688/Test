package com.xb.thread;

public class SellTicketDemo  {
  private int number = 50;

  public int getNumber() {
    return number;
  }

  public synchronized void tackTicket() {
    if (number > 0) {
      System.out.println(Thread.currentThread().getName()+"出售第"+number+"张票，还剩"+(number-1));
      number--;
    } else {
      System.out.println(Thread.currentThread().getName()+"已售空");
    }
  }
}
