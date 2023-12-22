package UdemyPractise;

import java.util.Scanner;

public class bolumSonu {

    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        int boy =0;
        double kilo=0;

        System.out.println("Vucut kitle endex programina hosgeldiniz");

        System.out.println("lutfen boyunuzu cm cinsinden giriniz :");
        boy = scanner.nextInt();



        System.out.println("Lutfen kilonuzu kg cinsinden giriniz :");
        kilo = scanner.nextDouble();

        double endeks =0;
        double cmToMetre = (double)boy/100;
        double boyunKresi = Math.pow(cmToMetre,2);
        endeks = kilo / boyunKresi;
        System.out.println("Bulunan endex degeri :" +endeks);


        if(endeks<15){
            System.out.println("cok ciddi derecede dusuk kilolu");
        }else if(15<endeks && endeks<16){
            System.out.println("ciddi derecede dusuk kilolu");
        }else{
            System.out.println("you shoul enter smt different");
        }






    }


}
