package com.zc.t06spring.cxf.client;

import java.util.ArrayList;
import java.util.List;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zc.t06spring.cxf.SecondWS;
import com.zc.t06spring.cxf.User;

public class TestSpringCxf
{
    public static void main(String[] args)
    {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        JaxWsProxyFactoryBean jwpfb = (JaxWsProxyFactoryBean) ctx.getBean("clientFactory");  
        User user1 = new User();
        user1.setName("马克思");
        User user2 = new User();
        user2.setName("恩格斯");
        List<User> userList = new ArrayList<User>();
        userList.add(user1);
        userList.add(user2);
        SecondWS hw = (SecondWS) jwpfb.create();  
        for(String s:hw.SayHiToUserList(userList)){
            System.out.println(s);
        }
    }
}
