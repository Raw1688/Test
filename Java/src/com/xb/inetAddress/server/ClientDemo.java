package com.xb.inetAddress.server;

import java.io.*;
import java.net.Socket;

public class ClientDemo {
  public static void main(String[] args) {
    try {
      Socket client = new Socket("192.168.10.45" ,888);
      new Thread(new AcceptRunnable(client)).start();
      new Thread(new SendRunnable(client)).start();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
