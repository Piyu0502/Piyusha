package ThisKeyword;

public class Car {
    int carNo;
    String carName;
    double price;

    Car(int carNo, String carName, double price) {
        this.carNo = carNo;
        this.carName = carName;
        this.price = price;
    }

    void display() {
        System.out.println("Car Details");
        System.out.println("Car No:" + carNo);
        System.out.println("Car Name:" + carName);
        System.out.println("Car Price:" + price);
    }
}

class CarImpl {
    public static void main(String[] args) {
        Car c1 = new Car(101, "Maruti", 900000d);
        c1.display();
    }
}
