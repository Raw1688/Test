package com.xb.io;

import java.io.*;

public class TransferStreamDemo {
  public static void main(String[] args) {
    try {
      FileInputStream fis = new FileInputStream(new File("text.txt"));
      InputStreamReader isr = new InputStreamReader(fis);
      char[] chars = new char[1];
      while (isr.read(chars) != -1) {
        System.out.print(chars);
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
