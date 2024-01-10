package javaoops;

 class StudentDemo {

	private int id;
	private String name;
 
 public StudentDemo(int id,String name)
 {
	 this.id=id;
	 this.name=name;
	
	

 }
 void S1()
 {
	 System.out.println("id="+id);
	 System.out.println("name="+name);
 }
 
 }
 class TeacherDemo extends StudentDemo{
	 private int rollno;
	 private int marks;
 public TeacherDemo(int rollno,int marks)
{
	this.rollno=rollno;
	this.marks=marks;
}
void T1()
{
	System.out.println("rollno"+rollno);
	System.out.println("marks"+marks);
}

public static void main() {
	 
	 System.out.println("the student id is"+id);
 }
