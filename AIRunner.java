import java.util.Scanner;

public class AIRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create the Circle object with a starting radius
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();
        Circle circle = new Circle(radius);

        String again = "y";

        while (again.equalsIgnoreCase("y")) {
            // Display the menu
            System.out.println();
            System.out.println("1. Area of a Circle");
            System.out.println("2. Circumference of a Circle");
            System.out.println("3. Update the Radius");
            System.out.println("4. Volume of a Cylinder");
            System.out.print("Select a formula (1-4): ");
            int choice = input.nextInt();

            // Run the selected formula
            if (choice == 1) {
                System.out.println("Area: " + String.format("%.2f", circle.area()));
            } else if (choice == 2) {
                System.out.println("Circumference: " + String.format("%.2f", circle.circumference()));
            } else if (choice == 3) {
                System.out.print("Enter the new radius: ");
                double newRadius = input.nextDouble();
                circle.updateRadius(newRadius);
                System.out.println("Radius updated to " + newRadius);
            } else if (choice == 4) {
                System.out.print("Enter the height of the cylinder: ");
                double height = input.nextDouble();
                System.out.println("Volume: " + String.format("%.2f", circle.cylinderVolume(height)));
            } else {
                System.out.println("Invalid choice. Please enter a number from 1 to 4.");
            }

            System.out.print("\nWould you like to choose another formula? (y/n): ");
            again = input.next();
        }

        System.out.println("Goodbye!");
        input.close();
    }
}