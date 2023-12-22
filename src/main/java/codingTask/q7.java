package codingTask;
//write a java program to print first 10 numbers of Fibonacci series.
public class q7 {
    public static void main(String[] args) {
   int firstNum=0, secondNum=1, sum=0;
        for (int i = 2; i <10 ; i++) {
            sum=firstNum+secondNum;
            System.out.print(sum+" ");
            firstNum=secondNum;
            secondNum=sum;

        }


    }
}
