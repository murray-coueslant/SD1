/* (Subclasses of Account) In Programming Exercise 9.7, the Account class was defined to model a bank account.
An account has the properties account number, balance, annual interest rate, and date created, and methods to
deposit and with- draw funds. Create two subclasses for checking and saving accounts. A checking account has an 
overdraft limit, but a savings account cannot be overdrawn.
Draw the UML diagram for the classes and then implement them. Write a test program that creates objects of 
Account, SavingsAccount, and CheckingAccount and invokes their toString() methods. */

public class ch11_11_3 {
    public static void main(String args[]){
        Account myAccount = new Account(1, 10000);
        CheckingAccount myCheckingAccount = new CheckingAccount(2, 10000, 100);
        SavingsAccount mySavingsAccount = new SavingsAccount(3, 10000);

        System.out.println("Account .toString() test: " + myAccount);
        System.out.println("Checking Account .toString() test: " + myCheckingAccount);
        System.out.println("Savings Account .toString() test: " + mySavingsAccount);
        
    }
}
