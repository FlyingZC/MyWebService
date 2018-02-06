package com.zc.t04ws.annotation;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;
//使用注解方式发布服务
@WebService(name="myServiceName",targetNamespace="http://zc.com")
public class MyAnnoService
{
    @WebMethod(operationName="myFunName")
    public @WebResult(name="returnName")String sayHi(@WebParam(name="myName") String name){
        return "Hello"+name;
    }
    public static void main(String[] args)
    {
        Endpoint end=Endpoint.publish("http://127.0.0.1:11004/annoserver", new MyAnnoService());
    }
}
