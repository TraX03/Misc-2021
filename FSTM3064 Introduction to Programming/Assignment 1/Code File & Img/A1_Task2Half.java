import java.util.Scanner; //keyboard
import javax.swing.JOptionPane; //dialog box
import javax.swing.ImageIcon; //icon for dialog box

public class A1_Task2Half {
	public static void main(String[] args) {

		String name, name2, name3;
		double time, time2, time3;
		
		ImageIcon trophy= new ImageIcon("src/trophy.png");
		
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
		
		
		//Determine the order of the runners
		if (time < time2 && time < time3) 
		{
			if (time2 > time3)
				JOptionPane.showMessageDialog(null, "LEADERBOARD" + "\n" +name + "\n" +name3 + "\n" +name2, "RESULT", JOptionPane.INFORMATION_MESSAGE, trophy );
			else if (time2 < time3)
				JOptionPane.showMessageDialog(null, "LEADERBOARD" + "\n" +name + "\n" +name2 + "\n" +name3, "RESULT", JOptionPane.INFORMATION_MESSAGE, trophy);
		}
		else if (time > time2 && time < time3)
			JOptionPane.showMessageDialog(null, "LEADERBOARD" + "\n" +name2 + "\n" +name + "\n" +name3, "RESULT", JOptionPane.INFORMATION_MESSAGE, trophy);
		else if (time < time2 && time > time3)
			JOptionPane.showMessageDialog(null, "LEADERBOARD" + "\n" +name3 + "\n" +name + "\n" +name2, "RESULT", JOptionPane.INFORMATION_MESSAGE, trophy);
		else
		{
			if(time2 < time3)
				JOptionPane.showMessageDialog(null, "LEADERBOARD" + "\n" +name2 + "\n" +name3 + "\n" +name, "RESULT", JOptionPane.INFORMATION_MESSAGE, trophy);
			else if (time2 >time3)
				JOptionPane.showMessageDialog(null, "LEADERBOARD" + "\n" +name3 + "\n" +name2 + "\n" +name, "RESULT", JOptionPane.INFORMATION_MESSAGE, trophy);
		        
		}
			
		keyboard.close();
	}
}