package class6;

public class T6 {
    public static void main(String[] args) {
      /*
    Print even numbers from 20 to 1 (using 2 different loops)
     */
        for(int i=20; i>=1; i=i-2){
            System.out.print(i+" ");
        }
        System.out.println();
        int j=20;
        while(j>=1){
            System.out.print(j+" ");
            j=j-2;
        }
    }
}
