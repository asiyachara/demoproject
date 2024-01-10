package javaoops;


abstract class Bird 
{
     public abstract void fly();
     public abstract void Sound();
}
class Eagle extends Bird
{
	public void fly()
	{
		System.out.println("Eagle will flew in very high");
	}
	public void Sound()
	{
		System.out.println("Eagle will sounds like eww..eww..");
	}
}
class Hawk extends Bird
{
	public void fly()
	{
		System.out.println("Hawk will flew in low in the sky");
		
	}
	public void Sound()
	{
		System.out.println("Hawk will sounds like awe awe awe");
	}
}
public class BirdFly
{
     public static void main(String[] args)
     {
    	 Bird B=new Eagle();
    	 Bird B1=new Hawk();
    	 B.fly();
    	 B1.fly();
    	 B.Sound();
    	 B1.Sound();
		

	}

}
