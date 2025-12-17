package university;  // same package for all classes

public class Student {
    int rollNumber;
    String name;
    String department;
    double cgpa;

    public Student(int rollNumber, String name, String department, double cgpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.department = department;
        this.cgpa = cgpa;
    }

    public String toString() {
        return name + "(" + cgpa + ")";
    }
}

