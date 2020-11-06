package com.xb.inetAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
  public static void main(String[] args) {
    try {
      InetAddress inetAddress = InetAddress.getLocalHost();
      System.out.println("主机名："+inetAddress.getHostName());
      System.out.println("IP地址："+inetAddress.getHostAddress());
    } catch (UnknownHostException e) {
      e.printStackTrace();
    }
  }
}
