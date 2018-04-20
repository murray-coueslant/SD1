import java.util.Scanner;

public class ch18_18_25 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your string: ");
        String userInput = input.next();

        while(userInput.length() != 3){
            System.out.println("Enter a string of length 3.");
            System.out.print("Enter your string: ");
            userInput = input.next();
        }
        System.out.println("The permutations of the string '" + userInput + "' are:");
        displayPermutations(userInput);
    }

    public static void displayPermutations(String inString){
        stringPermutations("", inString);
    }

    public static void stringPermutations(String s1, String inString){
        int n = inString.length();
        if (inString.length() == 0) System.out.println(s1);
        else {
            for(int i = 0; i < n; i++){
                stringPermutations(s1 + inString.charAt(i), inString.substring(0, i) + inString.substring(i+1, n));
            }
        }
    }
}