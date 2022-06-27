package Inheritance;

import java.util.Scanner;

public class Shape {
    public double len, bre;

    Shape() {
        len = 0;
        bre = 0;
    }

    public void getData() {
        System.out.println("Enter Two Values : ");
        Scanner s = new Scanner(System.in);
        len = s.nextDouble();
        bre = s.nextDouble();
    }

    public void Display_area() {
    }
}

class Triangle extends Shape {
    double area;

    public void getData() {
        System.out.println("Enter the Values: ");
        Scanner s = new Scanner(System.in);
        len = s.nextDouble();
        bre = s.nextDouble();
    }

    public void Display_area() {
        area = (0.5 * len * bre);
        System.out.println("Area of Triangle is" + area);
    }
}

class Rectangle extends Shape {
    double area;

    public void getData() {
        System.out.println("Enter the Values: ");
        Scanner s = new Scanner(System.in);
        len = s.nextDouble();
        bre = s.nextDouble();
    }

    public void Display_area() {
        area = len * bre;
        System.out.println("Area of Rectangle is :" + area);
    }
}

class Square extends Shape {
    double area;

    public void getData() {
        System.out.println("Enter the Values: ");
        Scanner s = new Scanner(System.in);
        len = s.nextDouble();
        bre = s.nextDouble();
    }

    public void Display_area() {
        area = len * bre;
        System.out.println("Area of Square is :" + area);
    }
}

class ShapeImpl {
    public static void main(String[] args) {
        int ch;
        Scanner s = new Scanner(System.in);
        System.out.println("1. Area of triangle ");
        System.out.println("2. Area of Rectangle ");
        System.out.println("3. Area of Square");
        ch = s.nextInt();
        switch (ch) {
            case 1:
                System.out.println("Area of Triangle");
                Triangle t = new Triangle();
                t.getData();
                t.Display_area();
                break;
            case 2:
                System.out.println("Area of Rectangle");
                Rectangle r = new Rectangle();
                r.getData();
                r.Display_area();
                break;
            case 3:
                System.out.println("Area of Square");
                Square s1 = new Square();
                s1.getData();
                s1.Display_area();
                break;
            default:
                System.out.println("Wrong choice");
                break;
        }
    }
}
