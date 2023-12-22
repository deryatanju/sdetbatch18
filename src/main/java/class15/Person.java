package class15;

public class Person {
    private String name;
    private int age;
    private double weight;
    private double salary;
    private String favPLanguage;
    public Person(String pName,int pAge,double pWeight,double pSalary, String pFavLanguage){
        name=pName;
        age=pAge;
        weight=pWeight;
        salary=pSalary;
        favPLanguage=pFavLanguage;

    }
    public Person(String pName,int pAge,double pWeight,double pSalary){
        name=pName;
        age=pAge;
        weight=pWeight;
        salary=pSalary;


    }
    public Person(String pName,int pAge,double pWeight){
        name=pName;
        age=pAge;
        weight=pWeight;



    }
    public void printInfo(){
        System.out.println(name+" "+weight+" "+salary+" "+favPLanguage);
    }
}
