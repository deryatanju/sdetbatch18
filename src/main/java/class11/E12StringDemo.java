package class11;

public class E12StringDemo {
    public static void main(String[] args) {
        String str="jdsjfbfi   fkimAABlFGHJ   KL556*&^777@";
        System.out.println(str.replaceAll("[A-Z]","*"));
        System.out.println(str.replaceAll("[a-z]","*"));
        System.out.println(str.replaceAll("[0-9]","*"));
        System.out.println(str.replaceAll("[A-D]","*"));
        System.out.println(str.replaceAll("[A-za-z0-9]","*"));
        System.out.println(str.replaceAll("[^A-Z]","*"));
        System.out.println(str.replaceAll("[^A-Za-z]","*"));
        System.out.println(str.replaceAll("[^A-Da-z0-9]","*"));
        System.out.println(str.replaceAll("[!-?]","*"));
        System.out.println(str.replaceAll("[\\d]","*"));
        System.out.println(str.replaceAll("[\\s]","*"));
        System.out.println(str.replaceAll("[A-z]",""));

        System.out.println((int)'A');

    }
}
