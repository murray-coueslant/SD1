import java.util.Scanner;
import java.util.Random;

public class ch3_3_17 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Your options are Rock (0), Paper (1), and Scissors (2).");
        System.out.print("Enter your selection: ");
        int userSelection = input.nextInt();
        int computerSelection = rand.nextInt(3);
        input.close();
        switch (userSelection) {
            case 0:
                if (computerSelection == 0){
                    System.out.println("It's a draw! You both chose Rock.");
                } else if (computerSelection == 1) {
                    System.out.println("You lose! The computer chose Paper. Paper beats Rock!");
                } else if (computerSelection == 2) {
                    System.out.println("You win! The computer chose Scissors. Rock beats Scissors!");
                }
                break;
            case 1:
                if (computerSelection == 0){
                    System.out.println("You win! The computer chose Rock. Paper beats Rock!");
                } else if (computerSelection == 1) {
                    System.out.println("It's a draw! You both chose Paper.");
                } else if (computerSelection == 2)  {
                    System.out.println("You lose! The computer chose Scissors. Scissors beat Paper!");
                }
                break;
            case 2:
                if (computerSelection == 0){
                    System.out.println("You lose! The computer chose Rock. Rock beats Scissors!");
                } else if (computerSelection == 1) {
                    System.out.println("You win! The computer chose Paper. Scissors beat Paper!");
                } else if (computerSelection == 2)  {
                    System.out.println("It's a draw! You both chose Scissors.");
                }
                break;
            default:
                break;
        }

    }
}