package com.xb.inetAddress.socket;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.net.Socket;

public class SendRunnable implements Runnable {
    private BufferedReader reader;
    private BufferedWriter writer;
    private JTextField jTextField;
    private TextArea area;
    private Socket socket;

    public SendRunnable( JTextField jTextField, TextArea area, Socket socket) throws IOException {
        this.jTextField = jTextField;
        this.area = area;
        this.socket = socket;
        StringReader stringReader = new StringReader(jTextField.getText());
        reader = new BufferedReader(stringReader);
        jTextField.setText("");
        OutputStreamWriter osp = new OutputStreamWriter(socket.getOutputStream());
        writer = new BufferedWriter(osp);
    }

    @Override
    public void run() {
        String line = null;
        try {
            while ((line = reader.readLine()) != null) {
                area.append(line+"\n");
                writer.write(socket.getInetAddress().getHostName()+"："+line);
                writer.newLine();
                writer.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
