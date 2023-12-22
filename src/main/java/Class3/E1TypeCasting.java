package Class3;

public class E1TypeCasting {
    public static void main(String[] args) {
        int age = 10;
        System.out.println(age);
        //moving smaller int to a larger box thats why no issues
        double age2=age;
        System.out.println(age2);
        double largeBox=10.5;
        int smallerBox=(int)largeBox;
        System.out.println(smallerBox);
        short mediumBox=100;
        byte smallerstBox=(byte)mediumBox;
        System.out.println(mediumBox);

    }
}
