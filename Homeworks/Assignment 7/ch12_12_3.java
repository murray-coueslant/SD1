import java.util.Random;
import java.util.Scanner;

public class ch12_12_3 {
    public static void main(String args[]) {
        int[] randomInts = createArray();
        
        Scanner input = new Scanner(System.in);

        Boolean noError = true;

        do {
            System.out.print("Enter the index of the element you want to see (0-99): ");
            int userIndex = input.nextInt();
            try {
                System.out.println("The element at index " + userIndex + " is " + randomInts[userIndex]);
            }
            catch(ArrayIndexOutOfBoundsException e) {
                noError = false;
                System.out.println("Out of Bounds");
                input.close();
            }
        } while(noError);
    }

    public static int[] createArray(){
        Random rand = new Random();
        int[] outArray = rand.ints(100, 0, 1000).toArray();
        return outArray;
    }
}