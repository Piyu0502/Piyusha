package Interface;

public interface Vehicle {
}
interface Engine{
}
class Car implements Vehicle {
    void show() {
        Boolean isVehicle;
    }
}
class Bike implements Engine{
    void show() {
        Boolean isEngine;
    }
}
class VehicleImpl{
    public static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();
        if (car instanceof Vehicle){
            System.out.println("Is a Vehicle");
        }else {
            System.out.println("No Vehicle");
        }
    }
}