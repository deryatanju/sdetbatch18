package review2;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner  input= new Scanner(System.in);
        System.out.println("Please enter today's month");

        String month=input.next(); // next() -captures 1 word

        System.out.println("Please enter today's date");
        int day=input.nextInt();

        System.out.println("Please enter today's year");
        int year=input.nextInt();

        System.out.println("Today is "+month+" "+day+", "+year);

        System.out.println("Are you tired?");

        boolean isTired=input.nextBoolean();
        System.out.println("I am tired "+isTired);

        System.out.println("Are you F or M");
        char gender=input.next().charAt(0);
        System.out.println(gender);
    }
}
