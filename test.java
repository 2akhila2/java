package mca;
import java.util.*;
import graphics.*;
public class test
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the length of the rectangle:");
	int length=sc.nextInt();
	System.out.println("Enter the breadth of the rectangle:");
	int breadth=sc.nextInt();
	rectangle rect = new rectangle(length, breadth);
	System.out.println("Area of Rectangle: " + rect.area());
	System.out.println("\n");
	
	System.out.println("Enter radius of circle ");
	double r=sc.nextDouble();
	circle cir=new circle(r);
	System.out.println("Area of circle is "+cir.area());
	System.out.println("\n");
	
	System.out.println("Enter length of square ");
	int a=sc.nextInt();
	square sq=new square(a);
	System.out.println("Area of square is "+sq.area());
	System.out.println("\n");
	
	System.out.print("Enter the height of the triangle:");
	int h=sc.nextInt();
	System.out.print("Enter the breadth of the triangle:");
	int b=sc.nextInt();
	rectangle tri = new rectangle(b,h);
	System.out.println("Area of triangle: " + tri.area());
	System.out.println("\n");
	}
}
		
	
