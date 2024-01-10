package javaoops;

abstract class Employee1 {
	protected String name;
	protected double baseSalary;
  public  Employee1(String name,double baseSalary)
   {
	   this.name=name;
	   this.baseSalary=baseSalary;
   }
   public abstract double calculateSalary();
   public abstract void displayinfo();

}
class Manager extends Employee1
{
	private double bonus;
	public Manager(String name,double baseSalary,double bonus)
	{
		super(name,baseSalary);
		this.bonus=bonus;
	}
	public double calculateSalary()
	{
		return baseSalary+bonus;
	}
	public void displayinfo()
	{
	   System.out.println("manager name:" +name);
	   System.out.println("Base salary:"+baseSalary);
	   System.out.println("Bonus:"+bonus);
	   System.out.println("total salary:"+calculateSalary());
	   
	}
}
class Programmer extends Employee1
{
	private int overtime;
	private double hourlyrate;
	public Programmer(String name,double baseSalary,int overtime,double hourlyrate)
	
	{
		super(name,baseSalary);
		this.overtime=overtime;
		this.hourlyrate=hourlyrate;
	}
	public double calculateSalary()
	{
		return baseSalary+(overtime*hourlyrate);
	}
	public void displayinfo()
	{
	   System.out.println("programmer name:"+name);
	   System.out.println("Base salary:"+baseSalary);
	   System.out.println("overtime:"+overtime);
	   System.out.println("hourlyrate:"+hourlyrate);
	   System.out.println("total salary"+calculateSalary());
	   
	}
}
public class Employee
{
    public static void main(String[] args)
	{
		Employee1 manager=new Manager("asiya",5000,1000);
		Employee1 programmer=new Programmer("xyz",5000,20,20.5);
		manager.displayinfo();
		System.out.println("----------------------------------");
		programmer.displayinfo();
	}
}

		
		
	



	
	
	
	
		
	
