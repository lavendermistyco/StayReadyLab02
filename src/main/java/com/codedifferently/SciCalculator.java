package com.codedifferently;

import java.util.Scanner;


/**
 * Scientific Calculator
 * @Version 1
 * @Faith Wilkins El
 *
 */
public class SciCalculator 
{   
    protected static double currValue; //value that will be displayed on the calc screen
    protected DisplayMode mode;  
    protected TrigFunctions trigFunctions; 
    protected Memory memory; 
    protected CoreFeatures coreFeatures; 
    protected TrigUnits trigUnits; 
    protected RandomNumberGen randomGen;


    public SciCalculator(){
        currValue = 0; 
        mode = new DisplayMode(); 
        trigFunctions = new TrigFunctions(); 
        memory = new Memory(); 
        coreFeatures = new CoreFeatures(); 
        trigUnits = new TrigUnits();
        randomGen = new RandomNumberGen();
    }

    public SciCalculator(double x){
        this();
        currValue = x;
    }

   // Mutator: 
    public void setCurrentValue(double input) {
        SciCalculator.currValue = input;
    }
   //Accessors:
    public double getCurrentValue(){
        return SciCalculator.currValue;
    }

    public void clearDisplayValue(){
        SciCalculator.currValue = 0; 
    }

    public static void main( String[] args ){
        SciCalculator sci = new SciCalculator(); 
        Scanner input = new Scanner(System.in); 
        System.out.println("Welcome to the Random Number Generator feature!");
        System.out.println("Please enter a min value: ");
        int min = input.nextInt();
        System.out.println("Please enter a max value: ");
        int max = input.nextInt();

        System.out.println("Random Number Generated: " + sci.randomGen.randomNumber(min, max));

        input.close(); 
          
    }
}
