public class Demo {
    public static void main(String[] args) {
        
        // Test the Point class
        Point point = new Point(1.5f, 2.5f);
        System.out.println("Initial Point: " + point);
        
        // Test the MovablePoint class
        MovablePoint movablePoint = new MovablePoint(1.5f, 2.5f, 0.5f, 1.0f);
        System.out.println("Initial MovablePoint: " + movablePoint);
        
        // Move the MovablePoint and display the result
        movablePoint.move();
        System.out.println("After moving: " + movablePoint);
    }
}