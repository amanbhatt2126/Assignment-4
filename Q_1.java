//Aman Bhatt 19105013
import java.util.Scanner;
import java.util.*;

public class Q_1 {
	public static void main(String args[])
	{
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter the starting size of vector:");
	    int v_size=scan.nextInt(), adding;
	    String inp;
		Vector<String> temp=new Vector<String>(v_size);
		System.out.println("Do you want to add an element in the vector? If yes then type yes otherwise no");
		inp=scan.next();
		while(inp.equals("yes") )
		{
			System.out.println("Enter number which you want to enter:");
			adding=scan.nextInt();
			temp.addElement(String.valueOf(adding));
			System.out.println("Do you want to add an element in the vector? If yes then type yes otherwise no");
			inp=scan.next();
		}
		System.out.print("Vector is: ");
		for (String x:temp)
		{
			System.out.print(x+" ");
		}
	}


}
