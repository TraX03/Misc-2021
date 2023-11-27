
//self-learned : joptionpane with multi input, showconfirmdialog(ok_cancel + yes_no), object array, convert jtextfield input to string?

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
	
public class A1_Task3plus {
	
	  public static void main(String[] args) {
		  
		  int cost;
		  
		  ImageIcon error = new ImageIcon("src/angrybird.png"), error2 = new ImageIcon("src/error.png"), error3 = new ImageIcon("src/error2.png");
		  ImageIcon stop = new ImageIcon("src/wait.png"), aa = new ImageIcon("src/he.png"), smug = new ImageIcon("src/smug.png");
		  ImageIcon ticket = new ImageIcon("src/ticket.png"), movie = new ImageIcon("src/cinema.png");
		  
		  JTextField day2 = new JTextField();
		  JTextField age2 = new JTextField();
		  
		  //Array
		  Object[] message = {
				     "Please enter a day of the week.",
				     day2,
				     "Please enter age.",
				     age2
		  };	  
		  
		  //Enter input
		  int option = JOptionPane.showConfirmDialog(null, message, "Info", JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE, ticket);
		  if (option == JOptionPane.OK_OPTION) {
			  //try-catch block start
			  try {
				  
			  int age = Integer.parseInt(age2.getText());
			  String day= day2.getText().toString();
			    
			    //switch start
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
			  			JOptionPane.showMessageDialog(null,"That is not a day or don't blank it.", "Guess what?", JOptionPane.ERROR_MESSAGE, error);	
			  			if (age >= 0) {
			  				cost = 2;
					}
			  			else {
			  				cost = 1;
					}
			  	}
			  	//switch end
			  		
			  		//nested if...else statement start
			  		// conditions for different output
			  		if (cost == 2); //do nothing
			  		else if (cost != 1) 
			  				JOptionPane.showMessageDialog(null,"Day you entered >>  " + day + "\nTheatre ticket price >>  RM" + cost, "Result",JOptionPane.INFORMATION_MESSAGE, movie);
			  		else 
			  				JOptionPane.showMessageDialog(null,"Age is not valid.", "How special, negative age :)", JOptionPane.ERROR_MESSAGE, error2);
			  		//nested if...else statement end
			  		
			 }catch(NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Please input a number.\nSpacing is not allowed.", "ERROR",JOptionPane.ERROR_MESSAGE,error3);
					//informing user about error
					    }
			//try-catch block end
			  
			 }else {
				 int option2 = JOptionPane.showConfirmDialog(null, "Do you really really really want to leave?", "Hold On", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE, stop);
				 	
				 	if (option2 == JOptionPane.YES_OPTION) {
				 		JOptionPane.showMessageDialog(null,"Sayonara.", "ಠ╭╮ಠ",JOptionPane.INFORMATION_MESSAGE, aa);     
				  }
				 	else {
				 		JOptionPane.showMessageDialog(null,"Just kidding, bye.", "(￣y▽￣)╭ Ohohoho.....",JOptionPane.INFORMATION_MESSAGE, smug);  
				 	}
			}
		  
	  }
	}
	