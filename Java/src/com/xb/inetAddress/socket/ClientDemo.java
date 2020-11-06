package com.xb.inetAddress.socket;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.Socket;

public class ClientDemo {

    public ClientDemo() {
        JFrame frame = new JFrame("客户端聊天界面");
        frame.setBounds(300,200,800,500);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        TextArea area = new TextArea();
        area.setBounds(50,30,700,300);
        area.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(area,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        JTextField jTextField = new JTextField();
        jTextField.setBounds(50,350,600,30);
        JButton jButton = new JButton("发送");
        jButton.setBounds(670,350,80,30);
        frame.add(jButton);
        frame.add(jTextField);
        frame.add(scrollPane);
        frame.add(area);
        frame.setVisible(true);

        try {
            Socket socket = new Socket("192.168.10.24",8888);
            new Thread(new AcceptRunnable(socket,area)).start();
            jButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        new Thread(new SendRunnable(jTextField,area,socket)).start();
                    } catch (IOException ioException) {
                        ioException.printStackTrace();
                    }
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        ClientDemo clientDemo = new ClientDemo();
    }
}
