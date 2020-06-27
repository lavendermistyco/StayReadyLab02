package com.codedifferently;

public class Memory {
    protected double memoryValue = 0;

    public void addToMemory(){
        memoryValue = SciCalculator.currValue; 
    } 

    public void clearMemory(){
        memoryValue = 0; 
    }

    //returning the memory value
    public double returnMemoryValue(){
        return SciCalculator.currValue = memoryValue; 
    }

    
}