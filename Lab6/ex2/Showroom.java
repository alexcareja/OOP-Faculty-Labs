package ex2;

public class Showroom {
    public static void main(String[] args) {

        /* Innocent example to make sure the code runs */
        Dealership dealership = new Dealership(300, 100000);
        Car car1 = dealership.getCar(CarType.GENERIC);
        Car car2 = dealership.getCar(CarType.ELECTRIC_ANON);
        System.out.println(car2.showPresentation());
        Car car3 = dealership.getCar(CarType.ELECTRIC_LAMBDA);
        System.out.println(car3.showPresentation());
        Car car4 = new Dealership.Ferrari();
        System.out.println(car4.showPresentation());

        /* TODO 2,3,4: Test all changes to the code */
    }
}
