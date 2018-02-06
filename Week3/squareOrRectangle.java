import java.util.Scanner;

public class squareOrRectangle {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of sides your shape has: ");
        int numberOfSides = input.nextInt();
        System.out.print("Enter the number of right angles your shape has: ");
        int numberOfRights = input.nextInt();
        System.out.print("Are all the sides of your shape the same length? (enter 1 for yes, 0 for no): ");
        int equalSides = input.nextInt();
        if(numberOfSides == 4 && numberOfRights == 4 && equalSides == 1){
            System.out.println("Your shape is a square!");
        } else if(numberOfSides == 4 && numberOfRights == 4 && equalSides == 0){
            System.out.println("Your shape is a rectangle!");
        } else {
            System.out.println("Your shape is neither a square or a rectangle!");
        }
    }
}