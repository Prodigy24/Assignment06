


import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author coulh9904
 */
public class A6Q9 {
public static Boolean LastDigit(int L){
    boolean TF = true;
    if(L < 0){                                                                  //Ensures L is positive
        L = L * -1;
    }
    while(L > 0){                                                               
        int F = L % 10;
        if(F == 9 || F == 7 || F == 5 || F == 3 || F ==1){
            TF = false;
        }
        L = L / 10;
    }
    return TF;                                                                   
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Please input the number");                          
        Scanner input = new Scanner(System.in);
        int L = input.nextInt();                                                
        System.out.println(LastDigit(L));
    }
}