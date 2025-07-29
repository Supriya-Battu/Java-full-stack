package src;

public class ArraysDemo {

	public static void main(String[] args) {
		// Array index position starts from 0
		//literal Syntax
		String[] names = {"Rahul","Kiran","Mohan","Kumar"};
		// to get specific index value
		System.out.println(names[1]);
		//To get all elements
		//enhanced for loop(for each loop)
		for(String name:names)
			System.out.println(name);
		//object syntax
		int rno[] = new int [3];
		rno[0] = 1001;
		rno[1] = 1002;
		rno[2] = 1003;
		rno[3 ] = 1004;
		System.out.println(rno[3]);
	}

}
