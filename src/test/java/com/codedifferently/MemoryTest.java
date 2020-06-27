package com.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class MemoryTest {

    @Test

    public void originalMemoryValueTest(){
        //given 
        Memory mem = new Memory(); 
        double expected = 0; 

        //when 
        double actual = mem.returnMemoryValue();

        //then
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test

    public void storeMemoryValueTest(){
        //given 
        SciCalculator sci = new SciCalculator(); 
        sci.setCurrentValue(25);
        Memory mem = new Memory(); 
        double expected = 25; 

        //when 
        mem.addToMemory();
        double actual = mem.returnMemoryValue();

        //then
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test

    public void clearMemoryValueTest(){
        //given 
        SciCalculator sci = new SciCalculator(); 
        sci.setCurrentValue(25);
        Memory mem = new Memory(); 
        double expected = 0; 

        //when 
        mem.addToMemory();
        mem.clearMemory();
        double actual = mem.returnMemoryValue();

        //then
        Assert.assertEquals(expected, actual, 0.001);
    }
    
}