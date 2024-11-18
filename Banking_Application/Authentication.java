package Banking_Application;

import java.util.HashMap;
import java.util.Scanner;

public class Authentication {
    static HashMap<UserDetails,Integer> auth = new HashMap<>();
    Scanner in = new Scanner(System.in);
    public int createPassword(){
        System.out.print("Enter your pin(4-Digit): ");
        int pin  = in.nextInt();
        int n = (int)(Math.log10(pin)+1);
       while(n!=4){
           System.out.print("Invalid pin. Enter a valid pin: ");
           pin = in.nextInt();
           n = (int)(Math.log10(pin)+1);
       }
        System.out.print("Re-enter your pin: ");
       int pin2 = in.nextInt();
       while(pin != pin2) {
           System.out.print("Pins doesn't match. Enter correct pin: ");
            pin2 = in.nextInt();
       }

       return pin;
    }

    public void authenticate(){

    }
}
