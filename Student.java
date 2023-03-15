class Student
{
	String sid, sName;
	int m1,m2,m3,nop;
	int atnd=280;
	int tot;
	int avg;
	int reg;
	
	Student(String sid, String sName, int m1, int m2, int m3,int nop)
	{
		this.sid=sid;
		this.sName=sName;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		this.nop=nop;
	}
	void avg()
	{
		tot=m1+m2+m3;
		System.out.println("Total marks of "+sName+" :"+tot);
		avg=tot/3;
		System.out.println("Average marks of "+sName+" :"+avg);
	}
	
	void att()
	{
		reg=(nop/atnd)*100;
		if(reg>50)
		{
			System.out.println("Student Name:"+sName+" ID:"+sid+" is regular");
		}
		else
		{
			System.out.println("Student Name:"+sName+" ID:"+sid+" is not regular");
		}
	}
}
public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1= new Student("1", "XYZ", 75, 75, 75, 140);
		s1.avg();
		s1.att();

	}

}
