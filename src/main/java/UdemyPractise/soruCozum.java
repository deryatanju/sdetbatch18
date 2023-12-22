package UdemyPractise;

import java.util.Scanner;

//Klavyeden girilen 3 sayinin ortalamasi
public class soruCozum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        double num1=sc.nextDouble();
        double num2=sc.nextDouble();
        double num3=sc.nextDouble();
        double avarage = (num1+num2+num3)/3;
        System.out.printf("%.4f", avarage);
    }
}
