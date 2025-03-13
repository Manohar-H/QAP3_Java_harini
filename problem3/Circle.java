public class Circle extends Shape {
    private double radius; // Radius of the circle

    // Constructor
    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    // Getter and Setter
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Calculate area of the circle
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Calculate perimeter (circumference) of the circle
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}