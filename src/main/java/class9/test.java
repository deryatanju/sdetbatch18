package class9;

public class test {
    public static void main(String[] args) {
        String[][] carsArray = {
                {"Chevrolet", "Ford", "Dodge"},
                {"Volkswagen", "BMW", "Mercedes"},
                {"Hyundai", "Kia", "Genesis"},
                {"Fiat", "Ferrari", "Lamborghini"}
        };

        for(int i=0;i<carsArray.length;i++){
            for (int j = 0; j < carsArray[i].length; j++) {
                System.out.print(carsArray[i][j]+" ");
            }
            System.out.println();
        }
        for(String[] arr:carsArray){
            for (String car:arr){
                System.out.print(car+" ");
            }
        }
    }
}
