package class8;

public class T1 {
    public static void main(String[] args) {
        String[] names={"Aidos","Zeeshan","Abid","Sharif","Zeeshan"};
        int nameCount=0;
        //Write a program to count how many times the name Zeeshan as
        //appeared in this array
        for(int i=0; i<names.length; i++){
            if(names[i].equals("Zeeshan")){
             nameCount++;

            }
        }
        System.out.println(nameCount);
    }
}
