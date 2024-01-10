package javaoops;

abstract class Shape3D
{
	public abstract double calculateVolume();
	public abstract double calculateSurfaceArea();
}
abstract class Sphere1 extends Shape3D
{
    private double radius;
    public Sphere1(int radius)
    {
    	this.radius=radius;
    }
    public double calculateVolume()
    {
    	return (4.0/3.0)*Math.PI*Math.pow(radius,3);
    }
    public double calcualteSurfaceArea()
    {
    	return 4*Math.PI*Math.pow(radius,2);
    }
}
abstract class Cube1 extends Shape3D
{
	private double sideLength;
	public Cube1(int sideLength)
	{
		this.sideLength=sideLength;
	}
	public double calculateVolume()
	{
		return (double) Math.pow(sideLength,3);
	}
	public double calculatesurfaceArea()
	{
		return 6*Math.pow(sideLength,2);
	}
}
public class Shapee 
{
     public static void main(String[]args)
     {
    	 Shape3D Sphere=new  Sphere1(7);
    	 Shape3D Cube=new  Cube1(6,0);
    	 System.out.println("Sphere volume:"+Sphere.calculateVolume());
    	 System.out.println("Sphere surfaceArea:"+Sphere.calculateSurfaceArea());
    	 System.out.println("Cube volume:"+Cube.calculateVolume());
    	 System.out.println("Cube surfaceArea"+Cube.calculateSurfaceArea());
     }

}
