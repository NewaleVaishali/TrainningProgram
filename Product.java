// Product Catalog

class Product
{
	String pid, pName;
	int qty, up, stk;
	int tc;
	int remStk;
	
	Product(String pid, String pName, int qty, int up, int stk)
	{
		this.pid=pid;
		this.pName=pName;
		this.qty=qty;
		this.up=up;
		this.stk=stk;
	}
	int totalCost()
	{
		tc=qty*up;
		return tc;
	}
	
	int remStock()
	{
		remStk=stk-qty;
		return remStk;
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product p1=new Product("1","Pen",10,5,100);
		
		int tc=p1.totalCost();
		int remStk=p1.remStock();
		System.out.println("Toatl Cost of Pen-id is 1 is rs"+tc);
		System.out.println("Remaining Stock of Pen-id is 1 are:"+remStk);

	}

}
