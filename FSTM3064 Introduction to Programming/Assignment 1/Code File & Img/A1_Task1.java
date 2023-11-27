
//self-learned : try-catch block, add icon to dialog box, change background colour of dialog box

import javax.swing.ImageIcon; 
import javax.swing.JOptionPane; 
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;

public class A1_Task1 {
	public static void main(String[] args){
	
    //setting part start
		
	//declare variable
	int adult = 20, kid = 12, salad = 4, dessert = 5, total, num1, num2, num3, num4;
	String a;
	
	//setting icons
	ImageIcon AMeal= new ImageIcon("src/AMeal.jpg"), KMeal= new ImageIcon("src/KMeal.png");
	ImageIcon Salad= new ImageIcon("src/Salad.png"), Dessert= new ImageIcon("src/Dessert.png");
	ImageIcon Menu= new ImageIcon("src/Menu.png"), menu2= new ImageIcon("src/menu2.png");
	ImageIcon error= new ImageIcon("src/error.png"), nothing = new ImageIcon("src/nothing.png");
	
	//change background colour of dialog box
	UIManager.put("OptionPane.background",new ColorUIResource(239,222,205));
	UIManager.put("Panel.background",new ColorUIResource(239,222,205));
	
	//setting part end
	
	//display menu
	JOptionPane.showMessageDialog(null, "What we have: \nAdult Set   [$20] \nKid Set      [$12] \nSalads       [$4] \nDessert     [$5]", "Rotary Club Menu",JOptionPane.INFORMATION_MESSAGE, menu2);
	 
	
	//input accepts integer only 
	//try-catch block start
	try { 
			//for user to input in dialog box  
			//convert string to integer
			num1 = Integer.parseInt((String)JOptionPane.showInputDialog(null, "How many adult lunch sets would you like?", "ORDER",JOptionPane.QUESTION_MESSAGE, AMeal, null, " "));
			num2 = Integer.parseInt((String)JOptionPane.showInputDialog(null, "How many kid lunch sets would you like?", "ORDER",JOptionPane.QUESTION_MESSAGE, KMeal, null, " "));
			num3 = Integer.parseInt((String)JOptionPane.showInputDialog(null, "How many salads would you like?", "SIDE ORDER",JOptionPane.QUESTION_MESSAGE, Salad, null, " "));
			num4 = Integer.parseInt((String)JOptionPane.showInputDialog(null, "How many desserts would you like?", "SIDE ORDER",JOptionPane.QUESTION_MESSAGE, Dessert, null, " "));
			
			//Nested if...else statement start
			if(num1 == 0 && num2 == 0 && num3 == 0 && num4 == 0) {
				JOptionPane.showMessageDialog(null,"Jeez","You bought nothing!",JOptionPane.PLAIN_MESSAGE,nothing);	
			}
			else if(num1 >= 0 && num2 >= 0 && num3 >= 0 && num4 >= 0) {
					//calculate total price
					total= adult*num1 + kid*num2 + salad*num3 + dessert*num4; 
	
	
					a= "Adult Set : " + num1 + "\nKid Set    : " + num2 + "\nSalad       : " + num3 + "\nDessert   : " + num4 + "\nTotal = $" + total + "\nEnjoy your meal! \n\nThank you for participating \nin our fundraising event. ^^";
	
					//display user's order
					JOptionPane.showMessageDialog(null, a,"Receipt",JOptionPane.PLAIN_MESSAGE, Menu);	
			}
			else {
				JOptionPane.showMessageDialog(null, "Seriously, why enter negative number?", "(눈_눈)",JOptionPane.ERROR_MESSAGE, error);
			}
			//Nested if...else statement end
			
	}catch(NumberFormatException e) {
		JOptionPane.showMessageDialog(null, "Please input a number.\nSpacing is not allowed.", "ERROR",JOptionPane.ERROR_MESSAGE, error);
		//informing user about error
	    }
	//try-catch block end
	}
}