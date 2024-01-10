package javaoops;

abstract class Vehicle
{
	public abstract void startEngine();
	public abstract void stopEngine();
}
class car extends Vehicle
{
	public void startEngine()
	{
		System.out.println("car:staring the engine....");
	}
	public void stopEngine()
	{
		System.out.println("car:stoping the engine..");
	}
}
class Motorcycle extends Vehicle
{
	public void startEngine()
    
	{
		System.out.println("motorcycle:starting the engine...");
	}
	public void stopEngine()
	{
		System.out.println("motorcycle:stopping the engine....");
	}
}
public class Asiyaa
{
	public static void main(String[] args)
	{
		Vehicle car=new car();
		Vehicle motorcycle=new Motorcycle();
		car.startEngine();
		car.stopEngine();
		 motorcycle.startEngine();
		motorcycle.stopEngine();
		
		
		
	}
}
