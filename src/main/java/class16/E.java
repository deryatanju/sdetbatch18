package class16;

public class E {
   public static void printF(){
   System.out.println("hello");
}
}
class F extends E{

}

  class ETester{
     public static void main(String[] args) {
        F.printF();
     }
  }