package testPackageTr;

public class ObjectDemo implements Cloneable{

	int val;
	String info;
	
	public ObjectDemo(int val,String info)
	{
		this.val=val;
		this.info=info;
	}
	
	public ObjectDemo()
	{
		this.val=12;
		this.info="testval";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		A oj = new A();
//		System.out.println(A.val);
		ObjectDemo o = new ObjectDemo(10,"info1");
		System.out.println(o.val+" "+o.info);
		
		ObjectDemo o2 = new ObjectDemo(20,"info2");
		System.out.println("object comparison "+o2.equals(o));		
		try{
		ObjectDemo o3 = (ObjectDemo) o.clone();
		System.out.println("new comparison "+o.equals(o3));
		System.out.println(o.hashCode());
		System.out.println(o2.hashCode());
		System.out.println(o3.hashCode());		
		o=null;o2=null;o3=null;
		System.gc();		
		}
		catch(Exception e)
		{			
		}						
	}
	protected void finalize()
	{
		System.out.println(" finalize method ");
	}
	
	public int hashCode()
	{
		int code=1;
		code=code*11+ val;
		code=code*13+ info.hashCode();
		return code;
		
	}
	public boolean equals(ObjectDemo obj)
	{
		if((this.val == obj.val) && (this.info== obj.info))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}


final class A
{	
	static int val=10;
	 A()
	{	
	}	
}

