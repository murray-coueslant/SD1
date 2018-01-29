/* write a program that returns the tip and total cost when given a subtotal and a gratuity rate */

import java.text.DecimalFormat;
import java.util.Scanner;

public class ch2_2_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the subtotal and gratuity rate separated by a space: ");
        DecimalFormat df = new DecimalFormat("#.##");
        double subtotal = input.nextDouble();
        double gratuity_rate = input.nextDouble();
        double gratuity = subtotal * (gratuity_rate / 100);
        double total = subtotal + gratuity;
        System.out.println("The gratuity is $"+df.format(gratuity)+" and the total is $"+df.format(total)+".");
        input.close();

    }
}