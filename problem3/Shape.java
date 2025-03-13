public abstract class Shape {
    protected String name; // Name of the shape

    // Constructor
    public Shape(String name) {
        this.name = name;
    }

    // Abstract methods to be implemented by subclasses
    public abstract double calculateArea();
    public abstract double calculatePerimeter();

    // toString method for common display
    @Override
    public String toString() {
        return "Shape: " + name + ", Area: " + calculateArea() + ", Perimeter: " + calculatePerimeter();
    }
}