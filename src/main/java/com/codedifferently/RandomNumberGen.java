package com.codedifferently;
//Creating a randomNumber generator as a cool feature
public class RandomNumberGen { 

    public double randomNumber(){ 
        SciCalculator.currValue = Math.random();
        return SciCalculator.currValue; 
    }

    //overloading the method to be able to choose a number in the range
    public int randomNumber(int min, int max){
        SciCalculator.currValue = ((Math.random()*((max-min)+1))+min);
        return (int) SciCalculator.currValue; 
        

    }


    
}