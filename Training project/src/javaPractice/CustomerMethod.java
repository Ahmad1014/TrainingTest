package javaPractice;

public class CustomerMethod {

	void salary_amount_paid (int Paid)
	{
	System.out.println("Amount Paid" +Paid);
	}
	
	String Name;
	String Sex;
	String Address;
	int ssn;
	int salary;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CustomerMethod obj = new CustomerMethod();
		obj.Name = " Ahmad";
		obj.Sex = " Male";
		obj.Address = " California";
		obj.ssn =  123456789;
		obj.salary =  1000;
		
		System.out.println("Employee Name" +obj.Name);
		System.out.println("Employee gender" +obj.Sex);
		System.out.println("Employee Address" +obj.Address);
		System.out.println("Employee SSN" +obj.ssn);
		System.out.println("Employee Salary" +obj.salary);
		

		CustomerMethod Salary = new CustomerMethod();
		
		Salary.salary_amount_paid(1000);
		
		
		
		//
		
		CustomerMethod obj1 = new CustomerMethod();
		
		obj1.Name =" Ali";
		obj1.Sex = " Male";
		obj1.Address = " California";
		obj1.ssn =  987654321;
		obj1.salary =  2000;
		
		System.out.println("Employee Name " +obj1.Name);
		System.out.println("Employee gender" +obj1.Sex);
		System.out.println("Employee Address" +obj1.Address);
		System.out.println("Employee SSN" +obj1.ssn);
		System.out.println("Employee Salary" +obj1.salary);
		
		
		
		CustomerMethod Salary2 = new CustomerMethod();
		Salary2.salary_amount_paid(2000);
		
		//
		
		
		CustomerMethod obj2 = new CustomerMethod ();
		
		obj2.Name = " Liya";
		obj2.Sex = " Female";
		obj2.Address = " Virginia";
		obj2.ssn =  567453456;
		obj2.salary =  3000;
		
		System.out.println("Employee Name" +obj2.Name);
		System.out.println(" Employee Gender" +obj.Sex);
		System.out.println(" Employee Addess" +obj2.Address);
		System.out.println(" Employee SSN" +obj.ssn);
		System.out.println("Employee Salary" +obj2.salary);
		
		
		
		CustomerMethod Salary3 = new CustomerMethod();
		Salary3.salary_amount_paid(3000);
		
		
		
	}

}
