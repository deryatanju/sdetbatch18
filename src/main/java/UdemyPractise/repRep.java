package UdemyPractise;

import java.util.Scanner;

public class repRep {

    public static void main(String[] args) {
        /***For you to do:**
         Create a program that will ask a user to input boolean value "Input the boolean value"
         If the input is true or false, then the output should look like below:
         **Example Output:**
         Input the boolean value
         The value is true
         **Example Output:*
         Input the boolean value
         The value is false*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the boolean value");
        boolean value = sc.nextBoolean();
        if(value){
            System.out.println("The value is true");
        }else{
            System.out.println("The value is false");

        }


    }
}
