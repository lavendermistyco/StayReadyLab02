package com.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class TrigUnitsTest {
    
    @Test
    public void radiansTest(){
        //given
        SciCalculator sci = new SciCalculator(); 
        sci.setCurrentValue(30);
        TrigUnits trig = new TrigUnits();
        double expected = Math.toRadians(30); 

        //when
        trig.convertToRadians(); 
        double actual = sci.getCurrentValue(); 

        //then
        Assert.assertEquals(expected, actual, 0.001);

    }

    @Test 

    public void trigUnitsDisplayTest(){

        //given 
        TrigUnits trig = new TrigUnits(); 
        String expected = "RAD"; 

        //when
        trig.switchTrigMode();
        String actual = trig.getTrigUnits();

        //then 
        Assert.assertEquals(expected, actual);

    }

    @Test
    //Testing to see once we hit the last value in the array, the trig display goes back to index 0
    public void trigUnitsRotationTest(){
         //given 
         TrigUnits trig = new TrigUnits(); 
         String expected = "DEG"; 
 
         //when
         trig.switchTrigMode();
         trig.switchTrigMode();
         trig.switchTrigMode();
         String actual = trig.getTrigUnits();
 
         //then 
         Assert.assertEquals(expected, actual);

    }

    @Test 
    //Testing to make sure the default mode is in DEG
    public void originalModeTest(){
         //given 
         TrigUnits trig = new TrigUnits(); 
         String expected = "DEG"; 
 
         //when
         String actual = trig.getTrigUnits();
 
         //then 
         Assert.assertEquals(expected, actual);

    }

    
}