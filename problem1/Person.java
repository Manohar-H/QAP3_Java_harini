public class Person {
    protected String myName;   // Name of the person
    protected int myAge;       // Person's age
    protected String myGender; // "M" for male, "F" for female

    // Constructor
    public Person(String name, int age, String gender) {
        this.myName = name;
        this.myAge = age;
        this.myGender = gender;
    }

    // toString method
    @Override
    public String toString() {
        return myName + ", age: " + myAge + ", gender: " + myGender;
    }
}