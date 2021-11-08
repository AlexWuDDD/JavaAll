package com.alex.Network.TCP;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

import org.junit.Test;

public class TCPTest2 {

    private String srcFile = "/Users/alexwu/Documents/JavaNotes/IOStream/src/com/alex/Network/TCP/dog.jpeg";
    private String dstFile = "/Users/alexwu/Documents/JavaNotes/IOStream/src/com/alex/Network/TCP/dog2.jpeg";
    
    @Test
    public void TCPClient(){
        Socket socket = null;
        OutputStream os = null;
        FileInputStream fis = null;
        BufferedInputStream bis = null;

        try{
            socket = new Socket(InetAddress.getByName("127.0.0.1"), 8888);
            os = socket.getOutputStream();

            fis = new FileInputStream(new File(srcFile));
            bis = new BufferedInputStream(fis);

            byte[] buf = new byte[1024];
            int len = 0;
            while((len = bis.read(buf)) != -1){
                os.write(buf, 0, len);
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{

            if(bis != null){
                try{
                    bis.close();
                }
                catch(Exception e){
                    System.out.println(e.getMessage());
                }
            }

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
    public void TCPServer(){

        ServerSocket serverSocket = null;
        InputStream is = null;
        BufferedInputStream bis = null;
        Socket socket = null;
        FileOutputStream fos = null;

        try{
            serverSocket = new ServerSocket(8888);
            socket = serverSocket.accept();

            is = socket.getInputStream();
            bis = new BufferedInputStream(is);

            fos = new FileOutputStream(new File(dstFile));

            byte[] buf = new byte[1024];
            int len;
            while((len = bis.read(buf)) != -1){
                fos.write(buf, 0, len);
            }
            
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{

            if(fos != null){
                try{
                    fos.close();
                }
                catch(Exception e){
                    System.out.println(e.getMessage());
                }
            }

            if(bis != null){
                try{
                    bis.close();
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
