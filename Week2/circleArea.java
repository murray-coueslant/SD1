import java.util.Scanner;

public class circleArea {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a radius: ");
        final double PI = 3.14159265359;
        int radius = input.nextInt();
        double area = radius * radius * PI;
        System.out.println("Area is " + area);
        input.close();
    }

}