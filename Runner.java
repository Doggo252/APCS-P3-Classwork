import java.util.Scanner;
public class Runner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the radius: ");
        double radius = sc.nextDouble();

        AICircle circle = new AICircle(radius);

        //calculates area

        double area = circle.area();
        
        System.out.println("The area of the circle is " + area + ".");
        //asks user for a new radius
        System.out.print("Provide an updated radius: ");
        
        double newRadius = sc.nextDouble();
        circle.updateRadius(newRadius);
        //calculates circumference
        
        double circumference = circle.circumference();
        System.out.println("The circumference of the circle is " + circumference + ".");
        //gets height from user
        
        System.out.print("Provide a height: ");
        double height = sc.nextDouble();
        //calculates volume
        
        double volume = circle.cylinderVolume(height);
        System.out.println("The volume of the cylinder is " + volume + ".");

        sc.close();
        //closing scanner for better memory management
    }
}
