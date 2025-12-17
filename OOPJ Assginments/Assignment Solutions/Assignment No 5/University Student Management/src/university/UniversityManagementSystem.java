package university;  // same package

import java.util.*;

public class UniversityManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Student> registrationList = new ArrayList<Student>();

        // Sample Data
        registrationList.add(new Student(101, "Amit", "CS", 8.5));
        registrationList.add(new Student(102, "Priya", "Math", 9.2));
        registrationList.add(new Student(103, "Rohan", "CS", 7.8));
        registrationList.add(new Student(104, "Sneha", "Physics", 4.5));

        // 1. Registration Order
        System.out.print("Registration Order: ");
        for (int i = 0; i < registrationList.size(); i++) {
            System.out.print(registrationList.get(i).name);
            if (i != registrationList.size() - 1) System.out.print(", ");
        }
        System.out.println();

        // 2. Merit List
        ArrayList<Student> meritList = new ArrayList<Student>(registrationList);
        for (int i = 0; i < meritList.size(); i++) {
            for (int j = i + 1; j < meritList.size(); j++) {
                if (meritList.get(i).cgpa < meritList.get(j).cgpa) {
                    Student temp = meritList.get(i);
                    meritList.set(i, meritList.get(j));
                    meritList.set(j, temp);
                }
            }
        }
        System.out.print("Merit List: ");
        for (int i = 0; i < meritList.size(); i++) {
            System.out.print(meritList.get(i));
            if (i != meritList.size() - 1) System.out.print(", ");
        }
        System.out.println();

        // 3. Alphabetical List
        ArrayList<Student> alphaList = new ArrayList<Student>(registrationList);
        for (int i = 0; i < alphaList.size(); i++) {
            for (int j = i + 1; j < alphaList.size(); j++) {
                if (alphaList.get(i).name.compareTo(alphaList.get(j).name) > 0) {
                    Student temp = alphaList.get(i);
                    alphaList.set(i, alphaList.get(j));
                    alphaList.set(j, temp);
                }
            }
        }
        System.out.print("Alphabetical: ");
        for (int i = 0; i < alphaList.size(); i++) {
            System.out.print(alphaList.get(i).name);
            if (i != alphaList.size() - 1) System.out.print(", ");
        }
        System.out.println();

        // 4. Department Groups
        HashMap<String, ArrayList<Student>> deptMap = new HashMap<String, ArrayList<Student>>();
        for (Student s : registrationList) {
            if (!deptMap.containsKey(s.department)) {
                deptMap.put(s.department, new ArrayList<Student>());
            }
            deptMap.get(s.department).add(s);
        }
        System.out.println("Department Groups:");
        for (String dept : deptMap.keySet()) {
            System.out.print(dept + ": [");
            ArrayList<Student> list = deptMap.get(dept);
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i).name);
                if (i != list.size() - 1) System.out.print(", ");
            }
            System.out.println("]");
        }

        // 5. After CGPA Filter
        Iterator<Student> iter = registrationList.iterator();
        while (iter.hasNext()) {
            if (iter.next().cgpa < 5.0) iter.remove();
        }
        System.out.print("After Filter (CGPA >= 5.0): ");
        for (int i = 0; i < registrationList.size(); i++) {
            System.out.print(registrationList.get(i).name);
            if (i != registrationList.size() - 1) System.out.print(", ");
        }
        System.out.println();

        // 6. Hostel Queue
        LinkedList<Integer> hostelQueue = new LinkedList<Integer>();
        System.out.println("Hostel Queue:");
        hostelQueue.addLast(105); // regular
        System.out.println("Add regular(105): " + hostelQueue);
        hostelQueue.addFirst(101); // priority
        System.out.println("Add priority(101): " + hostelQueue);
        hostelQueue.removeFirst();
        System.out.println("Remove front: " + hostelQueue);
    }
}
