package javaoops;

abstract class Person
{
	 public abstract void eat();
	 public abstract void exercise();
}
class Athlete extends Person
{
	public void eat()
	{
		System.out.println("athlete eats diet food withfull of nutritients");
	}
	public void exercise()
	{
		System.out.println("athele maintain fit body by doing workout");
	}
}
class Lazyperson1 extends Person
{
	public void eat()
	{
		System.out.println("eats lots of food includes junk");
	}
	public void exercise()
	{
		System.out.println("rarely excercise");
	}
}
public class LazyPerson
{
   public static void main(String[] args) 
   {
	   Person A=new Athlete();
	   Person L=new Lazyperson1();
	   A.eat();
	   A.exercise();
	   L.eat();
	   L.exercise();
	   
		

	}

}
