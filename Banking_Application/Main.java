package Banking_Application;

import ChatApplication.User;

import java.util.Map;
import java.util.Scanner;

public class Main {
    private static void printFeatures(){
        System.out.println("1. Create account");
        System.out.println("2. Display all account details");
        System.out.println("3. Transfer to another account");
        System.out.println("4. Search by account number");
        System.out.println("5. Deposit amount");
        System.out.println("6. Withdraw amount");
        System.out.println("7. Exit");
        System.out.print("Enter your choice: ");
    }
    public static void main(String[] args) {
        System.out.println("---------------------------------------------------------");
        System.out.println("--                  Welcome to Durdle-Bank                --");
        System.out.println("---------------------------------------------------------");
        Scanner in = new Scanner(System.in);
        boolean run = true;
        Bank bank = new Bank();

        while(run){
            printFeatures();
            int choice = in.nextInt();
            switch(choice){
                case 1: {
                    System.out.print("Enter your name: ");
                    String name  = in.next();
                    System.out.print("Enter account type: ");
                    String accountType = in.next();
                    System.out.print("Deposit initial balance: ");
                    long balance = in.nextLong();
                    UserDetails user =  new UserDetails(name,accountType,balance);
                    UserDetails.userMap.put(user.accountNumber,user);
                    Authentication.auth.put(user,user.pin);
                    System.out.println("\nAccount successfully created!");
                    System.out.println("Your account Number: ("+user.accountNumber+")");
                    System.out.println("--------------------------------------");
                    break;
                }
                case 2:{
                    System.out.println();
                    for (Map.Entry<Integer,UserDetails> mapElement : UserDetails.userMap.entrySet()) {
                        UserDetails user = mapElement.getValue();
                        System.out.println("Account number: "+user.accountNumber);
                        System.out.println("Account holder name: "+user.name);
                        System.out.println("Account Type: "+user.accountType);
                        System.out.println("--------------------------------------");
                    }
                        break;
                }
                case 3:{
                    bank.credit();
                    break;
                }
                case 4:{
                   bank.displayAccount();
                    break;
                }
                case 5:{
                    bank.deposit();
                    break;
                }
                case 6:{
                    bank.withdraw();
                    break;
                }
                case 7:{
                    System.out.println("Thanks for using our XYZ-Bank");
                    run = false;
                    break;
                }
            }
        }
    }
}
