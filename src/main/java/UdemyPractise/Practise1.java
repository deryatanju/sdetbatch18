package UdemyPractise;

import java.util.Scanner;

public class Practise1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many years did you worked?");
        int numOfWorkYears= sc.nextInt();
        System.out.println("What is your annual salary?");
        double annualSalary=sc.nextDouble();
        if(numOfWorkYears>=5){
            System.out.println("You are eligible for bonus");
        }else {
            System.out.println("He is not eligible");
        }

        if(numOfWorkYears >=5 && annualSalary > 50000){
            System.out.println("Bonus is =5000");
        } else {
            System.out.println("Bonus is 3000");
            }
        }


    }





