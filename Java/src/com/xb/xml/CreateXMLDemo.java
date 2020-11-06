package com.xb.xml;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CreateXMLDemo {
  public static void main(String[] args) {
    Document document = DocumentHelper.createDocument();
    //创建根节点（元素）
    Element rootElement = DocumentHelper.createElement("heroes");
    //为文档设置根节点
    document.setRootElement(rootElement);
    List<Hero> heroList = new ArrayList<>();
    heroList.add(new Hero("1","百里守约","射手","百无虚发"));
    heroList.add(new Hero("2","百里守约1","射手","一枪穿云"));
    heroList.add(new Hero("3","百里守约2","射手","百发百中"));
    for (int i = 0; i < heroList.size(); i++) {
      //创建子元素
      Element heroEle = DocumentHelper.createElement("hero");
      //为子元素添加属性
      heroEle.addAttribute("id", heroList.get(i).getId());
      heroEle.addAttribute("name",heroList.get(i).getName());
      heroEle.addAttribute("type",heroList.get(i).getType());
      heroEle.setText(heroList.get(i).getSkill());
      //将子元素添加到根元素
      rootElement.add(heroEle);
    }

    /*//创建skill元素
    Element skillEle = DocumentHelper.createElement("skill");
    //为skill元素设置文档
    skillEle.setText("一枪穿云");
    //将skill元素添加到hero元素下
    heroEle.add(skillEle);*/

    //创建OutputFormat，输出格式化
    OutputFormat outputFormat = OutputFormat.createPrettyPrint();
    outputFormat.setEncoding("UTF-8");
    try {
      File file = new File("heroes.xml");
      FileWriter writer = new FileWriter(file);
      XMLWriter xmlWriter = new XMLWriter(writer,outputFormat);
      xmlWriter.write(document);
      xmlWriter.close();
    } catch (IOException e) {
      e.printStackTrace();
    }

  }
}
