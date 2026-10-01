public class Circle {
    //instance variable
    private double radius;

    //initialization constructor
    public Circle(double radius){
        this.radius = radius;
    }

    //calculate the area using instance variable and round
    public double area(){
        double area = Math.PI * radius * radius;
        double roundedArea = Math.round(area*100)/100.0;
        return roundedArea;
    }

    //calculate the circumference using instance variable and round
    public double circumference(){
        double circumference = Math.PI * 2 * radius;
        double roundedCircumference = Math.round(circumference * 100)/100.0;
        return  roundedCircumference;
    }

    //calculate the cylinder volume using instance variable and area method, then rounds
    public double cylinderVolume(double height){
        double area = this.area();
        double volume = area * height;
        double roundedVolume = Math.round(volume * 100)/100.0;
        return roundedVolume;
    }

    //updates the instance variable with new radius
    public void updateRadius(double radius){
        this.radius = radius;
    }

}
