import java.util.Scanner;

/* (Enable Circle comparable) Rewrite the Circle class in Listing 13.2 to extend GeometricObject and 
implement the Comparable interface. Override the equals method in the Object class. Two Circle objects are
equal if their radii are the same. Draw the UML diagram that involves Circle, GeometricObject, and Comparable. */

public class ch13_13_9 {
    public static void main(String args[]){
        int r1, r2, r3;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a radius for the first circle: ");
        r1 = input.nextInt();
        System.out.print("Enter a radius for the second circle: ");
        r2 = input.nextInt();
        System.out.print("Enter a radius for the third circle: ");
        r3 = input.nextInt();
        Circle circle1 = new Circle(r1);
        Circle circle2 = new Circle(r2);
        Circle circle3 = new Circle(r3);


        System.out.println("Circle 1 radius: " + circle1.getRadius());
        System.out.println("Circle 2 radius: " + circle2.getRadius());
        System.out.println("Circle 3 radius: " + circle3.getRadius());
        System.out.println("Circle 1 equals Circle 2?: " + circle1.equals(circle2));
        System.out.println("Circle 1 equals Circle 3?: " + circle1.equals(circle3));
        System.out.println("Circle 2 equals Circle 3?: " + circle2.equals(circle3));
    }
}
class Circle extends GeometricObject {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public int compareTo(GeometricObject obj){
        if(this.getColor() == obj.getColor()){
            return 1;
        } else {
            return 0;
        }
    }
    public boolean equals(Circle circle) {
        if(this.radius == circle.getRadius()){
            return true;
        }
        return false;
    }

    public void printCircle() {
        System.out.println("The circle is created " + getDateCreated() +
                " and the radius is " + radius);
    }
}