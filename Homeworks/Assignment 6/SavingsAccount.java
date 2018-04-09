import java.util.Date;

public class SavingsAccount extends Account {
    public SavingsAccount(){
        super(0,0, new Date());
    }

    public SavingsAccount(int inId, double inBalance){
        super(inId, inBalance, new Date());
    }
    
    public String toString(){
        return "Account type: Savings, Balance: " + this.balance;
    }
}