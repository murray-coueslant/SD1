import java.util.Random;
import java.util.Scanner;

public class ch6_6_17 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows you want: ");
        int n = input.nextInt();
        printMatrix(n);
        input.close();
    }

    public static void printMatrix(int n) {
        Random rand = new Random();
        int randomNum = 0;
        for(int i = n; i>=0; i--) {
            for(int j = 0; j < n; j++) {
                randomNum = rand.nextInt(2);
                System.out.print(randomNum + " ");
            }
            System.out.println();
        }
    }
}