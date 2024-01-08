// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Car car = new Car("Tesla");
        Car anotherCar = new Car("Fiat");


        System.out.println(car.getName());
        System.out.println(anotherCar.getName());
        anotherCar.setName("BMW");
        System.out.println(anotherCar.getName());

    }
}