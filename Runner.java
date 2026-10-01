import java.util.Scanner;
public class Runner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the radius: ");
        double radius = sc.nextDouble();

        Circle circle = new Circle(radius);

        double area = circle.area();
        System.out.println("The area of the circle is " + area + ".");

        System.out.print("Provide an updated radius: ");
        double newRadius = sc.nextDouble();
        circle.updateRadius(newRadius);

        double circumference = circle.circumference();
        System.out.println("The circumference of the circle is " + circumference + ".");

        System.out.print("Provide a height: ");
        double height = sc.nextDouble();

        double volume = circle.cylinderVolume(height);
        System.out.println("The volume of the cylinder is " + volume + ".");

        sc.close();
    }
}
