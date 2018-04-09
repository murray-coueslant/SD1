/*
Design a class named Account that contains:
    ■ A private int data field named id for the account (default 0).
    ■ A private double data field named balance for the account (default 0).
    ■ A private double data field named annualInterestRate that stores the current 
      interest rate (default 0). Assume all accounts have the same interest rate.
    ■ A private Date data field named dateCreated that stores the date when the
      account was created.
    ■ A no-arg constructor that creates a default account.
    ■ A constructor that creates an account with the specified id and initial balance.
    ■ The accessor and mutator methods for id, balance, and annualInterestRate.
    ■ The accessor method for dateCreated.
    ■ A method named getMonthlyInterestRate() that returns the monthly
      interest rate.
    ■ A method named getMonthlyInterest() that returns the monthly interest.
    ■ A method named withdraw that withdraws a specified amount from the
      account.
    ■ A method named deposit that deposits a specified amount to the account.
Draw the UML diagram for the class and then implement the class.

(Hint: The method getMonthlyInterest() is to return monthly interest, not the interest rate. 
Monthly interest is balance * monthlyInterestRate. monthlyInterestRate is annualInterestRate / 12. 
Note that annualInterestRate is a percentage, e.g., like 4.5%. You need to divide it by 100.)

Write a test program that creates an Account object with an account ID of 1122, 
a balance of $20,000, and an annual interest rate of 4.5%. Use the withdraw method to 
withdraw $2,500, use the deposit method to deposit $3,000, and print the balance, the monthly interest, 
and the date when this account was created.
*/
import java.util.Date;

public class Account {
    public int id;
    public double balance;
    public double annualInterestRate;
    public Date dateCreated;

    public Account(){
        id = 0;
        balance = 0;
        annualInterestRate = 0;
        dateCreated = new Date();
    }

    public Account(int inId, double inBalance){
      id = inId;
      balance = inBalance;
      annualInterestRate = 0;
      dateCreated = new Date();
    }

    public Account(int inId, double inBalance, Date inDate){
      id = inId;
      balance = inBalance;
      annualInterestRate = 0;
      dateCreated = inDate;
    }

    public int getId(){
      return this.id;
    }

    public void setId(int inId){
      this.id = inId;
    }

    public double getBalance(){
      return this.balance;
    }

    public void setBalance(double inBalance){
      this.balance = inBalance;
    }

    public double getAnnualInterest(){
      return this.annualInterestRate;
    }

    public void setAnnualInterest(double inAnnualInterest){
      this.annualInterestRate = inAnnualInterest;
    }

    public Date getDateCreated(){
      return this.dateCreated;
    }

    public double getMonthlyInterestRate(){
      double monthlyInterestRate = ((this.annualInterestRate / 100) / 12) * 100;
      return monthlyInterestRate;
    }

    public double getMonthlyInterest(){
      double monthlyInterest = this.balance * (((this.annualInterestRate / 100) / 12) * 100);
      return monthlyInterest;
    }

    public double withdraw(double withdrawAmount){
      this.balance -= withdrawAmount;
      return this.balance;
    }

    public double deposit(double depositAmount){
      this.balance += depositAmount;
      return this.balance;
    }

    public String toString(){
      return "Account type: Account, Balance: " + this.balance;
    }

}

