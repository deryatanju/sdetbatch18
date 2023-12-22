package codingTask;
//Create a 2d array of integers develop a program which will be calc sum of even and odd num
public class q4 {
    public static void main(String[] args) {
        int [][] numbers = {
                {50, 78, 89, 35, 20, 90, 77, 30, 89},
                {557, 78, 89, 50},
                {7,18,53}
        };
        int sumEven=0;
        int sumOdd=0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if(numbers[i][j]%2==0){
                    sumEven=sumEven+numbers[i][j];
                }else{
                    sumOdd=sumOdd+numbers[i][j];
                }

            }

        }
        System.out.println(sumEven);
        System.out.println(sumOdd);
    }
}
