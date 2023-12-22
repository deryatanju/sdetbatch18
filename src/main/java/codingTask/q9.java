package codingTask;
//write a java program to find second large number in the array
public class q9 {
    public static void main(String[] args) {
        int [] arr={7,29,23,89,6,9};
        int largest=arr[0];
        int secondLargest=arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if(arr[i]>largest) {
                secondLargest = largest;
                largest = arr[i];

            }

        }
        System.out.print(largest);
        System.out.println();
        System.out.print(secondLargest);
    }
}
