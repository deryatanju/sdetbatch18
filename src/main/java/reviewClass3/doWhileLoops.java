package reviewClass3;

public class doWhileLoops {
    public static void main(String[] args) {
        int n = 0;
        do {
            n += 2;
            System.out.println("Hello " + n);
        } while (n < 10);
        System.out.println(n);
        System.out.println("..........Another way.............");
        int i = 2;
        do {
            if (i % 2 == 0) {
                System.out.println(i + " ");
            }
            i++;
        } while (i <= 10);
        System.out.println("end of the program");
    }
}
