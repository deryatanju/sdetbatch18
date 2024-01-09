package project2;

public abstract class Marks {
    double quiz;
    double midterm;
    double finall;
    abstract double getPercentage();
    public Marks(double quiz, double midterm,double finall){
        this.quiz=quiz;
        this.midterm=midterm;
        this.finall=finall;
    }


}
class A extends Marks{
    public A(double quiz, double midterm,double finall){
        super(quiz,midterm,finall);
    }

    @Override
    double getPercentage() {
        double sum=(quiz+midterm+finall)/3;
        return sum;
    }
}
class B extends Marks {
    public double anotherScore;

    public B(double quiz, double midterm, double finall,double anotherScore) {
        super(quiz, midterm, finall);
        this.anotherScore=anotherScore;

    }

    @Override
    public double getPercentage() {
        double sum=(quiz + midterm + finall + anotherScore) / 4;
        return sum;

    }
}

