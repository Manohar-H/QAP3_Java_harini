public class CollegeStudent extends Student {
    private String major;  // Student's major
    private int year;      // Current year in college (1 = Freshman, etc.)

    // Constructor
    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, int year, String major) {
        super(name, age, gender, idNum, gpa); // Call the Student constructor
        this.year = year;
        this.major = major;
    }

    // Getter methods
    public String getMajor() {
        return major;
    }

    public int getYear() {
        return year;
    }

    // Setter methods
    public void setMajor(String major) {
        this.major = major;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // toString method
    @Override
    public String toString() {
        return super.toString() + ", Year: " + year + ", Major: " + major;
    }
}