package com.xb.thread;

public class BackAccountEntor {
  public static void main(String[] args) {
    BankAccount bankAccount = new BankAccount("小王");
    SaveMoneyRunnable saveMoneyRunnable = new SaveMoneyRunnable(bankAccount);
    new Thread(saveMoneyRunnable,"工商银行").start();
    new Thread(saveMoneyRunnable,"农业银行").start();
  }
}
