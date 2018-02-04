import java.util.Scanner;

public class ch4_4_24 {
    public static void main(String args[]){
        String[] cityArray = new String[3];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first city: ");
        String city1 = input.nextLine();
        cityArray[0] = city1;
        System.out.print("Enter the second city: ");
        String city2 = input.nextLine();
        cityArray[1] = city2;
        System.out.print("Enter the third city: ");
        String city3 = input.nextLine();
        cityArray[2] = city3;
        bubbleSort(cityArray);
        for(int k=0; k < (cityArray.length);k++){
            System.out.println(cityArray[k]);
        }
        input.close();
    }
    public static void bubbleSort(String inArray []) {
        int i;
        boolean swapFlag = true;
        String tempString;

        while(swapFlag){
            swapFlag = false;
            for(i=0; i < (inArray.length-1); i++){
                if(inArray[i].compareToIgnoreCase(inArray[i+1]) > 0){
                    tempString = inArray[i];
                    inArray[i] = inArray[i+1];
                    inArray[i+1] = tempString;
                    swapFlag = true;
                }
            }
        }
    }
}