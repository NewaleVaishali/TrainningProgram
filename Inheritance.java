// Inheritance
class Parent
{
	void m1()
	{
		System.out.println("I am parent");
	}
}

//single Inheritance
class Child extends Parent
{
	void m2()
	{
		System.out.println("I am child");
	}
}

//Multilevel Inheritance
class GrandChild extends Child{
	void m3()
	{
		System.out.println("I am grandchild");
	}
}

//Multiple Inheritance
class C implements B,D{
	public void m1()
	{
		System.out.println("I am in interface B");
	}
	public void m2()
	{
		System.out.println("I am in interface D");
	}
}
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c1=new Child();
		GrandChild g1=new GrandChild();
		C a1=new C();
		c1.m1();
		g1.m1();// parent class method
		g1.m2();// child class method
		a1.m1();//method of interface B
		a1.m2();//method of interface D
	}

}
