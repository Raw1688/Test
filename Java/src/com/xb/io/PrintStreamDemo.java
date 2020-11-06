package com.xb.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class PrintStreamDemo{
  public static void main(String[] args) {
    File file = new File("text.txt");
    PrintStream printStream = null;
    try {
      printStream = new PrintStream(file);
      printStream.println("sfdasfasdf");
      printStream.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }

  }
}
