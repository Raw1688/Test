package com.xb.thread;

import java.util.Random;

public class SaveMoneyRunnable implements Runnable {

  private BankAccount bankAccount;
  private Random random = new Random();

  public SaveMoneyRunnable(BankAccount bankAccount) {
    this.bankAccount = bankAccount;
  }

  @Override
  public void run() {
    bankAccount.setBalance(0);
    for (int i = 0; i < 5; i++) {
      int money = random.nextInt(10000);
      int balance = bankAccount.getBalance()+money;
      bankAccount.setBalance(balance);
      System.out.println(bankAccount.getName()+"往"+Thread.currentThread().getName()+"存了"+money+"余额："+balance);
    }
  }
}
