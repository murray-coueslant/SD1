import java.util.Scanner;

public class ch7_7_9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        double[] valArray = new double[10];
        for(int i = 0; i < valArray.length; i++){
            valArray[i] = input.nextDouble();
        }
        min(valArray);
        input.close();
    }
    public static void min(double[] array) {
        double min = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        System.out.println("The lowest number entered was: " + min);
    }
}