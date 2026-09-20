package Area;

import java.util.Scanner;


abstract class Shape {
    int a, b;

    void input(int x, int y) {
        a = x;
        b = y;
    }

    abstract void printArea();
}


class Rectangle extends Shape {
    
    void printArea() {
        System.out.println("Area of Rectangle = " + (a * b));
    }
    
    
}


class Triangle extends Shape {
    
    void printArea() {
        double area = 0.5 * a * b;
        System.out.println("Area of Triangle = " + area);
    }
}


class Circle extends Shape {
    
    void printArea() {
        double area = 3.14 * a * a;
        System.out.printf("Area of Circle = %.2f\n", area);
    }
}


public class Area {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Shape s;

        System.out.println("Choose Shape");
        System.out.println("1. Rectangle");
        System.out.println("2. Triangle");
        System.out.println("3. Circle");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.print("Enter Length: ");
                int length = sc.nextInt();

                System.out.print("Enter Breadth: ");
                int breadth = sc.nextInt();

                s = new Rectangle();
                s.input(length, breadth);
                s.printArea();
                break;

            case 2:
                System.out.print("Enter Base: ");
                int base = sc.nextInt();

                System.out.print("Enter Height: ");
                int height = sc.nextInt();

                s = new Triangle();
                s.input(base, height);
                s.printArea();
                break;

            case 3:
                System.out.print("Enter Radius: ");
                int radius = sc.nextInt();

                s = new Circle();
                s.input(radius, 0);
                s.printArea();
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}
