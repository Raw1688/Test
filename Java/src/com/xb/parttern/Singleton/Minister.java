package com.xb.parttern.Singleton;

import com.xb.parttern.Emperor;

public class Minister {
  public static void main(String[] args) {
    Emperor emperor = Emperor.getInstance();
    Emperor emperor1 = Emperor.getInstance();
    Emperor emperor2 = Emperor.getInstance();
    System.out.println(emperor);
    System.out.println(emperor1);
    System.out.println(emperor2);
    System.out.println("大臣参见的是否是同一个玉帝："+(emperor==emperor1 && emperor==emperor2));
  }
}
