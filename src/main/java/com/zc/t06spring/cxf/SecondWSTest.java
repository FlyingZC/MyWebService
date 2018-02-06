package com.zc.t06spring.cxf;

import javax.xml.ws.Endpoint;

//http://localhost:8080/helloWorld?wsdl
public class SecondWSTest
{
    public static void main(String[] args) {  
         System.out.println("web service start");  
         SecondWSImpl implementor = new SecondWSImpl();  
         String address = "http://localhost:8080/helloWorld";  
         Endpoint.publish(address, implementor);  
         System.out.println("web service started");  
    }  
      
}
