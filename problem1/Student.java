public class Student extends Person {
    protected String myIdNum;   // Student ID Number
    protected double myGPA;     // Grade Point Average

    // Constructor
    public Student(String name, int age, String gender, String idNum, double gpa) {
        super(name, age, gender);  // Call the superclass constructor
        this.myIdNum = idNum;
        this.myGPA = gpa;
    }

    // Getter methods
    public String getIdNum() {
        return myIdNum;
    }

    public double getGPA() {
        return myGPA;
    }

    // Setter methods
    public void setIdNum(String idNum) {
        this.myIdNum = idNum;
    }

    public void setGPA(double gpa) {
        this.myGPA = gpa;
    }

    // toString method
    @Override
    public String toString() {
        return super.toString() + ", ID: " + myIdNum + ", GPA: " + myGPA;
    }
}