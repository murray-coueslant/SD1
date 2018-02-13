import java.util.Scanner;

public class ch5_5_19 {
	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);
		System.out.print("How many rows would you like?: ");
		int noOfRows = input.nextInt();
        int rowCount = 1;
        
		for (int i = noOfRows; i > 0; i--) {

			for (int j = 1; j <= i*2; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= rowCount; j++) {
				System.out.print((int)Math.pow(2, j-1) + " ");
			}

			for (int j = rowCount-1; j >= 1; j--) { 				
				System.out.print((int)Math.pow(2, j-1) + " "); 			
			} 			 			
			
			System.out.println();
			rowCount++;
		}
	}
}