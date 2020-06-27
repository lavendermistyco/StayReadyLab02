package com.codedifferently;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class SciCalculatorTest 
{
  
    @Test

    public void setValueTest(){
        //Given 
        SciCalculator sci = new SciCalculator(3);
        double expected = 3;

        //When
        double actual = sci.getCurrentValue(); 

        //Then
        Assert.assertEquals(expected, actual, 0.001);

    }
    
}
