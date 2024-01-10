package javaoops;

abstract class Animal
{
	public abstract void sound();
}
class Lion extends Animal
{
	public void sound()
	{
		System.out.println("Lion is roaring!!!");
	}
	
}
class Tiger extends Animal
{
	public void sound()
	{
		System.out.println("Tiger is growling!!!");
	}
}

public class Animal2
{
	public static void main(String[] args)
	{
		Animal lion=new Lion();
		lion.sound();
		Animal tiger=new Tiger();
		tiger.sound();
	}
	
}


