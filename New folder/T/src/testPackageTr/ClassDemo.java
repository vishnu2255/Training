package testPackageTr;

public class ClassDemo {

	
	public static void main(String[] args)
	{
		String info="hello";
		Class testcalss = info.getClass();
		System.out.println("name is : "+ testcalss.getName());
		
		Class test2=null;
		try{
		test2= Class.forName("ObjectDemo");
		System.out.println(test2.getName());
		
		ObjectDemo obj = (ObjectDemo)test2.newInstance();
		
		System.out.println(obj.info+" "+obj.val);
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		};
	}
}
