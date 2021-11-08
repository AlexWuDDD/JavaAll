package com.alex.Network;

import java.net.InetAddress;

import org.junit.Test;

public class InetAddressTest {

    /**
     * Java中使用InetAddress类代表IP
     */
    @Test
    public void test1(){
        try{
            InetAddress inet1 = InetAddress.getByName("192.168.1.9");
            InetAddress inet2 = InetAddress.getByName("www.baidu.com");
            InetAddress inet3 = InetAddress.getByName("127.0.0.1");
            InetAddress inet4 = InetAddress.getByName("Localhost");
            System.out.println(inet1);
            System.out.println(inet2);
            System.out.println(inet3);
            System.out.println(inet4);

            InetAddress localHost = InetAddress.getLocalHost();
            System.out.println(localHost);

            System.out.println(inet2.getHostName());
            System.out.println(inet2.getHostAddress());

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
