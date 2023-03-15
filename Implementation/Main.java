interface Trans{
	void status();
}

public class Main {

	public static void msgStatus()
	{
		System.out.println("static method reference...");
	}
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Trans t=Main::msgStatus;
		t.status();
	}

}
