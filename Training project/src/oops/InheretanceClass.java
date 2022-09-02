package oops;

public class InheretanceClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BOA Obj =new BOA();
		Obj.interest();
		
	Obj.withdraw();
	}

}

class Bank
{
	void interest()
	{
		System.out.println("Intrest by bank");
	}
}
class BOA extends Bank
{
	void withdraw()
	{
		System.out.println("Withdraw amount");
	}
}