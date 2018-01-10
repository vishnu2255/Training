package testPackageTr;

public class Account {
	public String acnNum;
	public String acntType;
	public long amnt;
	
    void setAcntNum(String acn)
	{
		acnNum=acn;
	}
	
	public String getAcnType()
	{
		return acntType;
	}
	
	   void setAcntType(String acn)
		{
		 acntType=acn;
		}
		
		public String getAcnNum()
		{
			return acnNum;
		}
		
		

			
	
	public Account()
	{
		System.out.println("Acnt constructor");
	}
	
	public Account(String acnt,String acnType,long amnt)
	{
		this.acnNum=acnt;
		this.acntType=acnType;
		this.amnt = amnt;
	}
	
	
	public boolean withDraw(long amt)
	{
		int num;
		if(amt>amnt)
		{
			return false;	
		}
		else
		{
		amnt=amnt-amt;
		return true;	
		}										
	}
	
	public boolean deposit(long amt)
	{
		if(amt<0)
		{
			return false;
		}
		else{
			amnt=amnt+amt;
			return true;
		}
		
	}
		
	
}
