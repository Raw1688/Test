package com.xb.parttern;

public class Emperor {
  private static Emperor emperor = new Emperor();
  private Emperor() {

  }
  public static Emperor getInstance() {
    return emperor;
  }
}
