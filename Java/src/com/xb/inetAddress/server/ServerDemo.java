package com.xb.inetAddress.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
  public static void main(String[] args) {
    try {
      ServerSocket serverSocket = new ServerSocket(888);
      System.out.println("服务端建立成功，等待客户端的连接");
      while (true) {
        Socket socket = serverSocket.accept();
        System.out.println(socket.getInetAddress().getHostName()+"客户端已连接");
        new Thread(new AcceptRunnable(socket)).start();
        new Thread(new SendRunnable(socket)).start();
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
