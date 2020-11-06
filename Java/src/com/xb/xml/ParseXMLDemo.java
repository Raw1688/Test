package com.xb.xml;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.List;

public class ParseXMLDemo {
  public static void main(String[] args) {
    SAXReader saxReader = new SAXReader();
    try {
      //通过read方法读取一个文件转换成Document对象
      Document document = saxReader.read(new File("heroes.xml"));
      //获取根节点元素对象
      Element rootElement = document.getRootElement();
      System.out.println("<"+rootElement.getName()+">");
      parseElement(rootElement);
      /*//将Element存到List集合里
      List<Element> elementList = rootElement.elements();
      System.out.println("<"+rootElement.getName()+">");
      for (int i = 0; i < elementList.size(); i++) {
        Element element1 = elementList.get(i);
        System.out.println("id:"+element1.attribute("id").getValue());
        System.out.print("\t<"+element1.getName()+"\t");
        List<Attribute> attributeList = element1.attributes();
        for (int j = 0; j < attributeList.size(); j++) {
          Attribute attribute = attributeList.get(j);
          System.out.print(attribute.getName()+"="+attribute.getValue()+"\t");
        }
        System.out.print(">");
        System.out.print(element1.getText());
        System.out.println("</"+element1.getName()+">");
      }*/
      System.out.println("</"+rootElement.getName()+">");
    } catch (DocumentException e) {
      e.printStackTrace();
    }
  }

  public static void parseElement(Element element) {
    //将Element存到List集合里
    List<Element> elementList = element.elements();
    for (int i = 0; i < elementList.size(); i++) {
      Element element1 = elementList.get(i);
      System.out.print("\t<"+element1.getName()+"\t");
      List<Attribute> attributeList = element1.attributes();
      for (int j = 0; j < attributeList.size(); j++) {
        Attribute attribute = attributeList.get(j);
        System.out.print(attribute.getName()+"="+attribute.getValue()+"\t");
      }
      System.out.print(">");
      parseElement(element1);
      System.out.print(element1.getText());
      System.out.println("</"+element1.getName()+">");
    }
  }

}
