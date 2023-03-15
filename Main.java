import java.util.Scanner;
class Product
{
	int pid;
	String pname;
	int up;
	int qty;
	int stk;
	int tc=0;
	Product(int pid, String pname,int up, int qty, int stk)
	{
		this.pid=pid;
		this.pname=pname;
		this.up=up;
		this.qty=qty;
		this.stk=stk;
	}
	int total_cost()
	{
		
		if(qty>stk)
		{
			return 0;
		}
		else
		{
			tc=up*qty;
			stk=stk-qty;
		}
		
		return tc;
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter total number of products:");
		int tp=sc.nextInt();
		Product p[]=new Product[tp];
		for(int i=0;i<tp;i++)
		{
			int pid=i+1;
			System.out.print("Enter Product Name:");
			String pname=sc.next();
			System.out.print("Enter Unit Price:");
			int up=sc.nextInt();
			System.out.print("Enter Total Quantity:");
			int qty=sc.nextInt();
			System.out.print("Enter Total Stock:");
			int stk=sc.nextInt();
			p[i]=new Product(pid,pname,up,qty,stk);
			
		}
		int total=0;
		for(int i=0;i<tp;i++)
		{
			if(p[i].total_cost()==0)
			{
				System.out.println("Product "+p[i].pid+" is Out of Stock");
				continue;
			}
			total+=p[i].tc;
			System.out.println("Cost Of Product "+p[i].pid+":"+p[i].tc);
			System.out.println("Remaining Stock of Product "+p[i].pid+":"+p[i].stk);
		}
		System.out.println("Total Cost:"+total);

	}

}
