package testPackageTr;


class Test{
    String val;	
    
    void main(String[] args)
    {
    	
    }
	public String getVal()
	{
		return val;			
    }
}

public  class State {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(args[0]+"  "+ args[1]);
		
		
		String[] arr={"re","tr"};
		Main2 mn= new Main2();
		mn.main(arr);
		String val ="testing";
		Test obj = new Test();
		obj.val="123";
		System.out.println(obj.getVal());
		
		Account acnt = new Account("testnum","testType",1230);
		
		acnt.acnNum="123_acntNum";
		acnt.acntType="Savings";
		acnt.amnt=1000;
		System.out.println("Account Num "+acnt.acnNum+" Account Type : "+acnt.acntType+" amount is :"+acnt.amnt);
		
		acnt.deposit(1000);
		System.out.println(acnt.amnt);	
		acnt.withDraw(500);
		
		System.out.println(acnt.amnt);	
		
		
		
	}
	
	void swit()
	{
		int i=13;
		
		switch(i)
		{
		case 11:
			System.out.println(11);
			break;
			
		case 12:
			System.out.println(12);
			break;
			
		case 13:
			System.out.println(13);
		case 14:
			System.out.println(14);
			break;
			default:
				System.out.println("default");
			
		}
	}
	
	static void fun1()
	{
		for(int i=6;i>0;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}



