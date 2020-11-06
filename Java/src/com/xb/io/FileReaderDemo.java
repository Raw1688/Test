package com.xb.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
  public static void main(String[] args) {
    File file = new File("text.txt");
    try {
      FileReader fileReader = new FileReader(file);
      char[] chars = new char[1024];
      fileReader.read(chars);
      System.out.println(new String(chars));
      fileReader.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
