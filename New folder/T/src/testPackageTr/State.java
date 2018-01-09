package testPackageTr;

public class State {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		test: for(int i=0;i<5;i++)
		{
			
			for(int j=0;j<4;j++)
			{
				if(j==2)
				{
					continue test;
				}
				System.out.println("j valueis :"+j);
			}
			
			System.out.println("i value is "+i);
		}
	}

}
