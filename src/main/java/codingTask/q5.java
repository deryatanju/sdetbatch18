package codingTask;
// write a program to swap 2 numbers without a temporary variable?

public class q5 {
    public static void main(String[] args) {
        int a=5, b=7;
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println(a+" "+b);
    }
}
