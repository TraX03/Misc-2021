import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class A1_Task4plus {
	public static void main(String[] args) {
	
		boolean re, re2, re3, re4;
		Scanner keyboard = new Scanner(System.in);
	
    // 1st do-while start
	do {	
		int positive = 0, negative = 0, total = 0, number;
		String option, option2;
		double average, count = 0;
              
		System.out.println("Input 0 when done, enter the numbers: ");  
		
		//2nd do-while start
		do { 
			try { 
				while((number = Integer.parseInt(keyboard.nextLine())) != 0) { 
					total += number;
					count++;
				if(number > 0){
					positive++;
				} 
				else if(number < 0) {
					negative++;	
				}
				}
			re2 = false;
			}catch(NumberFormatException e) {
				System.out.println("Sorry, integers only. Please re-enter number.");
				re2 = true;
				
			}
		}while(re2);
		//2nd do-while end
		
		//3rd do-while start
		do {
			average = total/count;
			System.out.println("Which do you prefer? \nEnter A for 2 decimal places, Enter B for 4 decimal places \nEnter C to cancel");
			option = keyboard.nextLine();
	
				if(option.equals("A")) {	
					NumberFormat nf = new DecimalFormat("#0.00"); //2 decimal    
					System.out.println("\nNumber of positives: " + positive + "\nNumber of negatives: " 
										+ negative + "\nThe total is " + total + "\nThe average is " + nf.format(average));
					re3 = re = false;
				}
				else if(option.equals("B")) {
					NumberFormat nf = new DecimalFormat("#0.0000"); //4 decimal
					System.out.println("\nNumber of positives: " + positive + "\nNumber of negatives: " 
										+ negative + "\nThe total is " + total + "\nThe average is " + nf.format(average));
					re3 = re = false;
				}
				else if(option.equals("C")){
					//4th do-while start
					do {
					System.out.println("Do you want to return to the start? \n 1: Yes  2: No");
					option2 = keyboard.nextLine();
							if(option2.equals("1")) {
								System.out.println("Alright then, all values will be reset.");
								re = true;
								re4 = false;
							}
							else if(option2.equals("2")){
								System.out.println("Alright then, bye.");
								re = re4 = false;
							
							}
							else {
								System.out.println("Invalid response. Please try again.");	
								re = false;
								re4 = true;
							}
					}while(re4);
					//4th do-while end
				re3 = false;
				}
				else {
					System.out.println("Option does not exist. Please try again. (No spacing and uppercase only)");
					re3 = true;
					re = false;
				}
		}while(re3);	
		//3rd do while end		
				
	}while(re);
	//1st do-while end
	
		keyboard.close();
	    
	}
}
