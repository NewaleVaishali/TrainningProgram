class Employee
{
	String eid, eName;
	float basic, hra, ta, da;
	float gross;
	
	Employee(String eid, String eName, int basic)
	{
		this.eid=eid;
		this.eName=eName;
		this.basic=basic;
	}
	
	void calculate()
	{
		hra=(float)0.12*basic;
		ta=(float)0.08*basic;
		da=(float)0.09*basic;
		gross=basic+hra+ta+da;
		
		if(gross>=25000)
		{
			System.out.println("A");
		}
		else if(gross>=10000 && gross<25000)
		{
			System.out.println("B");
		}
		else
		{
			System.out.println("C");
		}
	}
}
public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee("1","XYZ",100000);
		e1.calculate();
	}

}
