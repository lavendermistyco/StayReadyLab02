package com.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class TrigFunctionsTest {

    @Test

    public void sineTest(){

        //given 
        SciCalculator sci = new SciCalculator(); 
        sci.setCurrentValue(30);
        TrigFunctions trig = new TrigFunctions();
        double expected = Math.sin(30); 
        //when 
        trig.sine(); 
        double actual = sci.getCurrentValue(); 

        //then
        Assert.assertEquals(expected,actual, 0.001);

    }

    @Test

    public void cosineTest(){

        //given 
        SciCalculator sci = new SciCalculator(); 
        sci.setCurrentValue(30);
        TrigFunctions trig = new TrigFunctions();
        double expected = Math.cos(30); 
        //when 
        trig.cosine(); 
        double actual = sci.getCurrentValue(); 

        //then
        Assert.assertEquals(expected,actual, 0.001);

    }

    @Test

    public void tangentTest(){

        //given 
        SciCalculator sci = new SciCalculator(); 
        sci.setCurrentValue(30);
        TrigFunctions trig = new TrigFunctions();
        double expected = Math.tan(30); 
        //when 
        trig.tangent(); 
        double actual = sci.getCurrentValue(); 

        //then
        Assert.assertEquals(expected,actual, 0.001);

    }

    @Test

    public void inverseSineTest(){

        //given 
        SciCalculator sci = new SciCalculator(); 
        sci.setCurrentValue(45);
        TrigFunctions trig = new TrigFunctions();
        double expected = Math.asin(45); 
        //when 
        trig.inverseSine(); 
        double actual = sci.getCurrentValue(); 

        //then
        Assert.assertEquals(expected,actual, 0.001);

    }

    @Test

    public void inverseCosineTest(){

        //given 
        SciCalculator sci = new SciCalculator(); 
        sci.setCurrentValue(45);
        TrigFunctions trig = new TrigFunctions();
        double expected = Math.acos(45); 
        //when 
        trig.inverseCosine(); 
        double actual = sci.getCurrentValue(); 

        //then
        Assert.assertEquals(expected,actual, 0.001);

    }

    @Test

    public void inverseTanTest(){

        //given 
        SciCalculator sci = new SciCalculator(); 
        sci.setCurrentValue(45);
        TrigFunctions trig = new TrigFunctions();
        double expected = Math.atan(45); 
        //when 
        trig.inverseTan(); 
        double actual = sci.getCurrentValue(); 

        //then
        Assert.assertEquals(expected,actual, 0.001);

    }




    
}