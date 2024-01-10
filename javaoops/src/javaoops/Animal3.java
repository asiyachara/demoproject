package javaoops;

abstract class Animal4
{
	public abstract void Eat();
	public abstract void Sleep();
}
class Lion1 extends Animal4
{
	public void Eat()
	{
		System.out.println("lion eats meat");
	}
	public void Sleep()
	{
		System.out.println("lion sleeps in the cave");
	}
}
class Tiger1 extends Animal4
{
	public void Eat()
	{
		System.out.println("Tiger eats non-veg");
	}
	public void Sleep()
	{
		System.out.println("Tiger sleeps on grass");
	}
}
class Deer extends Animal4
{
	public void Eat()
	{
		System.out.println("Deer eats plants");
	}
	public void Sleep()
	{
		System.out.println("Deer sleeps in fields");
	}
}

public class Animal3 
{
   public static void main(String[] args)
   {
	   Animal4 L=new Lion1();
	   L.Eat();
	   L.Sleep();
	   Animal4 T=new Tiger1();
	   T.Eat();
	   T.Sleep();
	   Animal4 D=new Deer();
	   D.Eat();
	   D.Sleep();
   }
}
