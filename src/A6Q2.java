
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author coulh9904
 */
public class A6Q2 {
public static void examGrade(int G){
            if(50 > G){
                System.out.println("You have failed. Good try. Your letter grade is an R.");
            }
            if(50 <= G && G <= 59){
                System.out.println("Your letter grade is a D.");
            }
            if(60 <= G && G <= 68){
                System.out.println("Your letter grade is a C.");
            }
            if(70 <= G && G <= 79){
                System.out.println("Your letter grade is a B.");
            }
            if(80 <= G && G <= 100){
                System.out.println("Your letter grade is an A.");
            }
        }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
System.out.println("Please enter your grade percentage as a number. The system will output a letter grade.");
        Scanner input = new Scanner(System.in);
        int G = input.nextInt();
        examGrade(G);
    }
}
