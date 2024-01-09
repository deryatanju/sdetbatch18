package project2;

import java.util.ArrayList;

public class qq10 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("Derya");
        list.add("gizem");
        list.add("tuba");
        list.add("ilknur");
        list.add("tuba");
        list.add("gizem");
        list.add("derya");
        ArrayList<String> noDublicates=new ArrayList<>();
        for (String item : list){
            if(!noDublicates.contains(item)){
                noDublicates.add(item);

            }
        }
        System.out.println(noDublicates+" ");
    }
}
