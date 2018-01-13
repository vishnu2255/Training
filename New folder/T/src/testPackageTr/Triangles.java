package testPackageTr;



public class Triangles {

	
	int base,height,s1,s2,s3;
	
	public Triangles(int base,int height)
	{
		this.base=base;
		this.height=height;
	}
	
	public Triangles(int s1,int s2,int s3)
	{
		this.s1=s1;
		this.s2=s2;
		this.s3=s3; 
	}
	
	public double getArea(int b,int h)
	{
		System.out.println("2 args");
		return (0.5*b*h);
	}
	public int getArea(int a,int b,int c)
	{
		System.out.println("3 args");
		return (a*b*c);
	}
	
	
	public int hashCode()
	{
		return 100;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Triangles tr1= new Triangles(1,2,3);
		tr1.getArea(1,2,3);
		
		Triangles tr2= new Triangles(1,2,3);
		tr2.getArea(2,3);
		
		
		System.out.println(tr1.toString());
		
		System.out.println(tr1.getClass().getName());
		
		tr2=null;
		System.gc();
	}

}


