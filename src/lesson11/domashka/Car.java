package lesson11.domashka;

public class Car {

    String color;
    String motor;
    int door;

    public Car(String color, String motor, int door) {
        this.color = color;
        this.motor = motor;
        this.door = door;

    }

}

class CarTest {

    public void changDoor(Car c, int door) {
        c.door = door;

    }

    public static void swapCar(Car c1, Car c2) {
        String color = c1.color;
        c1.color = c2.color;
        c2.color = color;

    }
    public static void main(String[] args) {
        CarTest ct = new CarTest();
        Car car1 = new Car("Black", "V4", 2);
        Car car2 = new Car("Whate", "V6", 4);
        
        ct.changDoor(car1, 3);
        ct.swapCar(car1, car2);
        
        
        System.out.println("Цвет " + car1.color + " Мотор " + car1.motor + " Количество дверей " + car1.door);
        System.out.println("Цвет " + car2.color + " Мотор " + car2.motor + " Количество дверей " + car2.door);
        
        
    }

}
