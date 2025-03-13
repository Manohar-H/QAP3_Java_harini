public class Demo {
    public static void main(String[] args) {
        // Create shape objects
        Scalable[] shapes = {
            new Circle("Circle", 5.0),
            new Ellipse("Ellipse", 6.0, 4.0),
            new Triangle("Triangle", 3.0, 4.0, 5.0),
            new EquilateralTriangle("EquilateralTriangle", 5.0)
        };

        double scaleFactor = 2.0; // Scaling factor

        System.out.println("Before Scaling:");
        for (Scalable shape : shapes) {
            System.out.println(shape); // toString() will be called automatically
        }

        // Apply scaling
        for (Scalable shape : shapes) {
            shape.scale(scaleFactor);
        }

        System.out.println("\nAfter Scaling by a factor of " + scaleFactor + ":");
        for (Scalable shape : shapes) {
            System.out.println(shape); // Print the updated shapes
        }
    }
}