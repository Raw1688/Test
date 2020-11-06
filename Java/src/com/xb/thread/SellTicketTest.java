package com.xb.thread;

public class SellTicketTest {
  public static void main(String[] args) {
    SellTicketDemo sellTicketDemo = new SellTicketDemo();
    GetSellTicket sellTicket = new GetSellTicket(sellTicketDemo);
    new Thread(sellTicket,"窗口一").start();
    new Thread(sellTicket,"窗口二").start();
    new Thread(sellTicket,"窗口三").start();
  }
}
