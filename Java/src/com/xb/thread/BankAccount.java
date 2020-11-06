package com.xb.thread;

public class BankAccount {
  private String name;
  private ThreadLocal<Integer> balance = new ThreadLocal<>();

  public BankAccount(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getBalance() {
    return balance.get();
  }

  public void setBalance(int balance) {
    this.balance.set(balance);
  }
}
