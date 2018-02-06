package com.zc.t05ws.cxf;

import javax.jws.WebService;

import org.apache.cxf.frontend.ServerFactoryBean;

@WebService(name="mycxf",targetNamespace="http://zc.com")
public class MyCXFServer
{
    public String sayHi(String name){
        return "hello->"+name;
    }
    public static void main(String[] args)
    {
        //发布服务的类,类似于Endpoint
        ServerFactoryBean serverFactoryBean=new ServerFactoryBean();
        //注册服务器地址和端口
        serverFactoryBean.setAddress("http://localhost:11005/mycxf");
        //注册哪个类提供服务
        serverFactoryBean.setServiceBean(new MyCXFServer());
        //发布一个cxf服务
        serverFactoryBean.create();
        //一分钟后服务终止
        try
        {
            Thread.sleep(1*60*1000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        //程序正常退出
        System.exit(0);
    }
}
