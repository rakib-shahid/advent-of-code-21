//Day 3 Part 1
import java.io.*;
import java.util.Scanner;

public class d3p1 {
    public static void main(String[] args) throws FileNotFoundException{
        
        String gammaBit = "";
        String epsilonBit = "";
        int ones = 0;
        int zeros = 0;
        String cString = "";
        for (int i = 0; i < 12; i++){
            Scanner s1 = new Scanner(new File("E:\\Users\\rakib\\Downloads\\input3.csv") );
            ones = 0;
            zeros = 0;
            while (s1.hasNextLine()){
                cString = s1.nextLine();
                if (cString.charAt(i) == '0'){
                    zeros++;
                }
                if (cString.charAt(i) == '1'){
                    ones++;
                }
                
            }
            s1.reset();
            if (ones > zeros){
                gammaBit += "1";
                epsilonBit += "0";
            }
            else if (zeros > ones){
                gammaBit += "0";
                epsilonBit += "1";
            }
        }
        System.out.println("gamma bit = "+gammaBit);
        System.out.println("epsilon bit = "+epsilonBit);
    }
}
