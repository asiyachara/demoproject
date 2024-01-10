package javaoops;

abstract class Shape2D
{
	public abstract void draw();
	public abstract void resize();
}
class Rectangle1 extends Shape2D
{
	public void draw()
	{
		System.out.println("Rectangle:drawing reactangle.");
	}
	public void resize()
	{
		System.out.println("resizing the rectangle");
	}
}
class circle2 extends Shape2D
{
	public void draw()
	{
		System.out.println("drawing circle");   
	}
	public void resize()
	{
		System.out.println("resizing the circle");
	}
}

public class Subclass 
{
   public static void main(String[] args) 
   {
	   Shape2D R=new Rectangle1();
	   Shape2D C=new circle2();
	   R.draw();
	   R.resize();
	   C.draw();
	   C.resize();


	}

}
