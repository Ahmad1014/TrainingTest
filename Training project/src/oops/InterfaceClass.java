package oops;

public class InterfaceClass implements Calculator, DisplayOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
InterfaceClass obj = new InterfaceClass();
obj.add();
obj.subt();
obj.division();
obj.mutiplication();
obj.display();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(" Display method");
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println(" Addition method");
	}

	@Override
	public void subt() {
		// TODO Auto-generated method stub
		System.out.println(" Subtraction method");
	}

	@Override
	public void division() {
		// TODO Auto-generated method stub
		System.out.println(" Division method");
	}

	@Override
	public void mutiplication() {
		// TODO Auto-generated method stub
		System.out.println(" Multiplication method");
	}

}
interface Calculator
{
	void add();
	void subt();
	void division();
	void mutiplication();
}

interface DisplayOutput
{
	void display();
}