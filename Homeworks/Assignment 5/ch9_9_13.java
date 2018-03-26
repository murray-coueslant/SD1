import java.util.Scanner;
public class ch9_9_13 {
    public static void main(String args[]){
        Location maxVal;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the rows and columns in your array: ");
        int rows = input.nextInt();
        int columns = input.nextInt();
        double[][] valArray = new double[rows][columns];
        System.out.println("Enter your array: ");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                valArray[i][j] = input.nextDouble();
            }
        }
        maxVal = locateLargest(valArray);
        System.out.println("The maximum value, " + maxVal.getMaxValue() + ", can be found at (" + maxVal.getRow() + ", " + maxVal.getColumn() + ").");
    }

    public static Location locateLargest(double[][] a){
        double max = a[0][0];
        int rowLocation = 0;
        int colLocation = 0;
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                if(a[i][j] > max){
                    max = a[i][j];
                    rowLocation = i;
                    colLocation = j;
                }
            }
        }
        Location maxLocation = new Location(rowLocation, colLocation, max);
        return maxLocation;
    }
}