package UdemyPractise;

public class newIfElse {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println("value of i :" + i);
        }
        outsideFor:
        for (int a = 0; a < 5; a++) {
            insideFor:
            for (int b = 0; b < 4; b++) {
                System.out.println("a :" + a + " b: " + b);
                if (a == 1 && b == 2) {
                    break outsideFor;
                }
            }
        }

            for (int i = 0; i < 5; i++) {
                if (i == 2) {
                    continue;
                }
                System.out.println("value of i :" + i);
            }
            for (int i = 0; i < 5; i++) {
                if (i == 2) {
                    return;
                }
                System.out.println("value of i :" + i);
            }
        }
    }