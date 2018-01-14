package testPackageTr;

public class Main2 {

	
	static void zerostr()
	{
		String str="000012023043";
		char[] ch=str.toCharArray();
		int i=0;
		while(ch[i]=='0')
		{
			i++;
		}
		
		StringBuilder sb =  new StringBuilder(str);
		sb.replace(0, i,"");
		
		System.out.println(sb);
		System.out.println(sb.toString());
	}
	static void multiples()
	{
		int i=2;
		int n=100,cnt=0;
		while(n > 0)
		{
			if(n%i==0)
			{
				cnt++;
			}
			n--;
		}
		System.out.println(cnt);
		
	}
	
	static void prime()
	{
				StringBuilder sr = new StringBuilder();
				
				int cnt=0;
		for(int num=1;num<=100;num++)
		{
			int val=2;
			
			while(val<=num)
			{
				if(num%val==0)
				{
					break;
				}
				val++;
			}
			if(num==val)
			{
				sr.append(Integer.toString(num)).append(",");
//				System.out.println("prime");
				cnt++;
			}
			else
			{
//				System.out.println("not a prime");
			}			
		}
		System.out.println(sr.toString().substring(0,sr.length()-1));
		System.out.println("total cnt :"+cnt);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String val="testing";
     zerostr();
     prime();
     multiples();
	}

}
