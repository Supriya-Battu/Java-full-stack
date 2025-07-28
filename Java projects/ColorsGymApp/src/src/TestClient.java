package src;

import java.util.Scanner;

public class TestClient {

	public static void main(String[] args)
	{
		//create objects
		UserImpl userobj = new UserImpl();
		WorkOutImpl workoutobj = new WorkOutImpl();
		
		//user
		Scanner sc= new Scanner(System.in);
		
		System.out.println("welcome to colorsgym app");
		System.out.println("please Register with your details");
		System.out.println("please enter ur firstname");
		String a = sc.next();
		System.out.println("please enter lastname");
		String b = sc.next();
		
		System.out.println("please enter username");
		String c = sc.next();
		
		System.out.println("please enter password");
		String d = sc.next();
		
		User user = new User(a,b,c,d);
		System.out.println("thank you ... your details are with us");
		System.out.println("please enter your username");
		String e=sc.next();
		System.out.println("please enter your password");
		String f= sc.next();
		userobj.register(user,0);
		boolean result = userobj.login(e,f);
		System.out.println("user login:"+result);
		if (result== true)
		{
			System.out.println(a+".... welcome to colors gym");
			System.out.println("please follow below menu for your fitness");
			WorkOut workout = new WorkOut("cardio","tredmill",0,10,"fitness");
			WorkOut workout1 = new WorkOut("muscle","dumbell",20,10,"strength");
			workoutobj.addWorkOut(workout, 0);
			workoutobj.addWorkOut(workout1, 1);
			WorkOut workouts[] = workoutobj.displayWorkOuts();
			for(WorkOut work:workouts)
			{
				System.out.println(work);
			}
		}
		else
		{
			System.out.println("please enter correct details");
		}
		/*userobj.register(user, 0);
		boolean result = userobj.login("KLRAHUL", "rahul@1");
		System.out.println("user login:"+result);
		System.out.println(user);*/
		
		//workout
		

	}
}
