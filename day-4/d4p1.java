import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class d4p1 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner s1 = new Scanner(new File("E:\\Users\\rakib\\Downloads\\input4.csv"));
        ArrayList<String> bingoNums = new ArrayList<String>();
        ArrayList<String> bingoBoards = new ArrayList<String>();
        for (int i = 0; i < 100; i++){
            s1.useDelimiter(",");
            bingoNums.add(s1.next());

            
        }
        bingoNums.remove(99); 
        bingoNums.add("99");
        
    }
}
