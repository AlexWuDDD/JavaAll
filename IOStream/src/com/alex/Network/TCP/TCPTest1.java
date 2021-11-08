package com.alex.Network.TCP;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

import org.junit.Test;

public class TCPTest1 {
    
    @Test
    public void client(){
        Socket socket = null;
        OutputStream os = null;

        try{
            InetAddress inet = InetAddress.getByName("127.0.0.1");
            socket = new Socket(inet, 8899);

            os = socket.getOutputStream();
            os.write("你好, 我是客户端".getBytes());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            if(os != null){
                try{
                    os.close();
                }
                catch(Exception e){
                    System.out.println(e.getMessage());
                }
            }

            if(socket != null){
                try{
                    socket.close();
                }
                catch(Exception e){
                    System.out.println(e.getMessage());
                }
            }
        }
        
    }

    @Test
    public void server(){

        ServerSocket serverSocket = null;
        InputStream is = null;
        ByteArrayOutputStream baos = null;
        Socket socket = null;

        try{
            serverSocket = new ServerSocket(8899);
            
            socket = serverSocket.accept();
            is = socket.getInputStream();

            baos = new ByteArrayOutputStream();
            byte[] buffer = new byte[5];
            int len = 0;
            while((len = is.read(buffer)) != -1){
                baos.write(buffer, 0, len);
            }
            System.out.println(baos.toString());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{

            if(baos != null){
                try{
                    baos.close();
                }
                catch(Exception e){
                    System.out.println(e.getMessage());
                }
            }

            if(is != null){
                try{
                    is.close();
                }
                catch(Exception e){
                    System.out.println(e.getMessage());
                }
            }

            if(socket != null){
                try{
                    socket.close();
                }
                catch(Exception e){
                    System.out.println(e.getMessage());
                }
            }

            if(serverSocket != null){
                try{
                    serverSocket.close();
                }
                catch(Exception e){
                    System.out.println(e.getMessage());
                }
            }
        }

    }
}
