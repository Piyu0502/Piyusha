package Abstraction;

public abstract class Shapes {
    abstract double CalculateArea();

    void display() {
        System.out.println("Calculating area of Different Shape");
    }
}

class Rectangle extends Shapes {
    int breath;
    int height;

    public Rectangle(int breath, int height) {
        this.breath = breath;
        this.height = height;
    }

    double CalculateArea() {
        return breath * height;
    }

    void display() {
        super.display();
        System.out.println("Area of Rectangle: " + CalculateArea());
    }
}

class ShapesImpl {
    public static void main(String[] args) {
        Shapes shapes = new Rectangle(5, 7);
        shapes.display();
    }
}
