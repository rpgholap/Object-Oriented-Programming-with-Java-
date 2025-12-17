//Array of objects
import java.util.*;

class Student{
	String name;
	Student(String name){
		this.name = name;
	}
}
class ArrayDemo8
{

	public static void main(String args[]){
		
		Student[] s1 = new Student[3];
		System.out.println("============");
		s1[0] = new Student("Himanshu");
		s1[1] = new Student("Suyog");
		s1[2] = new Student("Mitali");
		
		for(Student s : s1){
			
			System.out.println(s.name);
		}
		
		
	}
}