package com.xb.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyScanner {
  public static void main(String[] args) {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader reader = new BufferedReader(isr);
    String line = null;
    try {
      while ((line = reader.readLine()) != null) {
        System.out.println(line.toUpperCase());
        if (line.equals("结束")) {
          break;
        }
      }
      reader.close();
      isr.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
