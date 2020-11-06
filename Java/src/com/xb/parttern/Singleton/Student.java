package com.xb.parttern.Singleton;

/**
 * 饿汉模式
 */
public class Student {
  private static Student student = new Student();
  private Student() {

  }
  public static Student getInstance() {
    return student;
  }
}
