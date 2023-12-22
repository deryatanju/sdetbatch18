package codingTask;
//min and max num in array
public class q8 {
    public static void main(String[] args) {

        int [] arr= {35,2,90,56,34};
        int max=arr[0];
        int min=arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if(arr[i]>max){
             max=arr[i];
            }else if(arr[i]<min){
                min=arr[i];
            }

        }
        System.out.println(max);
        System.out.println(min);
    }
}
