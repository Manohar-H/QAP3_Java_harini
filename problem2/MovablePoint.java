public class MovablePoint extends Point {
    private float xSpeed;  // Speed in the x-direction
    private float ySpeed;  // Speed in the y-direction

    // Default constructor
    public MovablePoint() {
        super();
        this.xSpeed = 0.0f;
        this.ySpeed = 0.0f;
    }

    // Parameterized constructor for speed
    public MovablePoint(float xSpeed, float ySpeed) {
        super();
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Parameterized constructor for position and speed
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);  // Initialize position using the parent class
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Getter methods
    public float getXSpeed() {
        return xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    // Setter methods
    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    // Move method to change position based on speed
    public void move() {
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);
    }

    // toString method
    @Override
    public String toString() {
        return super.toString() + ", speed=(" + xSpeed + ", " + ySpeed + ")";
    }
}