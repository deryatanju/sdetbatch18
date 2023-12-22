package class11;

public class deneme {
    public static void main(String[] args) {
         String username="Derya12345";
         String password="parparparpar";
         String confirmPassword="parparparpar";
         if(username.isEmpty() || password.isEmpty()){
             System.out.println("Username or password can not be empty");
         }else if(password.length()<8){
             System.out.println("Password is too short");
         }else if(password.contains(username)){
             System.out.println("password connot contain username");
         }else if(!password.equals(confirmPassword)){
             System.out.println("password do not match");
         }else{
             System.out.println("your username and password is created");
         }
    }
}
