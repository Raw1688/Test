package com.xb.io;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

public class FileDemo {
  public static void main(String[] args) {
    File file = new File("D:/14");
    isFile(file);
  }
  private static void isFile (File file) {
    File[] file1 = file.listFiles();
    Arrays.sort(file1, new Comparator<File>() {
      @Override
      public int compare(File o1, File o2) {
        if (o1.length()<o2.length()) {
          return 1;
        } else if (o1.length()>o2.length()) {
          return -1;
        } else {
          return 0;
        }
      }
    });
    System.out.println(file1[0].getName());
    System.out.println(file1[0].length());
  }
}
