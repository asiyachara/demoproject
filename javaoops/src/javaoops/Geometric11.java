 package javaoops;


abstract class GeometricShape
{
	public abstract double calculateArea();
	public abstract double calculateperimeter();
}
class tri extends GeometricShape
{
     private double s1;
     private double s2;
     private double s3;
     public tri(double s1,double s2,double s3)
     {
    	 this.s1=s1;
    	 this.s2=s2;
    	 this.s3=s3;
     }
     public double calculateArea()
     {
    	 double s=(s1+s2+s3)/2;
    	 return Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
     }
     public double calculateperimeter()
     {
    	 return s1+s2+s3;
    	 
     }
}
class Square extends GeometricShape
{
	private double side;
	public Square(double side)
	{
		this.side=side;
	}
	public double calculateArea()
	{
		return side*side;
	}
	public double calculateperimeter()
	{
		return 4*side;
	}
}

public class Geometric11
{
	public static void main(String[] args)
	{
		GeometricShape G1=new tri(4,5,6);
		GeometricShape G2=new Square(8);
		System.out.println("areaoftriangle:"   +G1.calculateArea());
		System.out.println("perimeteroftriangle" +G1.calculateperimeter());
		System.out.println("areaofsquare" +G2.calculateArea());
		System.out.println("perimeteroftriangle" +G2.calculateperimeter());
		
		

	}

}
