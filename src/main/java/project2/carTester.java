package project2;

public class carTester {
    public static void main(String[] args) {

        Truck tr = new Truck("red", 5000, 4000);
        double truckPrice = tr.calculateSalePrice();
        System.out.println(truckPrice);
        Sedan sed = new Sedan("white", 3000, 20);
        double sedanPrice = sed.calculateSalePrice();
        System.out.println(sedanPrice);
    }
    }

