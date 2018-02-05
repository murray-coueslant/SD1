import java.util.Scanner;

public class numberGuess{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        final int secretNum = 9;
        do {
            System.out.print("Enter a number between 1 and 10: ");
            int userNum = input.nextInt();
            if(userNum == secretNum){
                System.out.println("You guessed right!");
            } else if (userNum > secretNum){
                System.out.println("Try again, your guess was larger than my number.");
            } else {
                System.out.println("Try again, your guess was smaller than my number.");
            }
        } while (0 < 1);
    }
}
