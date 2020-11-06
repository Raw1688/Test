package com.xb.inetAddress.socket;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketDemo {

    private Socket socket;

    public ServerSocketDemo() {
        JFrame frame = new JFrame("服务端聊天界面");
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
            ServerSocket serverSocket = new ServerSocket(8888);
            area.append("服务端创建成功，等待客户端的连接..\n");
            while (true) {
                socket = serverSocket.accept();
                area.append(socket.getInetAddress().getHostName()+"连接成功\n");
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
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ServerSocketDemo serverSocketDemo = new ServerSocketDemo();
    }
}
