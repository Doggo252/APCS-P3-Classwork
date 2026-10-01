public class Circle {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double area(){
        double area = Math.PI * radius * radius;
        double roundedArea = Math.round(area*100)/100.0;
        return roundedArea;
    }

    public double circumference(){
        double circumference = Math.PI * 2 * radius;
        double roundedCircumference = Math.round(circumference * 100)/100.0;
        return  roundedCircumference;
    }

    public double cylinderVolume(double height){
        double area = this.area();
        double volume = area * height;
        double roundedVolume = Math.round(volume * 100)/100.0;
        return roundedVolume;
    }

}
