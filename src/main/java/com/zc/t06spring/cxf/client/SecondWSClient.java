package com.zc.t06spring.cxf.client;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.zc.t03jdkws.HelloWorld;
import com.zc.t06spring.cxf.SecondWS;
import com.zc.t06spring.cxf.User;

public class SecondWSClient {  
//客户端直接调用,无需使用cmd  
    public static void main(String[] args) {  
        //首先右键run as 运行com.hsy.server.webServiceApp类，然后再运行这段客户端代码  
        JaxWsProxyFactoryBean jwpfb = new JaxWsProxyFactoryBean();  
        jwpfb.setServiceClass(SecondWS.class);  
        jwpfb.setAddress("http://localhost:8080/helloWorld");  
        SecondWS hw = (SecondWS) jwpfb.create();  
        User user = new User();  
        user.setName("马克思");  
        System.out.println(hw.sayHiToUser(user));  
          
    }  
  
}  