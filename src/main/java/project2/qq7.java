package project2;

import java.util.ArrayList;

public class qq7 {
    public static void main(String[] args) {
        ArrayList<String> w = new ArrayList<>();
        w.add("Banana");
        w.add("Plum");
        w.add("Approve");
        w.add("Reject");
        w.add("Art");

        ArrayList<String> wordsStartingWithA = new ArrayList<>();

        for (int i = 0; i < w.size(); i++) {
            if (w.get(i).startsWith("A")) {
                wordsStartingWithA.add(w.get(i));
            }
        }

        System.out.println(wordsStartingWithA);

        }
}
