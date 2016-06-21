
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author coulh9904
 */
public class A6Q4 {

    public static double CompoundInterest(int N, double P, double R) {          //Creates Method.
        double Balance = P * Math.pow((1 + R), N);                              //Calculates interest
        return Balance;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Please input the Principle Amount.");               //These inputs get the necessary info from the user 
        Scanner input = new Scanner(System.in);
        double P = input.nextDouble();
        System.out.println("Please input the Interest Rate.");
        double R = input.nextDouble();
        System.out.println("Please input the Length of Time you wish to calcualte in years.");
        int N = input.nextInt();
        CompoundInterest(N, P, R);                                              //Runs the method
        System.out.println("The Compound Interst is " + CompoundInterest(N, P, R));
    }
}
