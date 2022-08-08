package oops.classesAndObjects;

import java.util.Scanner;

public class StudentUse {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in); 
		Student s1 = new Student();
		Student s2 = new Student("Susanna Sharma", 22, "i am cute", 9.5, 9.65);
		Student s3 = new Student("Nisha Pradhan", 23);
		s1.name = s.nextLine();
		s1.rollNumber = s.nextInt();
		s1.setStudentSecret();
		s.nextLine();
		s.close();
		System.out.println(s1+" : "+s1.name+", "+s1.rollNumber+", "+s1.getStudentSecret()+" : "+s1.cgpa);
		System.out.println(s1+" : "+s2.name+", "+s2.rollNumber+", "+s2.getStudentSecret()+" : "+s2.cgpa);
		System.out.println(s1+" : "+s3.name+", "+s3.rollNumber+", "+s3.getStudentSecret()+" : "+s3.cgpa);
		System.out.println("Number of Students : "+ Student.getNumberOfStudents());
		//System.out.println(s1.numberOfStudent);
		//System.out.println(s2.numberOfStudent);
		//System.out.println(s3.numberOfStudent);
	}
}
