import java.util.Scanner;
import java.util.function.IntBinaryOperator;
import java.util.Arrays;

public class binarySearch {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int[] array = new int[10];
        //int[] array2 = {1,2,3,4,5,6,7,8,9,10};
        System.out.print("Enter 10 numbers: ");
        for(int i = 0; i < 10; i++){
            array[i] = input.nextInt();
        }
        Arrays.sort(array);
        System.out.print("Enter a value to search for: ");
        int key = input.nextInt();
        do{
            int[] result = search(array, key);
            System.out.print("Enter a value to search for: ");
            key = input.nextInt();
        } while (key != 99);
        input.close();
    }

    /* public static int[] sort(int[] list){
        int tempVar;
        for (int i = 0; i < list.length; i++) {
            for(int j = 1; j < list.length; j++) {
                if(list[j-1] > list[j]) {
                    tempVar = list [j-1];
                    list [j-1] = list [j];
                    list [j] = tempVar;
                }
            }    
        }
        return list;
    } */

    public static int[] search(int[] list, int key){
        int hi = list.length - 1;
        int lo = 0;
        int mid = lo + (hi - lo) / 2;
        while(lo <= hi){
            if (key < list[mid]){
                hi = mid;
                mid = lo + (hi - lo) / 2;
            }
            else if (key > list[mid]){
                lo = list[mid];
                mid = lo + (hi - lo) / 2;
            }
            else {
                System.out.println("Found " + key + " at " + mid);
                return list;
            }
        }
        System.out.println("Value not found!");
        return list;
    }
}