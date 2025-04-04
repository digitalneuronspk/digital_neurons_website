// BankAccount class encapsulating the account holder's name and balance
class BankAccount {
    // Private fields
    private String accountHolderName;
    private double balance;

    // Constructor to initialize bank account details
    public BankAccount(String accountHolderName, double initialBalance) {
        this.accountHolderName = accountHolderName;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0; // Set balance to 0 if the initial balance is invalid
        }
    }

    // Getter method for account holder's name
    public String getAccountHolderName() {
        return accountHolderName;
    }

    // Getter method for balance
    public double getBalance() {
        return balance;
    }

    // Setter method for depositing money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("$" + amount + " deposited successfully.");
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Setter method for withdrawing money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("$" + amount + " withdrawn successfully.");
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }
}

// Class with main method to test the BankAccount class
public class EncapsulationExample {
    public static void main(String[] args) {
        // Create an object of BankAccount with account holder name "John Doe" and initial balance of $500.00
        BankAccount account = new BankAccount("John Doe", 500.00);

        // Using getter methods to retrieve the account holder's name and balance
        System.out.println("Account Holder: " + account.getAccountHolderName());
        System.out.println("Initial Balance: $" + account.getBalance());

        // Using setter methods (deposit and withdraw)
        account.deposit(200.00); // Deposit $200.00
        System.out.println("Updated Balance after deposit: $" + account.getBalance());

        account.withdraw(100.00); // Withdraw $100.00
        System.out.println("Updated Balance after withdrawal: $" + account.getBalance());

        // Trying to withdraw more money than available
        account.withdraw(700.00); // Insufficient balance attempt
    }
}
