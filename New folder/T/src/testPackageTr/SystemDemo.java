package testPackageTr;

public class SystemDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("test");		
		System.err.println("error");
//		try{
//		char c= (char)System.in.read();
//		System.out.println("value is "+ c);
//		}
//		catch(Exception e)
//		{ } 
		
		
		System.out.println(System.getProperty("java.version"));
		long startTime = System.currentTimeMillis();
		
		System.out.println("enter string to display "+getString());
		
		long endTime = System.currentTimeMillis();
		
		System.out.println("time for execution is :"+(endTime-startTime));
	}
	
	public static String getString()
	{
		StringBuffer str= new StringBuffer();
		try{
			char c=(char)System.in.read();
			
			while(c!='\r')
			{
				str.append(c);
			    c=(char)System.in.read();				
			}						
		}
		catch(Exception e)
		{			
		}
		return str.toString();
	}

}
