//Day 3 Part 2
//R.Shahid

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class d3p2 {
    public static void main(String[] args) throws FileNotFoundException{
        
        String oxygen = "";
        String co2 = "";
        String cString = "";
        ArrayList<String> input = new ArrayList<String>();
        ArrayList<String> input2 = new ArrayList<String>();
        ArrayList<String> removeBits = new ArrayList<String>();
        Scanner s1 = new Scanner(new File("E:\\Users\\rakib\\Downloads\\input3.csv") );
        while (s1.hasNextLine()){
            cString = s1.nextLine();
            input.add(cString);
            input2.add(cString);
        }
        s1.close();
        

        //OXYGEN
        while (input.size()>1){
            for (int bitCharNum = 0; bitCharNum < 12; bitCharNum++){
                int ones = 0;
                int zeros = 0;
                for (String inputString: input){
                    if (inputString.charAt(bitCharNum) == '0'){
                        zeros++;
                    }
                    else {
                        ones++;
                    }
                }
                if (ones > zeros){
                    for (String inputString: input){
                        if (inputString.charAt(bitCharNum) == '0'){
                            removeBits.add(inputString);
                        }
                    }
                    for (String removeIndex: removeBits){
                        input.remove(removeIndex);
                    }
                    
                }
                else if (zeros>ones){
                    for (String inputString: input){
                        if (inputString.charAt(bitCharNum) == '1'){
                            removeBits.add(inputString);
                        }
                    }
                    for (String removeIndex: removeBits){
                        input.remove(removeIndex);
                    }
                    
                }
                else if (zeros == ones){
                    for (String inputString: input){
                        if (inputString.charAt(bitCharNum) == '0'){
                            removeBits.add(inputString);
                        }
                    }
                    for (String removeIndex: removeBits){
                        input.remove(removeIndex);
                    }
                }   
            }
            oxygen = input.get(0);
        }

        removeBits.clear();
        //CO2
        while (input2.size()>1){
            for (int bitCharNum = 0; bitCharNum < 12; bitCharNum++){
                int ones = 0;
                int zeros = 0;
                for (String inputString: input2){
                    if (inputString.charAt(bitCharNum) == '0'){
                        zeros++;
                    }
                    else {
                        ones++;
                    }
                }
                if (ones > zeros && ones != 0 && zeros != 0){
                    for (String inputString: input2){
                        if (inputString.charAt(bitCharNum) == '1'){
                            removeBits.add(inputString);
                        }
                    }
                    for (String removeIndex: removeBits){
                        input2.remove(removeIndex);
                    }
                    
                }
                else if (zeros>ones && ones != 0 && zeros != 0){
                    for (String inputString: input2){
                        if (inputString.charAt(bitCharNum) == '0'){
                            removeBits.add(inputString);
                        }
                    }
                    for (String removeIndex: removeBits){
                        input2.remove(removeIndex);
                    }
                    
                }
                else if (zeros == ones && ones != 0 && zeros != 0){
                    for (String inputString: input2){
                        if (inputString.charAt(bitCharNum) == '1'){
                            removeBits.add(inputString);
                        }
                    }
                    for (String removeIndex: removeBits){
                        input2.remove(removeIndex);
                    }
                }   
            }
            co2 = input2.get(0);
        }
        
        System.out.println("Oxygen Bit = "+oxygen);
        System.out.println("  CO2  Bit = "+co2);
        System.out.println("Oxygen Bit = "+Integer.parseInt(oxygen,2));
        System.out.println("  CO2  Bit = "+Integer.parseInt(co2,2));
        System.out.println(Integer.parseInt(co2,2)*Integer.parseInt(oxygen,2));
    }
}
