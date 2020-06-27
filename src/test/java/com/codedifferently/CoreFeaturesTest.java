package com.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class CoreFeaturesTest {

    
    @Test
    public void addTest() {
        // Given

        //SciCalculator calc = new SciCalculator();
        double num = 10;
        SciCalculator sciCalculator = new SciCalculator();
        sciCalculator.setCurrentValue(num);
        CoreFeatures coreFeatures = new CoreFeatures();
        

        // When
        coreFeatures.add(5);
        double expectedValue = 15;
        double actualValue = sciCalculator.getCurrentValue();

        // Then
        Assert.assertEquals(expectedValue, actualValue, 0.001);
    }


    @Test 
    public void subtractTest(){
        // Given

        //SciCalculator calc = new SciCalculator();
        double num = 5;
        SciCalculator sciCalculator = new SciCalculator();
        sciCalculator.setCurrentValue(num);
        CoreFeatures coreFeatures = new CoreFeatures();
        

        // When
        coreFeatures.subtract(1);
        double expectedValue = 4;
        double actualValue = sciCalculator.getCurrentValue();

        // Then
        Assert.assertEquals(expectedValue, actualValue, 0.001);
    }

    @Test
    public void divideTest(){

        // Given
        double num = 15;
        SciCalculator sciCalculator = new SciCalculator();
        sciCalculator.setCurrentValue(num);
        CoreFeatures coreFeatures = new CoreFeatures();
        
        // When
        coreFeatures.divide(3);
        double expectedValue = 5;
        double actualValue = sciCalculator.getCurrentValue();

        // Then
        Assert.assertEquals(expectedValue, actualValue, 0.001);

    }

    @Test
    public void multiplyTest(){
        // Given

        //SciCalculator calc = new SciCalculator();
        double num = 5;
        SciCalculator sciCalculator = new SciCalculator();
        sciCalculator.setCurrentValue(num);
        CoreFeatures coreFeatures = new CoreFeatures();
        

        // When
        coreFeatures.multiply(3);
        double expectedValue = 15;
        double actualValue = sciCalculator.getCurrentValue();

        // Then
        Assert.assertEquals(expectedValue, actualValue, 0.001);
    }

    @Test
    public void squareTest(){
        // Given

        double num = 5;
        SciCalculator sciCalculator = new SciCalculator();
        sciCalculator.setCurrentValue(num);
        CoreFeatures coreFeatures = new CoreFeatures();
        

        // When
        coreFeatures.square();
        double expectedValue = 25;
        double actualValue = sciCalculator.getCurrentValue();

        // Then
        Assert.assertEquals(expectedValue, actualValue, 0.001);
    }

    @Test 
    public void squareRootTest() {
         // Given

         double num = 16;
         SciCalculator sciCalculator = new SciCalculator();
         sciCalculator.setCurrentValue(num);
         CoreFeatures coreFeatures = new CoreFeatures();
         
 
         // When
         coreFeatures.squareRoot();
         double expectedValue = 4 ;
         double actualValue = sciCalculator.getCurrentValue();
 
         // Then
         Assert.assertEquals(expectedValue, actualValue, 0.001);
    }

    @Test
    public void exponentTest(){
          // Given

          double num = 16;
          SciCalculator sciCalculator = new SciCalculator();
          sciCalculator.setCurrentValue(num);
          CoreFeatures coreFeatures = new CoreFeatures();
          
  
          // When
          coreFeatures.exponent(3);
          double expectedValue = 4096 ;
          double actualValue = sciCalculator.getCurrentValue();
  
          // Then
          Assert.assertEquals(expectedValue, actualValue, 0.001);
    }

    @Test
    public void inverseTest() {
          // Given

          double num = 16;
          SciCalculator sciCalculator = new SciCalculator();
          sciCalculator.setCurrentValue(num);
          CoreFeatures coreFeatures = new CoreFeatures();
          
  
          // When
          coreFeatures.inverse();
          double expectedValue = 0.0625;
          double actualValue = sciCalculator.getCurrentValue();
  
          // Then
          Assert.assertEquals(expectedValue, actualValue, 0.001);

    }

    @Test
    public void invertSignTest(){
          // Given
          double num = 16;
          SciCalculator sciCalculator = new SciCalculator();
          sciCalculator.setCurrentValue(num);
          CoreFeatures coreFeatures = new CoreFeatures();
          
  
          // When
          coreFeatures.invertSign();
          double expectedValue = -16;
          double actualValue = sciCalculator.getCurrentValue();
  
          // Then
          Assert.assertEquals(expectedValue, actualValue, 0.001);
    }

    @Test
    public void factorialTest(){
          // Given
          double num = 4;
          SciCalculator sciCalculator = new SciCalculator();
          sciCalculator.setCurrentValue(num);
          CoreFeatures coreFeatures = new CoreFeatures();
          
  
          // When
          coreFeatures.factorial();
          double expectedValue = 24;
          double actualValue = sciCalculator.getCurrentValue();
  
          // Then
          Assert.assertEquals(expectedValue, actualValue, 0.001);
    }

    @Test
    public void logTest(){
          // Given
          double num = 2;
          SciCalculator sciCalculator = new SciCalculator();
          sciCalculator.setCurrentValue(num);
          CoreFeatures coreFeatures = new CoreFeatures();
          
          // When
          coreFeatures.log();
          double expectedValue = 0.301;
          double actualValue = sciCalculator.getCurrentValue();
  
          // Then
          Assert.assertEquals(expectedValue, actualValue, 0.001);
    }

    @Test
    public void naturalLogTest(){
          // Given
          double num = 16;
          SciCalculator sciCalculator = new SciCalculator();
          sciCalculator.setCurrentValue(num);
          CoreFeatures coreFeatures = new CoreFeatures();
          
  
          // When
          coreFeatures.naturalLog();
          double expectedValue = 2.773;
          double actualValue = sciCalculator.getCurrentValue();
  
          // Then
          Assert.assertEquals(expectedValue, actualValue, 0.001);
    }
}