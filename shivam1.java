package practice.in;
import java.util.*;

public class shivam1 implements client{
	Scanner sc = new Scanner(System.in);
	String name = sc.next();
	
	int salary = sc.nextInt();
	
	
	public void input() {
		
	}

	@Override
	public void output() {
		
		
		System.out.println("Name of emp : " +name);
		System.out.println("Salary of emp : " +salary);
	}
}
