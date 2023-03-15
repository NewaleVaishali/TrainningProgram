
public class CtrlStat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. if-else Statement
		int age=18;
		if(age>=18)
		{
			System.out.println("Person is eligible for voting");
		}
		else
		{
			System.out.println("Person is not eligible for voting");
		}
		
		//2. switch statement
		int ch=2;
		switch(ch)
		{
		case 1: System.out.println("Choice is 1");
		break;
		case 2: System.out.println("Choice is 2");
		break;
		default: System.out.println("Choice is 1");
		}
		
		//3. for loop
		int n=4;
		for(int i=0;i<n;i++)
		{
			System.out.println("Number:"+i);
		}
		
		//4. while loop
		while(n>0)
		{
			System.out.println("Number in while loop:"+n);
			n--;
		}
		
		//5. do-while loop
		do {
			System.out.println("Number in do-while loop:"+n);
			n++;
		}while(n<4);
	}

}
