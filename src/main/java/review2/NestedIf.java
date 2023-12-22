package review2;
// nested if -> if statement inside another if

/*
if (condition) {
    if(condition) {
    }
}
 */
public class NestedIf {
    public static void main(String[] args) {
        boolean allergy = true;
        String allergyType = "fish";
        if (allergy) {
            System.out.println("Lets check what kind of allergy you have");
            if (allergyType.equals("penut")) {
                System.out.println("Please avoid food that contains penuts");
            } else if (allergyType.equals("dairy")) {
                System.out.println("Please stay away from dairy");
            } else if (allergyType.equals("pollen")) {
                System.out.println("Please stay indoor when trees are blooming");
            }

        }
    }
}