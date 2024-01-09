package project2;

public interface Shape {
    void calculateArea();
    void calculatePerimeter();
}
class Circle implements Shape{
    public void calculateArea(){
        System.out.println("calculating area of circle");
    }
    public void calculatePerimeter(){
        System.out.println("calculate perimeter of circle");
    }

}
class Square implements Shape{
    @Override
    public void calculateArea() {
        System.out.println("calculate area of square");
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("calculate perimeter of square");
    }
}
class ShapeTester{
    public static void main(String[] args) {
        Shape [] arr={new Square(),new Circle()};
        for(Shape s:arr){
            s.calculateArea();
            s.calculatePerimeter();
        }
    }

}
