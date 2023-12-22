package class12;
/*
You have a String a=”Is it saturday? Is it raining?
Do we have a Java Class today?” How would you find out how many
sentences are in that String?
 */
public class T2 {
    public static void main(String[] args) {
        String str="bkfdSAHBDSH2232398487#Y*&#$%";
        System.out.println(str.replaceAll("[^A-Za-z]","").length());
    }
}
