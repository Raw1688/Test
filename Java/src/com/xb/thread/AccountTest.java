package com.xb.thread;

public class AccountTest {
  public static void main(String[] args) {
    Account account = new Account("邮政银行",10000);
    GetMoneyDemo getMoneyDemo = new GetMoneyDemo(account,6000);
    getMoneyDemo.setName("老王");
    GetMoneyDemo getMoneyDemo1 = new GetMoneyDemo(account,6000);
    getMoneyDemo1.setName("小王");
    getMoneyDemo.start();
    getMoneyDemo1.start();
  }
}
