package com.zc.t01socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * <一句话功能简述>socket通信
 * <功能详细描述>
 * 
 * @author  Flyin
 * @version  [版本号, 2017年2月4日]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class MyServer
{
    public static void main(String[] args)
    {
        InputStream is = null;
        OutputStream os = null;
        try
        {
            ServerSocket server = new ServerSocket(11001);
            Socket socket = null;
            while (true)
            {
                socket = server.accept();
                System.out.println("accept success...");
                is = socket.getInputStream();
                byte[] b = new byte[1024];
                int len;
                StringBuffer sb = new StringBuffer();
                while ((len = is.read(b)) != -1)
                {
                    String str = new String(b, 0, len);
                    sb.append(str);
                    System.out.println("客户端传来:" + str);
                }
                System.out.println("1111");
                os = socket.getOutputStream();
                System.out.println("sb:"+sb.toString());
                os.write(sb.toString().toUpperCase().getBytes());
                os.flush();
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            if (is != null)
            {
                try
                {
                    is.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
            if (os != null)
            {
                try
                {
                    os.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }
}
