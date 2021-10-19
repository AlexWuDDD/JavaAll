package com.alex.system;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.junit.Test;

public class OtherClassTest {
    
    @Test
    public void test1(){
        String javaVersion = System.getProperty("java.version");
        System.out.println(javaVersion);

        String javaHome = System.getProperty("java.home");
        System.out.println(javaHome);

        String javaVendor = System.getProperty("java.vendor");
        System.out.println(javaVendor);

        String osName = System.getProperty("os.name");
        System.out.println(osName);

        String osVersion = System.getProperty("os.version");
        System.out.println(osVersion);

        String userName = System.getProperty("user.name");
        System.out.println(userName);

        String userHome = System.getProperty("user.home");
        System.out.println(userHome);

        String userDir = System.getProperty("user.dir");
        System.out.println(userDir);
    }

    @Test
    public void testBigInteger(){
        BigInteger bi = new BigInteger("12433241123");
        BigDecimal bd = new BigDecimal("12435.351");
        BigDecimal bd2 = new BigDecimal("11");
        System.out.println(bi);

        System.out.println(bd.divide(bd2, BigDecimal.ROUND_HALF_UP));
        System.out.println(bd.divide(bd2, 15, BigDecimal.ROUND_HALF_UP));

    }
}
