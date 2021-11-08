package com.alex.Network.UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

import org.junit.Test;

public class UDPTest {
    
    @Test
    public void send(){

        DatagramSocket socket = null;

        try{
            socket = new DatagramSocket();

            String str = "我是UDP方式发送的导弹";
            byte[] data = str.getBytes();
            InetAddress inet = InetAddress.getByName("127.0.0.1");
            DatagramPacket packet = new DatagramPacket(data, 0, data.length, inet, 9090);
            socket.send(packet);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
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
    public void receive(){
        
        DatagramSocket socket = null;
        try{
            socket = new DatagramSocket(9090);

            byte[] data = new byte[1024];
            DatagramPacket packet = new DatagramPacket(data, 0, data.length);
            socket.receive(packet);

            System.out.println(new String(packet.getData(), 0, packet.getLength()));
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
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

}
