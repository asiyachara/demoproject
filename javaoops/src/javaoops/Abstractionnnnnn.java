package javaoops;


abstract class UniversityPerson
{
   String name;
   int id;
    public UniversityPerson(String name, int id)
    {
   this.name = name;
   }
    abstract void display();
}

class Professor 
{
      String department;
     String name;
       int id;

     public Professor(String name, int id, String department)
     {
    	
      this.department = department;
     }
     void display() 
     {
         System.out.println("Professor - Name: " + name + ", ID: " + id + ", Department: " + department);
    }
}

class AdministrativeStaff extends UniversityPerson
{
            String role;
            
         public AdministrativeStaff(String name, int id, String role)
         {
            super(name,id);
         }
        void display()
        {
            System.out.println("Administrative Staff - Name: " + name + ", ID: " + id + ", Role: " + role);
        }
}
class Studentt extends UniversityPerson
{
         String major;
         public Studentt(String name,int id, String major)
         {
             
             super(name,id);
             this.major= major;
         }
         void display() 
         {
               System.out.println("Student - Name: " + name + ", ID: " + id + ", Major: " + major);
         }
}

public class Abstractionnnnnn
{
         public static void main(String[] args)
         {
  
                  Professor  professor = new  Professor("sony",101,"abc");
                 UniversityPerson staff = new AdministrativeStaff( "Admin assistance",201, "amit");
                 UniversityPerson student = new Studentt("asiya",121,"xyz");
                 professor.display();
                 staff.display();
                 student.display();
           }
}




