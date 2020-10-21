package shopping;

import java.util.Scanner;

public class testAmazon {

	public static void main(String[] args) {
		product p1=new product();
		p1.display();
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter details id,firstname,lastname,address,mobileno");
		int id=sc.nextInt();
		String firstname=sc.next();
		String lastname=sc.next();
		String address=sc.next();
		String mobileno=sc.next();	
		costumer c1=new costumer(id,firstname,lastname,address,mobileno);
		c1.showdetails();
		
	    item i=new item();
	    i.details();
		
	}

}
