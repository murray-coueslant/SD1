import java.util.Scanner;

public class ch3_3_5 {
    public static void main(String args[]) {
        Scanner input =  new Scanner(System.in);
        System.out.println("Each day of the week is represented as an integer from 0-6, Sunday is 0, Monday is 1, etc...");
        System.out.print("Enter today's day: ");
        int dayVal = input.nextInt();
        String dayString = "";
        System.out.print("Enter a number of days elapsed from today: ");
        int futureVal = input.nextInt();
        switch(dayVal) {
            case 0: dayString = "Sunday"; break;
            case 1: dayString = "Monday"; break;
            case 2: dayString = "Tuesday"; break;
            case 3: dayString = "Wednesday"; break;
            case 4: dayString = "Thursday"; break;
            case 5: dayString = "Friday"; break;
            case 6: dayString = "Saturday"; break;
            default: break;
        }
        int i = dayVal;
        int j = 0;
        do {
            i++;
            if (i == 7){
                i = 0;
            }
            j++;
        }
        while (j < futureVal);
        String futureDayString = "";
        switch(i) {
            case 0: futureDayString = "Sunday"; break;
            case 1: futureDayString = "Monday"; break;
            case 2: futureDayString = "Tuesday"; break;
            case 3: futureDayString = "Wednesday"; break;
            case 4: futureDayString = "Thursday"; break;
            case 5: futureDayString = "Friday"; break;
            case 6: futureDayString = "Saturday"; break;
        }
        input.close();
        if(futureVal==1){
            System.out.println("Today is " + dayString + " and " + futureVal + " day from now will be " + futureDayString);
        } else {
            System.out.println("Today is " + dayString + " and " + futureVal + " days from now will be " + futureDayString);
        }
    }
}