//instance 
interface In1
{
	void m1();
}
public class main1 {
public void calc()
{
	System.out.println("Calling...");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		main1 a=new main1();
		In1 i1=a::calc;
		i1.m1();
		
		//a.calc();
		
	}

}
