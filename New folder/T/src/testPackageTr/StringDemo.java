package testPackageTr;

public class StringDemo {

	
	public static void main(String[] args)
	{
		String s1="hello";
		String s2= "hello";	
		StringBuilder str = new StringBuilder("test string");
		System.out.println(str.indexOf("t"));
		System.out.println(str.insert(0, "words"));
		System.out.println(str.substring(2,6));
		System.out.println(str.length());
		System.out.println(str.capacity());
		Runtime run= Runtime.getRuntime();
		System.gc();
		System.out.println(run.maxMemory());
		System.out.println(s1.length());
		System.out.println(s1.substring(2));
//		System.out.println("tot mem is :"+run.totalMemory()/(1024*1024));
//		System.out.println("free mem is :"+run.freeMemory()/(1024*1024));
//		
//		for(int i=0;i<50000;i++)
//		{
//			str=str.append(s1);
//		}
//		
//		System.out.println("tot mem is :"+run.totalMemory()/(1024*1024));
//		System.out.println("free mem is :"+run.freeMemory()/(1024*1024));
		
//		String s3= new String("hello");
//		if(s1==s3)
//		{
//			System.out.println("same");
//		}
//		else
//		{
//			System.out.println("diff");
//		}
		
				
	}
}
