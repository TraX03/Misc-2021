import java.util.Scanner; //keyboard

public class A1_Task2Plain {
	public static void main(String[] args) {
		
		String name, name2, name3;
		double time, time2, time3;
		
		Scanner keyboard = new Scanner(System.in);
		
		//Enter input
		System.out.println("Please enter first runner name.");
		name = keyboard.nextLine();
		System.out.println("Please enter time taken by runner to finish the race in minutes.");
		time = keyboard.nextDouble();
		
		keyboard.nextLine(); //dummy keyboard
		System.out.println("Please enter second runner name.");
		name2 = keyboard.nextLine();
		System.out.println("Please enter time taken by runner to finish the race in minutes.");
		time2 = keyboard.nextDouble();
		
		keyboard.nextLine(); 
		System.out.println("Please enter third runner name.");
		name3 = keyboard.nextLine();
		System.out.println("Please enter time taken by runner to finish the race in minutes.");
		time3 = keyboard.nextDouble();
		
		//Output
		System.out.println("\nLEADERBOARD");
		
		//Determine the order of the runners
		if (time < time2 && time < time3) 
		{
			if (time2 > time3)
				System.out.println(name + "\n" + name3 + "\n" + name2);
			else if (time2 < time3)
				System.out.println(name + "\n" + name2 + "\n" + name3);
		}
		else if (time > time2 && time < time3)
			System.out.print(name2 + "\n" + name + "\n" + name3);
		else if (time < time2 && time > time3)
			System.out.print(name3 + "\n" + name + "\n" + name2);
		else
		{
			if(time2 < time3)
				System.out.println(name2 + "\n" + name3 + "\n" + name);
			else if (time2 >time3)
				System.out.println(name3 + "\n" + name2 + "\n" + name);
		}
			
		keyboard.close();
	
	}

}
