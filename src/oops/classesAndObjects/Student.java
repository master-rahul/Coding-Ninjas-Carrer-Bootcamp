package oops.classesAndObjects;

public class Student {
	
	 public String name;
	 public int rollNumber;
	 public double cgpa;
	 public final static double conversionFactor = 9.5;
	 private String studentSecret;
	 public final String message = "";
	 private static int numberOfStudent = 0;
	 
	 Student() {
		 numberOfStudent++;
		 this.cgpa = -1;
	 }
	 
	 Student(String name, int rollNumber) {
		 this(name, rollNumber, "i dont have any", 9.5, 10);
	 }
	 
	 public static int getNumberOfStudents() {
		 //rollNumber = 10;
		 return Student.numberOfStudent;
	 }
	 
	 public Student(String name, int rollNumber, String studentSecret, double conversionFactor, double cgpa){
		 numberOfStudent++;
		 this.name = name;
		 this.rollNumber = rollNumber;
		 this.studentSecret = studentSecret;
		 this.cgpa = cgpa * Student.conversionFactor;
	 }
	 
	 public void setStudentSecret() {
		 this.studentSecret = "mera joota hai japani";
	 }
	 public int getRollNumber() {
		 return rollNumber;
	 }
	 public String getStudentSecret() {
		 return studentSecret;
	 }
	 public void setRollNumber(int rollNumber) {
		 if(rollNumber < 0) {
			 System.out.println("Invalid Input");
			 return;
		 } 
		 this.rollNumber = rollNumber;
	 }

}
