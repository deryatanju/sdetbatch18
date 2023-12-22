package class18;

public class Degree {
    public void getPrequisite(){
        System.out.println("to get a degree you need high school diploma");
    }

}

class Master extends Degree {
    public void getPrequisite() {
        System.out.println("To get a Masters degree we need to have Bachelors Degree");
    }
}
class Bachelors extends Degree{

}

   class DegreeTester{
       public static void main(String[] args) {
           Master m=new Master();
           m.getPrequisite();
           Bachelors b= new Bachelors();
           b.getPrequisite();
       }

   }
