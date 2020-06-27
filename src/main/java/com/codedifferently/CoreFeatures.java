package com.codedifferently;

public class CoreFeatures {


    public double add(double x){
        return SciCalculator.currValue += x; 
    }

    public double subtract(double x){
        return SciCalculator.currValue -= x;
    }

    public double divide(double x){
        try {
            SciCalculator.currValue /= x; 
        } catch (ArithmeticException e) {
            System.out.println("Can't be divided by zero"+e);
        }
        return SciCalculator.currValue; 
    }

    public double multiply(double x){
        return SciCalculator.currValue *= x; 
    }

    public double square(){
        return SciCalculator.currValue *= SciCalculator.currValue;
    }

    public double squareRoot(){
        double temp; 
        double number = SciCalculator.currValue /2; 

        do {
            temp = number; 
            number = (temp + (SciCalculator.currValue / temp)) /2; 
            
        } while ((temp - number) != 0); 

        return SciCalculator.currValue = number;
        //return java.lang.Math.sqrt(SciCalculator.currValue);
    }

    public double exponent(double exp){
        return SciCalculator.currValue = java.lang.Math.pow(SciCalculator.currValue, exp);
    }

    public double inverse(){
        return SciCalculator.currValue = 1/SciCalculator.currValue ;
    }

    public double invertSign(){
        return SciCalculator.currValue = SciCalculator.currValue * -1; 
    }

    public double factorial(){
        double factorial = 1; 
        int number = (int) SciCalculator.currValue;
        for(int i = 1; i <= number; i++ ){
            factorial *= i;
        }

        return SciCalculator.currValue = factorial; 
    }

    public double log(){
        return SciCalculator.currValue = Math.log10(SciCalculator.currValue); 
    }

    public double naturalLog(){
        return SciCalculator.currValue = Math.log(SciCalculator.currValue); 
    }

    
}