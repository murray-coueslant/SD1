import java.util.Scanner;

public class oddOrEven {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int inputInt = input.nextInt();
        if(inputInt % 2 == 0){
            System.out.println(inputInt + " is an even number!");
        } else {
            System.out.println(inputInt + " is an odd number!");
        }
        input.close();
    }

}