import java.util.Scanner;
public class ch4_4_9 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String inString = input.nextLine();
        char ch = inString.charAt(0);
        int chUni = (int)ch;
        System.out.println("The unicode value of \"" + ch + "\" is " + chUni);
        input.close();
    }
}