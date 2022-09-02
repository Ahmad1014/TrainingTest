package javaPractice;

public class CustomerClass {

	String Name;
	String Gender;
	int EID;
	int Pay;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("ABC Inc list of employees");

		CustomerClass a= new CustomerClass();
		a.Name = "Ahmad";
		a.Gender = "Male";
		a.EID = 100;
		a.Pay = 1000;
		
		System.out.println("Employee Name" +a.Name);
		System.out.println(" Gender" +a.Gender);
		System.out.println("EID" +a.EID);
		System.out.println(+a.Pay);
		
		
		
		CustomerClass b= new CustomerClass();
		b.Name = "Ali";
		b.Gender = "Male";
		b.EID = 101;
		b.Pay = 2000;
		
		System.out.println("Employee Name" +b.Name);
		System.out.println(" Gender" +b.Gender);
		System.out.println("EID" +b.EID);
		System.out.println("Pay" +b.Pay);
		
		
		
		CustomerClass c = new CustomerClass();
		
		c.Name = "Liya";
		c.Gender = "Female";
		c.EID = 102;
		c.Pay = 3000;
		
		System.out.println("Employee Name" +c.Name);
		System.out.println(" Gender" +c.Gender);
		System.out.println("EID" +c.EID);
		System.out.println("Pay" +c.Pay);
		
		
		
		
		
		
	}

}
