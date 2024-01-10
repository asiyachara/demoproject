package javaoops;

abstract class Shape
  {
	public abstract double calculateArea();
	public abstract double calculateperimeter();
	
  }
//subclass circle
 class Circle extends Shape
 {
	 private double radius;
	 public Circle(double radius)
	 {
		 this.radius=radius;
	 }
	 public double calculateArea()
	 {
		 return Math.PI*radius*radius;
	 }
	 public double calculateperimeter()
	 {
		 return 2*Math.PI*radius;
	 }
 }
  
 class Triangle extends Shape
 {
	 private double base;
	 private double height;
	 private double side1;
	 private double side2;
	 private double side3;
	 public Triangle(double base,double height,double side1,double side2,double side3)
	 {
		 this.base=base;
		 this.height=height;
		 this.side1=side1;
		 this.side2=side2;
		 this.side3=side3;
	 }
	 public double calculateArea()
	 {
		 return 0.5*base*height;
	 }
	 public double calculateperimeter()
	 {
		 return side1+side2+side3;
	 }
 }
 public class AbstractDemo
 {
	 public static void main(String[] args) 
	 {
		 Circle circle=new Circle(5);
		 Triangle triangle=new Triangle(3,4,5,4,3);
		 System.out.println("Circle Area:"+circle.calculateArea());
		 System.out.println("Circle perimeter:"+circle.calculateperimeter());
		 System.out.println("triangle Area:"+triangle.calculateArea());
		 System.out.println("triangle p:"+triangle.calculateperimeter());
		 
	 }
 
	 
	 
 }
