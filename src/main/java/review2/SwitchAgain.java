package review2;

public class SwitchAgain {
    public static void main(String[] args) {
        char choice='y';
        switch(choice){
        // this logical operator won't work || 'Y'
        case 'y':
        System.out.println("Means Yes");
        break;
        case 'n':
        System.out.println("Means no");
        break;
        case 'm':
        System.out.println("Means Maybe");
        break;
        default:
        System.out.println("I do not understand you");
    }
    }
}
