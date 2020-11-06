package com.xb.thread;

public class GetMoneyDemo extends Thread {
  private Account account;
  private int money;

  public GetMoneyDemo(Account account, int money) {
    this.account = account;
    this.money = money;
  }

  @Override
  public void run() {
    account.takeMoney(money);
  }

}
