package com.zc.t06spring.cxf;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.jws.WebParam;
import javax.jws.WebService;
@WebService(endpointInterface="com.zc.t06spring.cxf.SecondWS",serviceName="SecondWS")
public class SecondWSImpl implements SecondWS
{
    Map<Integer,User> users=new LinkedHashMap<Integer,User>();
    public String sayHi(@WebParam(name="text")String text)
    {
        return "hello,"+text;
    }

    public String sayHiToUser(User user)
    {
        users.put(users.size()+1, user);
        return "Hello,"+user.getName();
    }

    public String[] SayHiToUserList(List<User> userList)
    {
        String[] result=new String[userList.size()];
        int i=0;
        for(User u:userList){
            result[i]="hello"+u.getName();
            i++;
        }
        return result;
    }

}
