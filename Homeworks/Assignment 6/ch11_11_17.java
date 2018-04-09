import java.util.Scanner;
import java.util.ArrayList;
import java.math.*;
/* (Algebra: perfect square) Write a program that prompts the user to enter an integer m and find the 
smallest integer n such that m * n is a perfect square. (Hint: Store all smallest factors of m into an 
array list. n is the product of the factors that appear an odd number of times in the array list. For example, 
consider m = 90, store the factors 2, 3, 3, 5 in an array list. 2 and 5 appear an odd number of times in the 
array list. So, n is 10.) */

public class ch11_11_17{
    public static void main(String args[]){
        ArrayList factorArray, oddFactors, noDuplicateFactorArray = new ArrayList();
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int inValue = input.nextInt();

        factorArray = findFactors(inValue);
        oddFactors = findOddFactors(factorArray);
        noDuplicateFactorArray = removeDuplicates(oddFactors);
        n = (int)findN(noDuplicateFactorArray);

        System.out.println("The smallest integer, n, such that " + inValue + " * n is a perfect square is: " + n);
        System.out.println(inValue + " * n = " + inValue * n);
        System.out.println("Square root of " + inValue + " * " + n + " = " + (int)Math.sqrt(inValue * n));

    }

    public static ArrayList findFactors(int inNumber){
        int i = 2;
        int m = inNumber;
        ArrayList outArray = new ArrayList();
        while(i <= inNumber){
            if(m % i == 0){
                outArray.add(i);
                m /= i;
            } else {
                i++;
            }
        }
        return outArray;
    }

    public static ArrayList findOddFactors(ArrayList inArray){
        ArrayList outArray = new ArrayList();
        for(int i = 0; i < inArray.size(); i++){
            int countObject = (int)inArray.get(i);
            int count = 0;
            for(int j = 0; j < inArray.size(); j++){
                if((int)inArray.get(j) == countObject){
                    count++;
                }
            }
            if(count % 2 == 1){
                outArray.add(countObject);
            }
        }
        return outArray;
    }

    public static ArrayList removeDuplicates(ArrayList inArray){
        ArrayList outArray = new ArrayList();
        for(int i = 0; i < inArray.size(); i++){
            if(!outArray.contains(inArray.get(i))){
                outArray.add(inArray.get(i));
            }
        }
        return outArray;
    }
    
    public static long findN(ArrayList inArray){
        long outProduct = 1;

        if(inArray.size() == 0){
            return 1;
        }

        for(int i = 0; i < inArray.size(); i++){
            outProduct *= (int)inArray.get(i);
        }

        return outProduct;
    }
}