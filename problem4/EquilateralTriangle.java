public class EquilateralTriangle extends Triangle implements Scalable {
    private double side; // Length of each side (all sides are equal)

    // Constructor
    public EquilateralTriangle(String name, double side) {
        super(name, side, side, side); // Call the Triangle constructor with equal sides
        this.side = side;
    }

    // Getter and Setter for side
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
        // Update the parent class sides as well
        super.setSide1(side);
        super.setSide2(side);
        super.setSide3(side);
    }

    // Implement the scale method
    @Override
    public void scale(double factor) {
        this.side *= factor;
        setSide(side); // Update the parent sides as well
    }

    // Calculate area using the specific formula for equilateral triangles
    @Override
    public double calculateArea() {
        return (Math.sqrt(3) / 4) * side * side;
    }

    // Calculate perimeter (all sides are equal)
    @Override
    public double calculatePerimeter() {
        return 3 * side;
    }
}