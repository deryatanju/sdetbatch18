package review2;

public class LogicalAnd {
    public static void main(String[] args) {
        boolean rain=false;
        boolean cold=true;
        if(cold&&rain){
            System.out.println("I am staying home");
        }
        boolean messageDisplayed=true;
        String errorMessage="Invalid credentials";
        if(messageDisplayed&&errorMessage.equals("Invalid credentials")){
            System.out.println("Test Case passed");
        }else{
            System.out.println("Tset Case failed");
        }
    }
}
