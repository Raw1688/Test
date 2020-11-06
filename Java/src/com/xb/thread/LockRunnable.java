package com.xb.thread;

public class LockRunnable implements Runnable {
  private Robber robber;
  private Police police;
  private boolean flag;

  public LockRunnable(Robber robber, Police police, boolean flag) {
    this.robber = robber;
    this.police = police;
    this.flag = flag;
  }

  @Override
  public void run() {
    if (flag) {
      synchronized (police) {
        police.talk();
        synchronized (robber) {
          robber.doSomething();
        }
        police.doSomething();
      }
    } else {
      synchronized (robber) {
        robber.talk();
        synchronized (police) {
          police.doSomething();
        }
        robber.doSomething();
      }
    }
  }
}
