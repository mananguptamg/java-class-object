import java.util.Scanner;

class Circle{
    private double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
    public double getCircumference(){
        return 2 * Math.PI * radius;
    }
}

public class CircleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius: ");
        double radius = sc.nextDouble();

        Circle c = new Circle(radius);

        System.out.println("Area: " + c.getArea());
        System.out.println("Circumference: " + c.getCircumference());
        sc.close();
    }
}

//Sample Output
////Enter the radius:
////        2
////Area: 12.566370614359172
////Circumference: 12.566370614359172