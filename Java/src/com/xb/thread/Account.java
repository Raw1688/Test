package com.xb.thread;

public class Account {
  private String account;
  private int balance;

  public Account(String account, int balance) {
    this.account = account;
    this.balance = balance;
  }

  public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
  }

  public int getBalance() {
    return balance;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }

  public synchronized void takeMoney(int money) {
    if (balance >= money) {
      System.out.println(Thread.currentThread().getName()+"取钱："+money);
      setBalance(balance-money);
      System.out.println("余额："+getBalance());
    } else {
      System.out.println("取钱失败");
    }
  }

}
