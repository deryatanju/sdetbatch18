package codingTask;
//write a java program to print out dublicate elements from an Array of String?
public class q10 {
    public static void main(String[] args) {
        String [] arr={"apple","mango","banana","plum","apple","cherry","banana"};

        for (int i = 0; i < arr.length; i++) {
            for (int j =i+1; j < arr.length; j++) {
                if(arr[i].equals(arr[j])){
                    System.out.println(arr[j]);
            }



                }


        }

    }
}
