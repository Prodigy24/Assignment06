
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author coulh9904
 */
public class A6Q10 {

    public static Boolean SameDashes(String L, String H) {                      //Creates Boolean with L and H
        boolean TF = false;                                                     //Gives Boolean a return
        int X = 0;  
        while(X < L.length()){                                                  //Makes loop run as many times as it needs to without continuing past the lenght of the word
            String F = L.substring(0, X);                                       //Saving first part of String, up to X
            L = L.substring(X + 1, L.length());                                 //Saving second part past X
            if(L.startsWith("-")){                                              //Checking to see if the new start of L is a dash
                L = F + L;                                                      //If equals a dash, leave the dash and move on
            } else {
                L = F + "0" + L;                                                //If not, replace the letter/number with a zero and move on
            }
            X = X + 1;                                                          //Increases the X value so the loop may go through the word
        }     
        X = 0;
        while(X < H.length()){                                                  //This is just a douplication for H.
            String F = H.substring(0, X);
            H = H.substring(X + 1, H.length());
            if(H.startsWith("-")){  
                H = F + H;
            } else {
                H = F + "0" + H;
            }
            X = X + 1;
            System.out.println();
        }
       if(H.equals(L)){                                                         //If both L and H now match, boolean is cchanged to true
           TF = true;
       }
       return TF;                                                               //Complete method
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {                                    //This is standard
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Please input the first thing.");
        String L = input.nextLine();
        System.out.println("Please input the second thing.");
        String H = input.nextLine();
        System.out.println(SameDashes(L, H));
    }
}
