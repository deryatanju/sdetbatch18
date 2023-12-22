package class17;

public class Parents {
    String name="israil";
}
class Child extends Parents{
    void print(){
        System.out.println(name);
    }
}

class Tester{
    public static void main(String[] args) {
        Child c =new Child();
        c.print();
    }
}