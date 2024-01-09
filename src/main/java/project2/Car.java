package project2;

public class Car {
    private String color;
    double carPrice;

    public double calculateSalePrice() {
        return carPrice;
    }
    public Car(String color,double carPrice){
        this.color=color;
        this.carPrice=carPrice;
    }
}

class Truck extends Car{
    private double weight;
    public Truck(String color,double carPrice,double weight) {
        super(color,carPrice);
        this.weight = weight;
    }
    public double calculateSalePrice(){
        if (weight>2000){
            return carPrice-carPrice*0.10;
        }else{
            return carPrice-carPrice*0.20;
        }
    }
}
class Sedan extends Car{
    private  double length;
    public Sedan(String color, double carPrice, double length) {
        super(color, carPrice);
        this.length = length;
    }
    public double calculateSalePrice() {
        if (length > 20) {
            return carPrice - carPrice * 0.05;
        } else {
            return carPrice - carPrice * 0.10;
        }
    }
}

