package project2;

import java.util.Arrays;

public class qq5 {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        char [] charArray1= str1.toCharArray();
        char [] charArray2=str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        if(str1.length()==str2.length()&&Arrays.equals(charArray1,charArray2)){
            System.out.println("anagram");
        }else{
            System.out.println("not");
        }
    }
}
