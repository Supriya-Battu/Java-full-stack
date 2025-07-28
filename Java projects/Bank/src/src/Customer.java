package src;
import java.util.Scanner;
import java.lang.String;
public class Customer {
	
		//fields
		int cid;
		String cname;
		String address;
		long mobilenum;
		static String bank = "sbi";
		
		//methods
		
		/*void setCustomerDetails(int a, String b, String c, long d)
		{
			cid= a;
			cname = b;
			address = c;
			mobilenum =d;
		}
		*/
		//CONSTUCTOR
		Customer(int cid, String cname, String address, long mobilenum)
		{
			this.cid= cid;
			this.cname = cname;
			this.address = address;
			this.mobilenum =mobilenum;
		}
		void getCustomerDetails()
		{
			System.out.println("cid is : " + cid);
			System.out.println("cname is : " + cname);
			System.out.println("address is : " + address);
			System.out.println("mobilenum is : " + mobilenum);
			System.out.println("Bank name is : "+ bank);
		}
		public static void main(String [] args)
		{
			Scanner sc= new Scanner(System.in);
			
			System.out.println("welcome to bank account");
			System.out.println("Register to your account");
			System.out.println("please enter id");
			int a = sc.nextInt();
			System.out.println("please enter name");
			String b = sc.next();
			
			System.out.println("please enter address");
			String c = sc.next();
			
			System.out.println("please enter moblie number");
			long d = sc.nextLong();
			
			Customer bc = new Customer(a,b,c,d);
			//bc.setCustomerDetails(a,b,c,d);
			bc.getCustomerDetails();
	}

}