
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author coulh9904
 */
public class A6Q6 {
public static int LastDigit(int L){
    if(L < 0){
        L = L * -1;
    }
    L = L % 10;
    return L;
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
