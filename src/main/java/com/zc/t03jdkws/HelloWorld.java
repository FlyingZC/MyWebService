package com.zc.t03jdkws;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService//一个WebService
public class HelloWorld
{
 // 非 static final private 方法默认会发布
    public String sayHi(String name) {
        return "hello" + name;
    }
    //发布
    public static void main(String[] args) {
        String address="http://127.0.0.1:11003/helloworld";
        // 注册并且发布一个服务,arg0: 服务地址 , arg1:要发布的服务对象
        Endpoint endPoint=Endpoint.publish(address,new HelloWorld());
        System.out.println("发布服务成功");
        // 可以停止服务,或者手动停止
        //endPoint.stop();
        //访问wsdl
        //http://127.0.0.1:11003/helloworld?WSDL
    }

}
