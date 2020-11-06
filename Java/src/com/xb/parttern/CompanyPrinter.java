package com.xb.parttern;

public class CompanyPrinter {
  private CompanyPrinter() {

  }
  private static class PrinterHolder {
    private static CompanyPrinter instance = new CompanyPrinter();
  }
  public static CompanyPrinter getInstance() {
    return PrinterHolder.instance;
  }
}
