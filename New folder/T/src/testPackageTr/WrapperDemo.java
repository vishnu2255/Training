package testPackageTr;

public class WrapperDemo {

	public static void main(String[] args)
	{
		int i=10;
		Integer in = new Integer(5);
		System.out.println(in);
		in=i;
		System.out.println(in);
		Boolean b= new Boolean(false);
		
		i=in;
		
		System.out.println(checksum(1,2,3,4));
		String s1="test";
		String s2="test2";
		
		System.out.printf("nameis %s and %s \n and display  name is %s",s1,s2,s1+"_"+s2);
		
	}
	public static int checksum(int ... vals)
	{
	int sum=0;
	for(int i:vals)
	{
		sum=sum+i;
	}
	return sum;
	}
}
