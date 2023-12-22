package UdemyPractise;

import java.util.Scanner;

//Klavyeden kenarlari girilen bir ucgenin cesidini veren uygulamayi yazziniz
public class Cozum2 {
    public static void main(String[] args) {
        Scanner inputKenar=new Scanner(System.in);
        System.out.println("Please enter first side");
        int firstside =inputKenar.nextInt();
        System.out.println("Please enter second side");
        int secondSide = inputKenar.nextInt();
        System.out.println("Please enter third side");
        int thirdSide =inputKenar.nextInt();
        if(firstside==secondSide && secondSide==thirdSide){
            System.out.println("its's an equilateral triangle");
        }else if(firstside!=secondSide && secondSide!=thirdSide && firstside!=thirdSide){
            System.out.println("it's a scalene triangeles");
        }else{
            System.out.println("ikiz kenar");
        }
    }
}
