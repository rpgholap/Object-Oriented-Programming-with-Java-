class Teacher {
    String name;

    Teacher(String name) {
        this.name = name;
    }
}

class Student {
    String name;

    Student(String name) {
        this.name = name;
    }
}

public class AssociationDemo {
    public static void main(String args[]) {

        // One-to-One Association
        Teacher t1 = new Teacher("Aditya Sir");
        Student s1 = new Student("Sanket");

        // One-to-Many Association
        Teacher t2 = new Teacher("Aditya Sir");
        Student s2 = new Student("Sanket");
        Student s3 = new Student("Sanket1");

        // Many-to-One Association
        Teacher t3 = new Teacher("Aditya Sir");
        Teacher t4 = new Teacher("Aniket Sir");
        Student s4 = new Student("Sanket");

        // Many-to-Many Association
        Teacher t5 = new Teacher("Aditya Sir");
        Teacher t6 = new Teacher("Aniket Sir");
        Student s5 = new Student("Sanket");
        Student s6 = new Student("Sanket1");
        Student s7 = new Student("Sanket2");
        Student s8 = new Student("Sanket3");

        // Example usage (optional print)
        System.out.println("One-to-One: " + t1.name + " teaches " + s1.name);
        System.out.println("One-to-Many: " + t2.name + " teaches " + s2.name + " and " + s3.name);
        System.out.println("Many-to-One: " + s4.name + " is taught by " + t3.name + " and " + t4.name);
        System.out.println("Many-to-Many: " + t5.name + " and " + t6.name + " teach " + s5.name + ", " + s6.name + ", " + s7.name + ", " + s8.name);
    }
}
