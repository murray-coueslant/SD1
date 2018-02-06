import java.util.Scanner;
public class namePrinter {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        String letterIn = input.next();

        switch(letterIn){
            case "A": System.out.println("Andrew");
                      break;
            case "B": System.out.println("Brad");
                      break;
            case "C": System.out.println("Cal");
                      break;
            case "D": System.out.println("Dave");
                      break;
            case "E": System.out.println("Eric");
                      break;
            default: break;
        }
    }
}