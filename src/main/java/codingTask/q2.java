package codingTask;
//create an array of integar values.after the array is created
// calculate the sum of all stored elements in that array
public class q2 {
    public static void main(String[] args) {
        int [] numbers={10,40,67,89,34};
        int sum=0;
        for (int i = 0; i < numbers.length; i++) {
            sum=sum+numbers[i];

        }
        System.out.println(sum);
    }

}
