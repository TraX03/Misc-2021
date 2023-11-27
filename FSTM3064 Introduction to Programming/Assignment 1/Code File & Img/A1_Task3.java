import java.util.Scanner; 

public class A1_Task3 {
	public static void main(String[] args) {
		String day;
		int age, cost;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please enter a day of the week >> ");
		day = keyboard.nextLine();
		
		System.out.print("Please enter age >> ");
		age = keyboard.nextInt();
		
		//2 conditions
		switch (day) {
		case "Monday", "monday", "Tuesday", "tuesday", "Wednesday", "wednesday", "Thursday", "thursday":
			if (age >= 0 && age < 10) {
				cost = 0;
			}
			else if (age >= 10 && age <= 65) {
				cost = 10;
			}
			else if (age > 65) {
				cost = 0;
			}
			else { 
				cost = 1;
			}
		
		break;
				
		case "Friday", "friday", "Saturday", "saturday", "Sunday", "sunday":
			if (age >= 0 && age < 10) {
				cost = 10;
			}
			else if (age >= 10 && age <= 65) {
				cost = 20;
			}
			else if (age > 65) {
				cost = 10;
			}
			else {
				cost = 1;
			}
		
		break;
		
		default: 
			System.out.println("That is not a day. (ㆆ_ㆆ)");	
			if (age >= 0) {
				cost = 2;
			}
			else {
				cost = 1;
			}
		}
		
		// conditions for different output
		if (cost == 2)
			System.out.println();
		else if (cost != 1) 
			System.out.println("\nThe day you chose: " + day + "\nCost of theatre ticket: RM" + cost );
		else 
			System.out.println("Age is not valid. (눈_눈)");
		
		keyboard.close();
	}

}
