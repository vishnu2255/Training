package anotherPackage;

import sourcePackage.SourceJava;
import java.util.*;;

public class NewClass1 extends  SourceJava{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NewClass1 sr= new NewClass1();
		System.out.println(sr.pub);
		//System.out.println(sr.pri);
		System.out.println(sr.prot);
//		System.out.println(sr.def);
		int[] nums = {1,2,3,4};
		int[] res=leet(nums,5);
		System.out.println(res[0]+" "+res[1]);
	}
	
	static int[] leet(int[] nums,int target)
	{
		int[] ret =new int[2];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0;i<nums.length;i++)
		{
			if(map.containsKey(target-nums[i]))
			{
				ret[1]=i;
				ret[0]=map.get(target-nums[i]);
				return ret;
			}
			map.put(nums[i], i);
		}
		return ret;
		
	}

}
