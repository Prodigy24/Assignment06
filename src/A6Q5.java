
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author coulh9904
 */
public class A6Q5 {
public static String Chaotic(){                                                 //Creates Chaotic
    int RandNum = (int)(Math.random()*(5 - 1 + 1))+ 1;                          //Randomly generates a number between 0 and 6
    String Huh = "*";                                                   
    RandNum = RandNum - 1;                                                      //Uses number between 0 and 6 to print out the asterisk
    while(RandNum > 0){
        Huh = Huh + "*";                                                                                                             
        RandNum = RandNum - 1;                                                  //Ensures the method creates the number of asterisks equal to RandNum
    }
    return Huh;
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Please input the number of lines");                 //Requests user input
        Scanner input = new Scanner(System.in);                                 //Creates Input scanner
        int L = input.nextInt();                                                //Makes user input equal int L
        while(L > 0){                                                           //Loops Chaotic based on number of times user wants a line printed
        System.out.println(Chaotic());
        L = L - 1;
        }
    }
}
