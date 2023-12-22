package codingTask;
// create a 2d array or integer type where you will store odd and even numbers.
// develop a program which will identify/print the even numbers only
public class q3 {
    public static void main(String[] args) {
        int [][] numbers = {
                {50, 78, 89, 35, 20, 90, 77, 30, 89},
                {557, 78, 89, 50},
                {7,18,53}
        };
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j <numbers[i].length ; j++) {
                if(numbers[i][j]%2==0){
                    System.out.print(numbers[i][j]+" ");
            }
        }
        }

    }

}
