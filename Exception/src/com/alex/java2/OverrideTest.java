package com.alex.java2;

import java.io.FileNotFoundException;
import java.io.IOError;
import java.io.IOException;

public class OverrideTest {
     
}


class SuperClass{

    public void method() throws IOException{
    }
}

class SubClass extends SuperClass{
    
    @Override
    public void method() throws FileNotFoundException{
    }
}