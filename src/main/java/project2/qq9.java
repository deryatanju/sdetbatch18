package project2;

public class qq9 {
    public static void main(String[] args) {
        String input = "abracadabra";
        for (int i=0; i< input.length(); i++) {
            for (int j = 0; j < input.length(); j++) {

                if (i!=j && input.charAt(i) == input.charAt(j))
                    break;
                if (j == input.length() - 1) {
                    System.out.println(input.charAt(i));
                    return;
                }
            }
        }
    }
}
