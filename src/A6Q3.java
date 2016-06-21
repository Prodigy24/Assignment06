
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author coulh9904
 */
public class A6Q3 {

    public static String Factors(int F) { //F is the intiger to be factored
        String ans = "The factors are as follows"; 
        int x = 1; 
        while (x <= F) { 
            int R = F % x; //Apparently this is what finds the remainder
            if (R == 0) {//R is the remainder
                int y = F / x;
                ans = (ans + "," + y);
            }
            x = (x + 1); //Restarts process with one number up from previous.
        }
        return ans;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Please input a number.");
        Scanner input = new Scanner(System.in);
        int F = input.nextInt();
        Factors(F);
        System.out.println(Factors(F));
    }
}
