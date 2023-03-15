//this is functional style operations --> filtering, fetching and collecting

import java.util.*;
import java.util.stream.Collectors;
public class Cust {
	int cid;
	String cname;
	int age;
	public Cust(int cid, String cname, int age) {

		this.cid = cid;
		this.cname = cname;
		this.age = age;
	}
	public static void main(String[] args)
	{
		List<Cust> cl=new ArrayList<>();
		cl.add(new Cust(1,"abc",10));
		cl.add(new Cust(2,"xyz",12));
		cl.add(new Cust(3,"pqr",14));
		//second code
		//List<Integer> ca= cl.stream().filter(c->c.age>10).map(c->c.age).collect(Collectors.toList());
	/* first code //List<Integer> ca=new ArrayList<>();
		for(Cust cc:cl)
		{
			if(cc.age>10)//filtering
			{
				ca.add(cc.age);//fetching is here
			}
		}
		System.out.println(ca);//collecting  */
		// third code
		Cust ca=cl.stream().max((c1,c2)->c1.age>c2.age?1:-1).get();
		System.out.println(ca.age);
	}
	
}
