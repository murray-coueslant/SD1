import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ch7_7_15 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        int[] valArray = new int[10];
        for(int i = 0; i < valArray.length; i++){
            valArray[i] = input.nextInt();
        }
        int[] noDupesList = eliminateDuplicates(valArray);
        String outString = "";
        for(int i = 0; i < noDupesList.length; i++){
            if(noDupesList[i] != 0){
                outString += noDupesList[i] + " ";
            }
        }
        System.out.println("The new list is: " + outString);
        input.close();
    }

    public static int[] eliminateDuplicates(int[] list){
        int[] noDupesList = new int[10];
        for(int i = 0; i < list.length; i++){
            if(contains(noDupesList, list[i])){
                noDupesList[i] = list[i];
            }
        }
        return noDupesList;
    }

    public static boolean contains(final int[] array, final int key){
        for(final int i : array){
            if(i == key){
                return false;
            }
        }
        return true;
    }
}