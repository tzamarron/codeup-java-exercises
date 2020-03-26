package shapes;

public class Circle {
    private double radius; // Sets radius property for Circle

    // Constructor to create new circle
    // with defined radius property
    public Circle(double radius) {
        this.radius = radius;
    }

    // Constructor to create new circle
    // with no properties defined
    public Circle() {

    }

    // Sets radius for Circle
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Gets the value of the radius property
    public double getRadius() {
        return radius;
    }

    // Method to determine area of Circle
    // using radius
    public double getArea() {
        double radiusSquared = Math.pow(this.radius, 2);
        return Math.PI * radiusSquared;
    }

    // Method to determine circumference
    // of Circle using radius
    public double getCircumference() {
        return 2 * Math.PI * this.radius;
    }

}
