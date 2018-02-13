import java.util.Scanner;

public class ch6_6_37 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        System.out.print("Enter a width: ");
        int width = input.nextInt();
        System.out.println(format(number, width));
        input.close();
    }

    public static String format(int number, int width) {
        String outNum = "";
        String stringNumber = Integer.toString(number);
        int stringLength = stringNumber.length();
        int modLength = (width-stringLength);
        if(stringLength > width) {
            return stringNumber;
        } else {
            for(int i = 0; i < modLength; i++){
                outNum += "0";
            }
            outNum += stringNumber;
            return outNum;
        }

    }
}
