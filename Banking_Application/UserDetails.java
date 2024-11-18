package Banking_Application;

import java.util.HashMap;

public class UserDetails extends Authentication{
    static int userId = 2020102095;
    int accountNumber;
    String name;
    long balance;
    String accountType;//savings current salary
    int pin;
    static HashMap<Integer, UserDetails> userMap = new HashMap<>();
    public UserDetails(String name, String accountType, long balance){
        this.name = name;
        this.accountType = accountType;
        this.balance = balance;
        accountNumber = userId++;
        pin = createPassword();
    }
}
