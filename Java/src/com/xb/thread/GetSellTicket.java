package com.xb.thread;

public class GetSellTicket implements Runnable {
  private SellTicketDemo sellTicketDemo;

  public GetSellTicket(SellTicketDemo sellTicketDemo) {
    this.sellTicketDemo = sellTicketDemo;
  }

  @Override
  public void run() {
    while (true) {
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      if ( sellTicketDemo.getNumber() <= 0) {
        break;
      }
      sellTicketDemo.tackTicket();
    }
  }
}
