package shapes;

public class Circle {
    private double radius;
    private static long numberOfCircles;

    public Circle(String name){};

    public static long getNumberOfCircles() {
        return numberOfCircles;
    }

    public Circle (double radius){
        this.radius = radius;
        numberOfCircles++;
    }

    public Circle(){
        numberOfCircles++;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
        double radiusSquared = Math.pow(this.radius,2);
        return Math.PI * radiusSquared;
    }

    public double getCircumference(){
        return 2 * Math.PI * this.radius;
    }

    public static void main(String[] args) {

    }
}
