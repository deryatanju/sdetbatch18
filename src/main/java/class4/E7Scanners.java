package class4;

import java.util.Scanner;

public class E7Scanners {
    public static void main(String[] args) {
        Scanner fetchGender = new Scanner(System.in);
        System.out.println("Please enter your gender M/F");
        char gender=fetchGender.next().charAt(0);
        System.out.println(gender);
    }
}
