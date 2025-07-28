package src;

public class Loop {
 
	public static void main(String[] args)
	{
		int rollno[] = {1001,1002,1003};

		// traditional for loop
		for(int i = 0; i < rollno.length; i++)
		{
			System.out.println(rollno[i]);
		}

		// enhanced for loop 
		for(int r : rollno)
		{        
			System.out.println(r);
		}
	}
}
