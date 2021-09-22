package com.alex.test;

import com.alex.java.Calculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Test1 {
    
    @Test
    public void TestAdd(){

        Calculator calculator = new Calculator();
        int sum = calculator.add(1, 2);
        assertEquals(3, sum);
    }

    @Test
    public void TestMins(){

        Calculator calculator = new Calculator();
        int diff = calculator.minus(1, 2);
        assertEquals(-2, diff);
    }
}
