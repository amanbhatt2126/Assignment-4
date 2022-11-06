//Aman Bhatt 19105013
import java.util.*;

class Employee{
	int yearofjoining;
	String name,addr;
	public Employee(int year,String n,String a)
	{
		yearofjoining=year;
		name=n;
		addr=a;
	}
}

public class Q_2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter total number of people in organization:");
		int employee_number=scan.nextInt();
		int yearofjoining;
		String name,addr;
		Employee info[]=new Employee[employee_number];
		for(int i=0;i<employee_number;i++)
		{   //Loop for every employee
			System.out.println("Enter the name:");
			name=scan.next();
			System.out.println("Enter the year of joining:");
			yearofjoining=scan.nextInt();
			System.out.println("Enter the address:");
			addr=scan.next();
			Employee new_employee=new Employee(yearofjoining,name,addr);
			info[i]=new_employee;
			System.out.println();
		}
		System.out.println("Name        Year of joining        Address");
		for (Employee x:info)
		{
			System.out.println(x.name+"        "+x.yearofjoining+"                  "+x.addr);
		}
		
	}

		

	}


