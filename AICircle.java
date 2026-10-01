public class AICircle {
    //instance variable
    private double radius;

    //initialization constructor
    public AICircle(double radius){
        this.radius = radius;
    }

    //calculate the area using instance variable and round to 2 decimal places
    public double area(){
        double area = Math.PI * radius * radius;
        return Math.round(area * 100) / 100.0;
    }

    //calculate the circumference using instance variable and round to 2 decimal places
    public double circumference(){
        double circumference = 2 * Math.PI * radius;
        return Math.round(circumference * 100) / 100.0;
    }

    //calculate the cylinder volume using the (rounded) area method, then round to 2 decimal places
    public double cylinderVolume(double height){
        double volume = this.area() * height;
        return Math.round(volume * 100) / 100.0;
    }

    //updates the instance variable with new radius
    public void updateRadius(double radius){
        this.radius = radius;
    }

}
