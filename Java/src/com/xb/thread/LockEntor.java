package com.xb.thread;

public class LockEntor {
  public static void main(String[] args) {
    Robber robber = new Robber();
    Police police = new Police();
    LockRunnable lockRunnable = new LockRunnable(robber,police,true);
    LockRunnable lockRunnable1 = new LockRunnable(robber,police,false);
    new Thread(lockRunnable).start();
    new Thread(lockRunnable1).start();
  }
}
