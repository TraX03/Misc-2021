import java.util.Scanner;

public class A1_Task4 {
	public static void main(String[] args) {
		
		int positive = 0, negative = 0, total = 0, number;
		double average, count = 0;

		Scanner keyboard = new Scanner(System.in);

		
		System.out.println("Enter the numbers: ");  
		
	     while((number = keyboard.nextInt()) != 0) { 
	         total += number;
	         count++; 
	         
	         if(number > 0){
	             positive++;
	         } 
	         else if(number < 0) {
	             negative++;
	         }
	     } 
	     
	     average = Math.round(total/count*100.00) /100.00;  //round of to 2 decimal place
	     System.out.println("Number of positives: " + positive + "\nNumber of negatives: " 
	    		 			+ negative + "\nThe total is " + total + "\nThe average is " + average);
	     
	      keyboard.close();
	      }
	    }
	 
