public class Point {
    private float x;  // X coordinate
    private float y;  // Y coordinate

    // Default constructor
    public Point() {
        this.x = 0.0f;
        this.y = 0.0f;
    }

    // Parameterized constructor
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Getter methods
    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    // Setter methods
    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    // toString method
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}