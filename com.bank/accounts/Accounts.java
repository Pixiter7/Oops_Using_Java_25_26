/* create a package com.bank and make subpackages - accounts, customers, loans, util
Package: com.bank.accounts:
    create a class Account with:
        accountNumber, balance, 
        Methods: deposit(), withdraw()
    create a class savingsAccount that extends Account:
        add interestRate
        Method: calculateInterest()

Package: com.bank.customers
    Create a class Customer with:
        customerId
        name
        Method to link an Account

Package: com.bank.loans
    Create a class Loan with:
        loanAmount
        Method: calculateEMI()
        Try accessing members of Account and observe access control behavior.

Package: com.bank.util
    Create a utility class BankUtil with:
        Static method to generate account number
        Static method to validate minimum balance

Main Class
    Create a main class BankApplication inside com.bank package that:
        Creates Customer and Account objects
        Performs deposit and withdrawal
        Calculates interest
        Uses static import for utility methods
        Demonstrates package access behavior
*/
public class Accounts {
    private String accountNumber;
    private double balance;

    public Accounts(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}