package com.alex.Network.TCP;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

import org.junit.Test;

public class TCPTest3 {

    private String srcFile = "/Users/alexwu/Documents/JavaNotes/IOStream/src/com/alex/Network/TCP/dog.jpeg";
    private String dstFile = "/Users/alexwu/Documents/JavaNotes/IOStream/src/com/alex/Network/TCP/dog3.jpeg";
    
    @Test
    public void TCPClient(){
        Socket socket = null;
        OutputStream os = null;
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        InputStream is = null;
        ByteArrayOutputStream baos = null;

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

            //关闭数据的传输
            socket.shutdownOutput();

            is = socket.getInputStream();
            baos = new ByteArrayOutputStream();
            byte[] buf2 = new byte[20];
            int len2 = 0;
            while((len2 = is.read(buf2)) != -1){
                baos.write(buf2, 0, len2);
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
        OutputStream os = null;

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
            System.out.println("图片接收完成");

            //服务器给予客户端反馈
            os = socket.getOutputStream();
            os.write("你好，美女，照片我已收到".getBytes());

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

