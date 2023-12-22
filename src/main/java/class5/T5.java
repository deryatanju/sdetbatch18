package class5;
/*
3. Write a program that will read three inputs of
scores (quiz, mid term, and final scores) from 0 to 100 and determine
the grade based on the following rules:
if the average score >=90 → grade=A
if the average score >= 70 and <90 → grade=B
if the average score>=50 and <70 → grade=C
if the average score<50 → grade=F

 */


import java.util.Scanner;

public class T5 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double quizScore,midtermScore,finalScore,average;
        char grade;
        System.out.println("What is your quiz score");
        quizScore =sc.nextDouble();
        System.out.println("What is your midterm score");
        midtermScore=sc.nextDouble();
        System.out.println("What is your final score");
        finalScore=sc.nextDouble();
        average = (quizScore + midtermScore + finalScore) /3;
        if(average>=90){
            grade='A';
        }else if(average>=70){
            grade='B';
        }else if(average>=50){
            grade='C';
        }else{
            grade='f';
        }
        System.out.println(grade);
    }



}
