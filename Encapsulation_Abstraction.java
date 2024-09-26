/*

Encapsulation in Java is bundling data and related methods into a single unit,
[ hiding internal details and exposing only necessary information.]

[imp] encapsulation is a sub process of data hiding

real world example :
          The internals of an ATM , like cash withdrawal mechanism,
balance checking, and pin verification, are hidden from the user. Only relevant
actions like “Enter PIN” and “Withdraw Money” are exposed to the user.


example code :


class ATM {
    private double balance;  // Encapsulated balance (hidden data)

    public ATM(double initialBalance) {
        this.balance = initialBalance;
    }

    // Public method to access balance safely
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful! Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    // Getter for balance (if needed)
    public double getBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {
        ATM myATM = new ATM(1000.0);
        myATM.withdraw(200.0);  // Can withdraw money
        // myATM.balance = 5000.0;  // Error: cannot access private balance directly
    }
}

 */

/*
  Abstraction in Java [ hides complex details, showing only essential features
  of an object ]. It focuses on what an object does, not how it does it.

 real world example:
      The ATM allows users to perform operations like withdraw money,
check balance, and deposit cash, without needing to understand the inner
workings of these processes.



code :


abstract class Bank {
    // Abstract methods (no implementation)
    abstract void withdrawMoney(double amount);
    abstract void checkBalance();
}

class ATM extends Bank {
    private double balance = 1000;

    @Override
    void withdrawMoney(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful!");
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    @Override
    void checkBalance() {
        System.out.println("Your balance is: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        Bank atm = new ATM();  // Abstract reference to an ATM object
        atm.withdrawMoney(200.0);  // Withdraw money
        atm.checkBalance();  // Check remaining balance
    }
}

 */
public class Encapsulation_Abstraction {




    public static void main(String[] args) {

    }
}
