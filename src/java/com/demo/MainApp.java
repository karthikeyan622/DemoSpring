/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo;

/**
 *
 * @author admin
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.main.DemoPrintIFC;
public class MainApp {
   public static void main(String[] args) {
      ApplicationContext context = 
             new ClassPathXmlApplicationContext("Beans.xml");

      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
      DemoPrintIFC demoMainIFC=(DemoPrintIFC) context.getBean("demoMain");
      //demoMainIFC.Print();

      obj.getMessage();
   }
}