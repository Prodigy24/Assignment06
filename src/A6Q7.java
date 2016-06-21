
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author coulh9904
 */
public class A6Q7 {
public static int LastDigit(int L){
    if(L < 0){                                                                  //Ensures L is positive
        L = L * -1;
    }
    while(L > 9){                                                               //Since we're sure L is positive, we know that any time L is greater that 9 it is double digit, but once it's less than 9 it must be single.
        L = L / 10;                                                             //Divides L by 10 until it is less than 10.
    }
    return L;                                                                   //Done
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Please input the number");                          //This is very standard at this point
        Scanner input = new Scanner(System.in);
        int L = input.nextInt();                                                
        System.out.println(LastDigit(L));
    }
}
