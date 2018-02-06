package com.zc.t05ws.cxf.client;

import com.zc.t05ws.cxf.MyCXFServer;

public class MyCXFClient
{
    public static void main(String[] args)
    {
        MyCXFServer server=new MyCXFServer();
        System.out.println(server.sayHi("test"));
    }
}
