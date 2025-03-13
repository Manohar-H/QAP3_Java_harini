public class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    // Constructor with side validation
    public Triangle(String name, double side1, double side2, double side3) {
        super(name);
        if (isValidTriangle(side1, side2, side3)) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        } else {
            System.out.println("Invalid Triangle sides provided. Program terminated.");
            System.exit(1); // Exit if invalid sides are provided
        }
    }

    // Method to validate if the sides can form a triangle
    private boolean isValidTriangle(double a, double b, double c) {
        return (a + b > c) && (b + c > a) && (c + a > b);
    }

    // Getter and Setter methods
    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    // Calculate perimeter of the triangle
    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }

    // Calculate area using Heron's formula
    @Override
    public double calculateArea() {
        double s = calculatePerimeter() / 2; // Semi-perimeter
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}