package com.xb.thread;

import java.io.*;

public class IOThread extends Thread {

  private static File readfile = new File("D:/HBuilderX.1.4.1.20181228.zip");
  private static File writefile = new File("D:/A.zip");

  public void copy(File file, File newFile) {
    FileInputStream fis = null;
    FileOutputStream fos = null;
    try {
      fis = new FileInputStream(file);
      fos = new FileOutputStream(newFile);
      int data;
      while ((data = fis.read()) != -1) {
        fos.write(data);
      }
      fos.close();
      fis.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  @Override
  public void run() {
    long reader = readfile.length();
    System.out.println("文件总大小"+reader);
    while (true) {
      try {
        sleep(2000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      long write = writefile.length();
      System.out.println("已经复制："+write);
      System.out.println("剩余："+(reader-write));
      if (write >= reader) {
        System.out.println("拷贝完成！");
        break;
      }
    }
  }

  public static void main(String[] args) {
    IOThread it = new IOThread();
    it.start();
    it.copy(readfile,writefile);
  }
}
