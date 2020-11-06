package com.xb.io;

import java.io.*;

public class FileStreamCopyDemo {
  public static void main(String[] args) {
    File file = new File("text.txt");
    File newFile = new File("D:/t.txt");
    try {
      FileReader fileReader = new FileReader(file);
      FileWriter fileWriter = new FileWriter(newFile);
      char[] chars = new char[10];
      while (fileReader.read(chars) != -1) {
        fileWriter.write(chars);
      }
      fileWriter.close();
      fileReader.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
