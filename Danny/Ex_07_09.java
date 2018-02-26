/*(Find the smallest element) Write a method that finds the smallest element in an array of double values using the following header:
public static double min(double[] array)
Write  a  test  program  that  prompts  the  user  to  enter  ten  numbers,  invokes  this  
method to return the minimum value, and displays the minimum value. Here is a sample run of the program*/
import java.util.Scanner;

public class Ex_07_09{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        double[] numbers = new double[10];
        
        System.out.println("Enter ten digits: ");
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = input.nextDouble();
        }
        
        System.out.println("The minimum number is: " + min(numbers));
        
    }
    
    public static double min(double[] array){
        double min = array[0];
        for (double i: array){
            if (i < min)
                min = i;
        }
        return min;
    }
}