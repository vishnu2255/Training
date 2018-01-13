package sourcePackage;

import static java.util.Calendar.SATURDAY;;
public class Circle {

	static double rad =1.5 ;
	
	static double area()
	{
	return rad;
	}
	
	public Circle(double r)
	{
		this.rad=r;
		System.out.println("inside Constructor");
	}
	
	static{
		System.out.println("Static Block");
	}
	
	public int hashCode()
	{
		return 121;
		
	}
	public boolean equals(Circle obj)
	{
		if(this.getClass() != obj.getClass())
		{
			return false;
		}
		else
		{
			return true;
		}
		
		
	}
	public static void main(String[] args)
	{
		Circle c= new  Circle(10);
		Circle c2= new Circle(12);
		
		System.out.println(c);
		System.out.println(c2);
		
		int val=2;
		int val2=2;
		
//		c2=c;
//		System.out.println("vars compare"+(val==val2));
		
		System.out.println("comparing Objects "+(c==c2));
		System.out.println(c.equals(c2));
		
//		System.out.println(rad);
//		System.out.println(c.rad);
//		
//		for(int i=1;i<11;i++)
//		{
//			if(i%2==0)
//			{
//				continue;
//			}
//			
//			System.out.println("value is :"+i);
//		}
//		
//		if(SATURDAY==5)
//		{
//			System.out.println("saturday");
//			
//		}
//		else
//		{
//			System.out.println("no");
//		}
	}
}
