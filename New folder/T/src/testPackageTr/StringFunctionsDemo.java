package testPackageTr;

import java.util.Scanner;

public class StringFunctionsDemo {

	public static void main(String[] args)
	{
		swap("tree is good");
		String s1="java";
		String s2="hello java";
//		range();
//		System.out.println(getString()); 
		wordsCount("geeks for greeks.");	
		String val =getString();
		System.out.println(reverse(val));
//		System.out.println(range());
//		System.out.println(s1.compareTo(s2));		
		System.out.println(s2.indexOf('a',4));
		System.out.println(s2.length());
		System.out.println(s2.replace("ll", "bb"));
		
		System.out.println(s2.replace("a","a"));
	}
	
	static void swap(String str)
	{		
		StringBuilder s = new StringBuilder(str);
		char[] c= str.toCharArray();
		
		String[] ar = str.split(" ");
		String res="";
		for(int i=0;i<ar.length;i++)
		{
			char[] dumm=ar[i].toCharArray();
			char temp= dumm[0];
			dumm[0] = dumm[dumm.length-1];
			dumm[dumm.length-1] = temp;
			
			for(int j=0;j<dumm.length;j++)
			{
				res=res+dumm[j];
			}
			res=res+" ";
		}
		
		System.out.println(res.trim());
		
//		char[] c= str.toCharArray();		
//		for(int i=0;i<c.length;i++)
//		{ 
//			int k=i;			
//			while(i<c.length && c[i]!=' ')
//			{
//				i++;
//			}			
//			char temp = c[i-1];
//			c[i-1]=c[k];
//			c[k]=temp;
//		}
//		System.out.println(c.toString());
//		System.out.println(c);
	}
	static void wordsCount(String str)
	{		
		char[] s=str.toCharArray();
		for(int i=0;i<s.length;i++)
		{			
			String res = "";
			while(i<s.length && s[i] != ' ')
			{
				res=res+s[i];
				i++;
			}			
			System.out.println(res+" len is : "+res.length());
		}
//		int j=str.indexOf(" ");
//		while(j>0)
//		{
//			
//			System.out.println(str.substring(0,j)+"-->>   words "+ j);
//			str=str.substring(j+1) ;
//			j=str.indexOf(" ");
//		}
//		
//		System.out.println(str+"-->>  words "+str.length());
	}
	static String reverse(String str)
	{
		String[] arr= str.split(" ");
		StringBuffer fin = new StringBuffer();
		
		for(int i=arr.length-1;i>=0;i--)
		{
			fin.append(arr[i]).append('.');
		}
		
		return fin.toString().substring(0,fin.length()-1);
	}
	static String getString()
	{   Scanner sc = new Scanner(System.in);
		String temp = sc.nextLine();
		StringBuffer str = new StringBuffer();
		for(int i=0;i<temp.length();i++)
		{
			if(temp.charAt(i)=='.')
			{
				str.append(" ");
			}
			else{
				str.append(temp.charAt(i));
			}
		}
		sc.close();
		return str.toString();
	}
	static String range()
	{
		String input = "1-5,8,11-14,18,20,26-29";
		String[] arr =input.split(",");
		String op="";
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].contains("-"))
			{
				String[] sub = arr[i].split("-");
				int a= Integer.parseInt(sub[0]);
				int b= Integer.parseInt(sub[sub.length-1]);
				
				for(int j=a;j<=b;j++)
				{
					op=op+","+ Integer.toString(j);
				}
				
			}
			else
			{
				op=op+"," + Integer.parseInt(arr[i]);
			}
		}
		return op.substring(1);
	}
}
