package Details;
import java.util.Scanner;

public class Employee {

    // Fields
    int eid;
    String ename;
    String address;
    long mobilenum;
    static String company = "ABC";
    double salary;
    static double hrapercent = 0.2;
    static double pfpercent = 0.12;

    // Constructor
    Employee(int eid, String ename, String address, long mobilenum, double salary) {
        this.eid = eid;
        this.ename = ename;
        this.address = address;
        this.mobilenum = mobilenum;
        this.salary = salary;
    }

    void getEmployeeDetails() {
        System.out.println("Employee Details ");
        System.out.println("Employee ID is : " + eid);
        System.out.println("Employee Name is    : " + ename);
        System.out.println("Address is    : " + address);
        System.out.println("Mobile Number is : " + mobilenum);
        System.out.println("Base Salary is   : " + salary);
        System.out.println("Company Name      : " + company);

        //calculating hra & pf 
        double netSalary;
        double hra = hrapercent * salary;
        double pf = pfpercent * salary;
        // checking if eligible for bonus
        if (salary < 50000) {
            netSalary = salary + hra - pf + 5000;
            System.out.println("Bonus : 5000 ");
        } else {
            netSalary = salary + hra - pf;
        }

        System.out.println("Net Salary : " + netSalary);
    }
    static void Rules()
    {
        System.out.println("Monday to Thursday wear causuals and on Friday,Saturday wear comfortable dress");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to company");
        System.out.println("Register your account");

        System.out.print("Enter ID: ");
        int a = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter Name: ");
        String b = sc.nextLine();

        System.out.print("Enter Address: ");
        String c = sc.nextLine();

        System.out.print("Enter Mobile Number: ");
        long d = sc.nextLong();

        System.out.print("Enter Basic Salary: ");
        double e = sc.nextDouble();

        Employee bc = new Employee(a, b, c, d, e);
        bc.getEmployeeDetails();
        Rules();

    }
}
