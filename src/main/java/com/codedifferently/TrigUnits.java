package com.codedifferently;

public class TrigUnits {
     String[] trigUnits = {"DEG", "RAD", "GRAD"};
     int index = 0; 
     protected String trigMode = trigUnits[index];

    //our calculator is defaulted in degree mode
    public double convertToRadians(){
        double x = SciCalculator.currValue; 
        return SciCalculator.currValue = Math.toRadians(x);
     }

    public void switchTrigMode(){
         if(index == trigUnits.length - 1){
             index = 0; 
             trigMode = trigUnits[index]; 
         } else {
             index++; 
             trigMode = trigUnits[index]; 
         }
    }

    public void switchTrigMode(String mode){
         switch(mode){
             case "DEG": case "RAD": case "GRAD":
                System.out.println("Mode: "+ mode);
                trigMode = mode; 
                break;
            default:
                System.out.println("Unable to switch Trig Units");
         }

    }

    public String getTrigUnits(){
        return trigMode; 
    }


    
}