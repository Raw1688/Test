package com.xb.parttern.Singleton;

import com.xb.parttern.CompanyPrinter;

public class Employee {
  public static void main(String[] args) {
    CompanyPrinter companyPrinter = CompanyPrinter.getInstance();
    System.out.println("员工1使用打印机："+companyPrinter);
    CompanyPrinter companyPrinter1 = CompanyPrinter.getInstance();
    System.out.println("员工2使用打印机："+companyPrinter1);
    CompanyPrinter companyPrinter2 = CompanyPrinter.getInstance();
    System.out.println("员工3使用打印机："+companyPrinter2);
  }
}
