public class Demo {
    public static void main(String[] args) {
        // Create a Person object
        Person bob = new Person("Coach Bob", 27, "M");
        System.out.println(bob);

        // Create a Student object
        Student lynne = new Student("Lynne Brooke", 16, "F", "HS95129", 3.5);
        System.out.println(lynne);

        // Create a Teacher object
        Teacher mrJava = new Teacher("Duke Java", 34, "M", "Computer Science", 50000);
        System.out.println(mrJava);

        // Create a CollegeStudent object
        CollegeStudent ima = new CollegeStudent("Ima Frosh", 18, "F", "UCB123", 4.0, 1, "English");
        System.out.println(ima);
    }
}