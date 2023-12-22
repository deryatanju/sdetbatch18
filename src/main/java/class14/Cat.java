package class14;

public class Cat {
    //instance variable
    String name="kitty";
    void printName(){
        //local variable
        String name="Pishak";
        System.out.println(name);

    }

    public static void main(String[] args) {
        Cat c=new Cat();
        c.printName();
    }
}
