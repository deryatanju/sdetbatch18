package class5;

import java.util.Scanner;

public class T6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the country");
        String country=sc.nextLine();
        switch(country.toLowerCase()){
            case "tajikistan":
                System.out.println("Tajik");
                break;
            case "russia":
                System.out.println("Russian");
                break;
            case "iran":
                System.out.println("Persian");
                break;
            case "spain":
                System.out.println("spanish");
                break;
            case "afghanistan":
                System.out.println("Farsi");
                break;
            default:
                System.out.println("invalid country");
        }
    }
}
