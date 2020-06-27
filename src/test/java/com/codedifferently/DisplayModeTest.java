package com.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class DisplayModeTest {

    @Test

    public void displayTest(){
        //given 
        DisplayMode mode = new DisplayMode(); 
        String expected = "hexadecimal";

        //when
        mode.switchDisplayMode();
        String actual = mode.getMode(); 

        //then
        Assert.assertEquals(expected, actual);

    }

    @Test
    //Tests to see if it goes to the first value in the array.
    public void displayRotationTest(){

         //given 
         DisplayMode mode = new DisplayMode(); 
         String expected = "binary";
 
         //when
         mode.switchDisplayMode();
         mode.switchDisplayMode();
         String actual = mode.getMode(); 
 
         //then
         Assert.assertEquals(expected, actual);

    }

    @Test

    //Test to see if original mode is in decimal
    public void originalModeTest(){
         //given 
         DisplayMode mode = new DisplayMode(); 
         String expected = "decimal";
 
         //when
         String actual = mode.getMode(); 
 
         //then
         Assert.assertEquals(expected, actual);
    }


    
}