package class6;

public class T4 {
    public static void main(String[] args) {
        /*
    Print even numbers from 20 to 100
	 Expected output 20 22 24 26….. 100
 */
        int i =20;
        while(i<=100){
            System.out.print(i+" ");
            i=i+2;
        }
        System.out.println();
        int y=20;
        while(y<=100){
            if(y%2==0){
                System.out.print(y+" ");
            }
            y++;
        }
    }
}
