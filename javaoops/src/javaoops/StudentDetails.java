package javaoops;
class Student
{ 
  private int rollNo; 
  private String name;
  private String surname;
  
     Student(String studentName, String studentSurname, int studentRollNo)
     { 
	this.name= studentName; 
	this.surname = studentSurname; 
	this.rollNo= studentRollNo; 
    } 
     public void getStudentDetails()
     { 
	System.out.println("The name of the student is "+ this.name +" "+ this.surname); 
	System.out.println("The roll no of the student is "+ this.rollNo); 
     } 
} 
class StudentDetails{  
public static void main(String args[]) { 
	Student s1=new Student("asiya","xyz",101);
	s1.getStudentDetails();
	
	
	
} 
}

