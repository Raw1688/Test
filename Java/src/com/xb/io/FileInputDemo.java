package com.xb.io;

import java.io.*;

public class FileInputDemo {
  public static void main(String[] args) {
    File file = new File("C:\\Users\\Administrator\\Desktop/a.txt");

    //写入文本
//    FileOutputStream fos = null;
//    try {
//      fos = new FileOutputStream(file,true);
//      String data = "床前明月光，凝视地上霜。举头望明月，低头思故乡.";
//      byte[] b = data.getBytes();
//      fos.write(b);
//    } catch (FileNotFoundException e) {
//      e.printStackTrace();
//    } catch (IOException e) {
//      e.printStackTrace();
//    } finally {
//      try {
//        fos.close();
//      } catch (IOException e) {
//        e.printStackTrace();
//      }
//    }

    //读取文本
    FileInputStream fis = null;
    try {
      fis = new FileInputStream(file);
      byte[] bytes = new byte[(int) file.length()];
      fis.read(bytes);
      String s = new String(bytes,"gbk");
      System.out.println(s);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        fis.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
