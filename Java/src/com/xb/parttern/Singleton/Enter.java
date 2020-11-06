package com.xb.parttern.Singleton;

public class Enter {
  public static void main(String[] args) {
    Student student = Student.getInstance();
    Student student1 = Student.getInstance();
    Singleton singleton = Singleton.getInstance();
    Singleton singleton1 = Singleton.getInstance();
    Singleton2 singleton2 = Singleton2.getInstance();
    Singleton2 singleton21 = Singleton2.getInstance();
    System.out.println(student);
    System.out.println(student1);
    System.out.println(singleton);
    System.out.println(singleton1);
    System.out.println(singleton2);
    System.out.println(singleton21);
  }
}
