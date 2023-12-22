package codingTask;

import java.util.Scanner;

//write a java program to check whether a given number is prime or not
public class q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a number");
        int number =sc.nextInt();
        boolean isPrime=true;
        if(number<=1){
            isPrime=false;
        }else{
            for(int i=2; i<=number/2; i++){
                if(number%i==0){
                    isPrime=false;
                }
            }
        }

        if(isPrime){
            System.out.println("Prime");
        }else{
            System.out.println("not Prime");
        }

    }
}
