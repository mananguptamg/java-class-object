import java.util.Scanner;

class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: " + amount);
        } else {
            System.out.println("Error: Deposit amount must be positive.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrawn: " + amount);
        } else if (amount > balance) {
            System.out.println("Error: Insufficient balance for withdrawal.");
        } else {
            System.out.println("Error: Withdrawal amount must be positive.");
        }
    }

    // Method to get current balance
    public double getBalance() {
        return balance;
    }

    // Method to display account details
    public void displayAccountInfo() {
        System.out.println("\nAccount Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }
}

public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Getting user details
        System.out.print("Enter the account holder's name: ");
        String accountHolder = scanner.nextLine();

        System.out.print("Enter the account number: ");
        String accountNumber = scanner.nextLine();

        System.out.print("Enter the initial balance: ");
        double balance = scanner.nextDouble();

        BankAccount bankAccount = new BankAccount(accountHolder, accountNumber, balance);
        bankAccount.displayAccountInfo();

        // Deposit
        System.out.print("\nEnter the amount to deposit: ");
        double depositAmount = scanner.nextDouble();
        bankAccount.deposit(depositAmount);
        System.out.println("Updated Balance: " + bankAccount.getBalance());

        // Withdraw
        System.out.print("\nEnter the amount to withdraw: ");
        double withdrawAmount = scanner.nextDouble();
        bankAccount.withdraw(withdrawAmount);
        System.out.println("Updated Balance: " + bankAccount.getBalance());

        scanner.close();
    }
}

//Sample Output
//Enter the account holder's name: Manan Gupta
//Enter the account number: 9922002
//Enter the initial balance: 11000
//
//Account Holder: Manan Gupta
//Account Number: 9922002
//Current Balance: 11000.0
//
//Enter the amount to deposit: 1100
//Successfully deposited: 1100.0
//Updated Balance: 12100.0
//
//Enter the amount to withdraw: 1100
//Successfully withdrawn: 1100.0
//Updated Balance: 11000.0

