public class Demo {
    public static void main(String[] args) {
        // Create objects of each shape
        Shape circle = new Circle("Circle", 5.0);
        Shape ellipse = new Ellipse("Ellipse", 6.0, 4.0);
        Shape triangle = new Triangle("Triangle", 3.0, 4.0, 5.0);
        Shape equilateralTriangle = new EquilateralTriangle("EquilateralTriangle", 5.0);

        // Store them in an array of type Shape
        Shape[] shapes = {circle, ellipse, triangle, equilateralTriangle};

        // Print details for each shape using a loop
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}