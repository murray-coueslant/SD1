import java.util.Scanner;

public class triangleArea {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a base and height separated by a space: ");
        int base = input.nextInt();
        int height = input.nextInt();
        double area = 0.5 * base * height;
        System.out.println("Area is " + area);
        input.close();
    }

}