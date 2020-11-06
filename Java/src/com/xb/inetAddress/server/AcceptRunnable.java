package com.xb.inetAddress.server;

import java.io.*;
import java.net.Socket;

public class AcceptRunnable implements Runnable {
  private Socket socket;
  private BufferedReader reader;

  public AcceptRunnable(Socket socket) throws IOException {
    this.socket = socket;
    InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
    reader = new BufferedReader(inputStreamReader);
  }

  @Override
  public void run() {
    String line = null;
    try {
      while ((line = reader.readLine()) != null) {
        System.out.println(socket.getInetAddress().getHostName()+"："+line);
      }
      reader.close();
    } catch (IOException e) {
      System.out.println(socket.getInetAddress().getHostName()+"断开连接");
    }
  }
}
