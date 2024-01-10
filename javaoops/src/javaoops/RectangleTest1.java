package javaoops;

abstract class Rectangle 
{
 
         private int length; 
         private int breadth; 
         public Rectangle(int breadth)
        {  
             this.breadth = breadth; 
         } 
         public int getBreadth(int i)
        { 
            return breadth; 
        }
        public int setLength(int length)
        { 
             this.length = length; 
        } 

}

public class RectangleTest1
{ 
        public static void main(String[] args)
        { 
             Rectangle rt = new Rectangle(30); 

                int lth = rt.setLength(33); 
                int bth = rt.getBreadth(99); 


                 float Area = lth * bth; 
                  System.out.println("Area: " +Area); 

                    rt.setBreadth("66"); 

                int ln = rt.setLength(99); 
               int br = rt.getBreadth(33); 
               int newArea = ln * br; 
                   System.out.println("New area: " +newArea); 


	}

}
