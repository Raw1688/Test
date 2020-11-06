package com.xb.io;

import java.io.*;

public class FileCopyDemo {
  public static void main(String[] args) {
    File file = new File("D:/14/java/mysql-connector-java-5.1.47.jar");
    File file1 = new File("C:/mysql.jar");
    try {
      FileInputStream fis = new FileInputStream(file);
      FileOutputStream fos = new FileOutputStream(file1);

      byte[] bytes = new byte[(int) file.length()];
      fis.read(bytes);
      fos.write(bytes);

      fos.close();
      fis.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
