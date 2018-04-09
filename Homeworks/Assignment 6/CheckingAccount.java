import java.util.Date;

public class CheckingAccount extends Account {
    private double overdraftLimit;
  
    public CheckingAccount(){
      super(0, 0.0, new Date());
      overdraftLimit = 100;
    }
  
    public CheckingAccount(int inId, double inBalance, double inOverdraft){
      super(inId, inBalance, new Date());
      overdraftLimit = inOverdraft;
    }
    @Override
    public double withdraw(double withdrawAmount){
      this.balance -= withdrawAmount;
      if (this.balance < -this.overdraftLimit){
        this.balance += withdrawAmount;
        System.out.println("Cannot withdraw $" + withdrawAmount + ", exceeds overdraft limit.");
        return this.balance;
      }
      return this.balance;
    }

    public String toString(){
        return "Account type: Checking, Balance: " + this.balance + " Overdraft Limit: " + this.overdraftLimit;
    }
  }