import java.text.DecimalFormat;
import java.util.Scanner;

public class ch2_2_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a monthly savings value: ");
        double save_val = input.nextDouble();
        double account_val = 0;
        for (int x=0;x<6;x++){
            account_val = (save_val + account_val) * (1 + 0.00417);
        }
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("The value in the account after the sixth month is $"+ df.format(account_val));
    }
}