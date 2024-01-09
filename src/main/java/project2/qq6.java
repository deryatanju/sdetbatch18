package project2;

public class qq6 {
    public static void main(String[] args) {
        int vowelCount=0;
        String word = "documentation";
        for (int i = 0; i < word.length() ; i++) {
            char value=word.charAt(i);
            if(value=='a'|| value=='e'||value=='i'||value=='o'||value=='u'){
                vowelCount++;
            }

        }
        System.out.println(vowelCount);
    }
}
