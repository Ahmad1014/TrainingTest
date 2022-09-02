package oops;

public class Objectprogram {
	
	Objectprogram()
	{
		System.out.println("Username and password 2");
	}

	void add()
	{
		int sum =10+20;
		System.out.println("Sum of two number "+sum);
	}
	
	
	int sub(int a ,int b)
	{
		int subt=a-b;
		return subt;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Objectprogram obj= new Objectprogram();
		obj.add();
		System.out.println(obj.sub(50,30));
		
		
		obj.add();
	}

}
