package class4;

import java.util.Scanner;

public class T3 {
    public static void main(String[] args) {
        Scanner fetchLoanAmount = new Scanner(System.in);
        System.out.println("What is the amount of loan needed");
        double loan= fetchLoanAmount.nextDouble();
        if(loan<=200000){
            System.out.println("I will lend the money");
        }else{
            System.out.println("Rejected");
        }
    }
}
