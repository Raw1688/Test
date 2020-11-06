package com.xb.inetAddress.socket;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class AcceptRunnable implements Runnable {

    private Socket socket;
    private TextArea area;
    private BufferedReader reader;

    public AcceptRunnable(Socket socket, TextArea area) throws IOException {
        this.socket = socket;
        this.area = area;
        InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
        reader = new BufferedReader(inputStreamReader);
    }

    @Override
    public void run() {
        String line = null;
        try {
            while ((line = reader.readLine()) != null) {
                area.append(line+"\n");
            }
        } catch (IOException e) {
            area.append(socket.getInetAddress().getHostName()+"断开连接"+"\n");
        }
    }
}
