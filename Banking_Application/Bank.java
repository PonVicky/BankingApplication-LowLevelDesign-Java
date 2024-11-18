package Banking_Application;

import ChatApplication.User;

import javax.print.MultiDocPrintService;
import java.util.Scanner;

public class Bank {
    Scanner in = new Scanner(System.in);

    public void credit(){
        System.out.println("Enter your account number: ");
        int accountNumber = in.nextInt();
        if(!UserDetails.userMap.containsKey(accountNumber)){
            System.out.println("Account doesn't exist");
            System.out.println("--------------------------------------");
            return;
        }
        UserDetails user = UserDetails.userMap.get(accountNumber);
        System.out.print("Enter your pin: ");
        int pin = in.nextInt();
        while(user.pin!=pin){
            System.out.print("Wrong pin: Try again: ");
            pin = in.nextInt();
        }

        System.out.println("Enter receiver account number: ");
        int pinR = in.nextInt();
        while(!UserDetails.userMap.containsKey(pinR)){
            System.out.print("Invalid receiver account number, Enter a valid one: ");
            pinR  = in.nextInt();
        }
        System.out.println("Enter the amount to send: ");
        long amount = in.nextLong();
        while(amount > user.balance){
            System.out.print("\nYour bank balance is lesser than "+amount+"! Enter correct amount to transfer:");
            amount = in.nextLong();
        }
        user.balance-=amount;
        UserDetails newUser = UserDetails.userMap.get(pinR);
        newUser.balance+=amount;
        System.out.println("\nAmount "+amount+" successfully sent to "+UserDetails.userMap.get(pinR).name+"("+pinR+")");
        System.out.println("--------------------------------------");

    }

    public void deposit(){
        System.out.print("Enter your account number: ");
        int accountNumber = in.nextInt();
        if(!UserDetails.userMap.containsKey(accountNumber)){
            System.out.println("Account doesn't exist");
            System.out.println("--------------------------------------");
            return;
        }
        UserDetails user = UserDetails.userMap.get(accountNumber);
        System.out.print("Enter your pin: ");
        int pin = in.nextInt();
        while(user.pin!=pin){
            System.out.print("Wrong pin. Try again: ");
            pin=in.nextInt();
        }
        System.out.print("Enter amount to deposit: ");
        long amount = in.nextLong();
        user.balance+=amount;

        System.out.println("\nSuccessfully amount "+amount+" added to your account!");
        System.out.println("Current balance: "+ user.balance);
        System.out.println("--------------------------------------");

    }

    public void withdraw(){
        System.out.print("Enter your account number: ");
        int accountNumber = in.nextInt();
        if(!UserDetails.userMap.containsKey(accountNumber)){
            System.out.println("Account doesn't exist");
            System.out.println("--------------------------------------");
            return;
        }
        UserDetails user = UserDetails.userMap.get(accountNumber);
        System.out.print("Enter your pin: ");
        int pin = in.nextInt();
        while(user.pin!=pin){
            System.out.print("Wrong pin. Try again: ");
            pin=in.nextInt();
        }

        System.out.print("Enter amount to withdraw: ");
        long amount = in.nextLong();
        if(amount>user.balance){
            System.out.println("\nYour bank balance is lesser than "+amount+" Transaction failed!");
            System.out.println("--------------------------------------");
            return;
        }
        user.balance-=amount;
        System.out.println("\nAmount "+amount+" successfully withdrawn from your account!");
        System.out.println("Current account balance:"+user.balance);
        System.out.println("--------------------------------------");

    }

    public void displayAccount(){
        System.out.print("Enter your account number: ");
        int accountNumber = in.nextInt();
        if(!UserDetails.userMap.containsKey(accountNumber)){
            System.out.println("Account doesn't exist");
            System.out.println("--------------------------------------");
            return;
        }
        UserDetails user = UserDetails.userMap.get(accountNumber);
        System.out.print("Enter your pin: ");
        int pin = in.nextInt();
        while(user.pin!=pin){
            System.out.print("Wrong pin. Try again: ");
            pin=in.nextInt();
        }
        System.out.println();
        System.out.println("Account number: "+user.accountNumber);
        System.out.println("Account holder name: "+user.name);
        System.out.println("Account Type: "+user.accountType);
        System.out.println("Account Balance: "+user.balance);
        System.out.println("--------------------------------------");
    }
}
