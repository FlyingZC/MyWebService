package com.zc.t01socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class MySocketClient
{
    public static void main(String[] args)
    {
        OutputStream os=null;
        InputStream is=null;
        Socket socket=null;
        try
        {
            socket=new Socket("localhost",11001);
            os=socket.getOutputStream();
            os.write(new String("hsfhsdhhehdsfsd").getBytes());
            is=socket.getInputStream();
            byte[] b=new byte[1024];
            int len=-1;
            while(true){
                while((len=is.read(b))!=-1){
                    String str=new String(b,0,len);
                    System.out.println("传来"+str);
                }
            }
        }
        catch (UnknownHostException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }finally{
            if(is!=null){
                try
                {
                    is.close();
                }
                catch (IOException e)
                {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            if(os!=null){
                try
                {
                    os.close();
                }
                catch (IOException e)
                {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            if(socket!=null){
                try
                {
                    socket.close();
                }
                catch (IOException e)
                {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }
}
