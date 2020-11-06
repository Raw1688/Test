package com.xb.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteDemo {
  public static void main(String[] args) {
    File file = new File("text.txt");
    try {
      FileWriter fw = new FileWriter(file,true);
      fw.write("床前明月光，凝视地上霜。");
      fw.close();
    } catch (IOException e) {
      e.printStackTrace();
    }

  }
}
