package com.zc.t06spring.cxf;

import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;
@WebService
public interface SecondWS
{
    String sayHi(@WebParam(name="text")String text);
    String sayHiToUser(User user);  
    String[] SayHiToUserList(List<User> userList);  
}
