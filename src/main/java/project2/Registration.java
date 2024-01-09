package project2;

public class Registration {
    private String email,userName, password;
    public void setEmail(String email){
        this.email=email;
        if(!email.endsWith("yahoo.com")){
            System.out.println("please enter the valid email address");
        }
    }
    public void setUserName(String userName){
        this.userName=userName;
        if(userName.isEmpty() && userName.length()>6){
            System.out.println("user name cant be empty and  can not be longer than 6 characters");
        }
    }
    public void setPassword(String password){
        this.password=password;
        if(password.length()>6 && password.contains(userName)){
            System.out.println("valid password cant contain username or cant be longer that 6 character");
        }
    }
}
class RegistrationTester{
    public static void main(String[] args) {
        Registration r = new Registration();
        r.setEmail("jijfa@gmail.com");
        r.setUserName("jnncd088");
        r.setPassword("kdokd");

    }
}

