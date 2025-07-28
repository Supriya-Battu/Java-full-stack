package src;

class test
{
	//test()
	void show(int a)
	//test(int a)
	{
		//int a=20;
		System.out.println("HII"+a);
	}
}
public class Demo extends test {

	void show()
	//Demo ()
	{
		//in java there is no garbage value but the constructor default give the 0 in int , null in string
		//int a=30;
		//super(10);//Super() key word is used when the super class has parameter then we call that in default child class constructor
		//when superclass & sub class has same methods then only child class is called ; to get super class value call it in super class using super.show(10)
		super.show(10);
		
		System.out.println("Hello");
		//System.out.println("HII"+super.a);//to call the value of a from super class
		//System.out.println(a);
	}
	/*static void first()
	//void first()
	{
		System.out.println("HI");
		second();
		
	}
	void second()
	{
		System.out.println("HEllo");
		
	}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d = new Demo();
		d.show();
		//Demo.first();
		//d.first();
		//d.second();

	}

}
//by using static we can only call static
//sub class consturctor calls super class constructor