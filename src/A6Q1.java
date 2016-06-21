
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author coulh9904
 */
public class A6Q1 {
public static double CircleArea(int R){
    double ans = Math.PI * (R * R);
    return ans;
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Please enter the radius of your circle.");
        Scanner input = new Scanner(System.in);
        int R = input.nextInt();
        System.out.println("The radius of your circle is " + CircleArea(R));
    }
}
