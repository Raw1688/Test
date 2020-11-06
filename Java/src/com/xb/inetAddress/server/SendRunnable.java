package com.xb.inetAddress.server;

import java.io.*;
import java.net.Socket;

public class SendRunnable implements Runnable {

  private BufferedWriter writer;
  private BufferedReader reader;

  public SendRunnable(Socket socket) throws IOException {
    InputStreamReader isr = new InputStreamReader(System.in);
    reader = new BufferedReader(isr);
    OutputStreamWriter osw = new OutputStreamWriter(socket.getOutputStream());
    writer = new BufferedWriter(osw);
  }

  @Override
  public void run() {
    String line = null;
    try {
      while ((line = reader.readLine()) != null) {
        while (true ){
          writer.write("小七："+line);
          writer.newLine();
          writer.flush();
          if (line.equals("exit")) {
            writer.write("与小七的对话已结束");
            break;
          }
        }
      }
      writer.close();
      reader.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
