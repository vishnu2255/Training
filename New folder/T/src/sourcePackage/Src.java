package sourcePackage;

public class Src {

	public int pub =12;
	private int pri=13;
	protected int prot =32;
	int def=25;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Src s =new Src();
System.out.println(s.pub);
System.out.println(s.pri);
System.out.println(s.prot);
System.out.println(s.def);

SourceJava sr= new SourceJava();
System.out.println(sr.pub);
//System.out.println(sr.pri);
System.out.println(sr.prot);
System.out.println(sr.def);

	}

}
