package com.codedifferently;

// this class is for displaying in hexadecimal, octal, etc. 
public class DisplayMode {
    String[] displays = {"binary", "octal", "decimal", "hexadecimal"}; 
    int indexMode = 2; 
    protected String whichMode = displays[indexMode]; 

    public void switchDisplayMode(){
        if(indexMode == displays.length - 1){
            indexMode = 0; 
            whichMode = displays[indexMode]; 
        } else {
            indexMode++; 
            whichMode = displays[indexMode]; 
        }
    }

    public void switchDisplayMode(String mode){
        switch(mode){
            case "binary": case "octal": case "decimal": case "hexadecimal":
                System.out.println("The display mode is in "+ mode);
                whichMode = mode;
                break;
            default: 
                System.out.println("Invalid mode");
        }
    }

    public String getMode(){
        return whichMode; 
    }


    
}