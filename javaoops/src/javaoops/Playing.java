package javaoops;

abstract class Instrument
{
	public abstract void play();
	public abstract void tune();
}
class Glockenspiel extends Instrument
{
	public void play()
	{
		System.out.println("glockenspiel is playing...!!!");
	}
	public void tune()
	{
		System.out.println("tune:la la la la...");
	}
}
class violin extends Instrument
{
	public void play()
	{
		System.out.println("violin is playing.....!!!");
	}
	public void tune()
	{
		System.out.println("tune:aa aa aa aa...!!!");
	}
}

public class Playing 
{
   public static void main(String[] args) 
   {
       Instrument G=new Glockenspiel();
       Instrument V=new violin();
       G.play();
       G.tune();
       V.play();
       V.tune();

	}

}
