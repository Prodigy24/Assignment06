
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author coulh9904
 */
public class A6Q8 {
//THIS IS COMPLETED BASED ENTIRELY ON THE DAYS FOR SEASON CHANGE PROVIDED IN ASSIGNMENT DESCRIPTION.
    public static String Seasons(int M, int D) {
        String Season = "If this appears you've the void in the seasons that exists on the assignment site.";
        if (M == 1) {
            Season.equals("The Season is Winter.");                                 //Prints the season, since this whole month is the same season
        }
        if (M == 2) {
            Season.equals("The Season is Winter.");
        }
        if (M == 3) {
            if (D < 15) {
                Season.equals("The Season is Winter.");                                 //Here is where the day comes in, as it's needed due to the season change mid-month.
            }
        } else {
            Season.equals("The Season is Spring.");
        }
        if (M == 4) {
            Season.equals("The Season is Spring.");
        }
        if (M == 5) {
            Season.equals("The Season is Spring.");
        }
        if (M == 6) {
            if (D < 15) {
                Season.equals("The Season is Spring.");
            }
        } else {
            Season.equals("The Season is Summer.");
        }
        if (M == 7) {
            Season.equals("The Season is Summer.");
        }
        if (M == 8) {
            Season.equals("The Season is Summer.");
        }
        if (M == 9) {
            if (D < 15) {
                Season.equals("The Season is Summer.");
            }
        } else {
            Season.equals("The Season is Fall.");
        }
        if (M == 10) {
            Season.equals("The Season is Fall.");
        }
        if (M == 11) {
            Season.equals("The Season is Fall.");
        }
        if (M == 12) {
            if (D < 15) {
                Season.equals("The Season is Fall.");
            }
        } else {
            Season.equals("The Season is Winter.");
        }
        return Season;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Please input the month");                           // M = Month
        Scanner input = new Scanner(System.in);
        int M = input.nextInt();
        System.out.println("Please input the day");                             //D = Day
        int D = input.nextInt();
        System.out.println(Seasons(M, D));                                      //Runs the method.
    }
}
