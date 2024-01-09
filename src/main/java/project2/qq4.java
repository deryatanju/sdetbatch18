package project2;

public class qq4 {
    public static void main(String[] args) {
        String word="madam";
        String reverse="";
        for (int i = word.length()-1; i >=0 ; i--) {
            reverse = reverse + word.charAt(i);
        }
        if(word.equals(reverse)){
            System.out.println("it is palindrome");
        }else{
            System.out.println("its not palindrome");
        }
    }
}
