import javax.swing.JOptionPane; //dialog box
import javax.swing.ImageIcon; //icon for dialog box
	
public class A1_Task2Dialog {
		public static void main(String[] args) {
			
			//setting part start
			String name, name2, name3;
			double time, time2, time3;
			
			ImageIcon trophy= new ImageIcon("src/trophy.png"), error = new ImageIcon("src/error2.png");
			ImageIcon swimmer= new ImageIcon("src/swimmer.png"), watch= new ImageIcon("src/stopwatch.png");
			ImageIcon lie = new ImageIcon("src/lie.jpg"), ugh = new ImageIcon("src/123.png");
			
			//setting part end
			
			//try-catch block start
			try {
			//Enter input			
			name = (String)JOptionPane.showInputDialog(null, "Enter first runner name.", "Record",JOptionPane.INFORMATION_MESSAGE, swimmer, null, " ");
			time = Double.parseDouble((String)JOptionPane.showInputDialog(null, "Enter time taken by runner to finish the race in minutes.", "Record",JOptionPane.INFORMATION_MESSAGE, watch, null, " "));
			
			name2 = (String)JOptionPane.showInputDialog(null, "Enter second runner name.", "Record",JOptionPane.INFORMATION_MESSAGE, swimmer, null, " ");
			time2 = Double.parseDouble((String)JOptionPane.showInputDialog(null, "Enter time taken by runner to finish the race in minutes.", "Record",JOptionPane.INFORMATION_MESSAGE, watch, null, " "));
			
			name3 = (String)JOptionPane.showInputDialog(null, "Enter third runner name.", "Record",JOptionPane.INFORMATION_MESSAGE, swimmer, null, " ");
			time3 = Double.parseDouble((String)JOptionPane.showInputDialog(null, "Enter time taken by runner to finish the race in minutes.", "Record",JOptionPane.INFORMATION_MESSAGE, watch, null, " "));

			//nested if...else statement start
			//Determine the order of the runners
			if (time == 0 || time2 == 0 || time3 == 0) 
			{
				JOptionPane.showMessageDialog(null, "Don't fake the result.", "Zero Time Taken Error", JOptionPane.INFORMATION_MESSAGE, lie);
			}
			else if (time < 0 || time2 < 0 || time3 < 0) 
			{
				JOptionPane.showMessageDialog(null, "Time taken cannot be negative,thank you.", "Negative Time Taken Error", JOptionPane.PLAIN_MESSAGE, ugh);
			}
			else if (time < time2 && time < time3) 
			{
				if (time2 > time3)
					JOptionPane.showMessageDialog(null, "LEADERBOARD" + "\n1ˢᵗ    " + name + "\n2ⁿᵈ   " + name3 + "\n3ʳᵈ    " + name2, "RESULT", JOptionPane.INFORMATION_MESSAGE, trophy );
				else
					JOptionPane.showMessageDialog(null, "LEADERBOARD" + "\n1ˢᵗ    " + name + "\n2ⁿᵈ   " + name2 + "\n3ʳᵈ    " + name3, "RESULT", JOptionPane.INFORMATION_MESSAGE, trophy);
			}
			else if (time > time2 && time < time3)
				JOptionPane.showMessageDialog(null, "LEADERBOARD" + "\n1ˢᵗ   " + name2 + "\n2ⁿᵈ   " + name + "\n3ʳᵈ    " + name3, "RESULT", JOptionPane.INFORMATION_MESSAGE, trophy);
			
			else if (time < time2 && time > time3)
				JOptionPane.showMessageDialog(null, "LEADERBOARD" + "\n1ˢᵗ   " + name3 + "\n2ⁿᵈ   " + name + "\n3ʳᵈ    " + name2, "RESULT", JOptionPane.INFORMATION_MESSAGE, trophy);
			else
			{
				if(time2 < time3)
					JOptionPane.showMessageDialog(null, "LEADERBOARD" + "\n1ˢᵗ   " + name2 + "\n2ⁿᵈ   " +name3 + "\n3ʳᵈ    " +name, "RESULT", JOptionPane.INFORMATION_MESSAGE, trophy);
				else
					JOptionPane.showMessageDialog(null, "LEADERBOARD" + "\n1ˢᵗ   " + name3 + "\n2ⁿᵈ   " +name2 + "\n3ʳᵈ    " +name, "RESULT", JOptionPane.INFORMATION_MESSAGE, trophy);
			        
			}
			//nested if...else statement end
			
		}catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Please input a number.\nSpacing is not allowed.", "(ㆆ_ㆆ)",JOptionPane.ERROR_MESSAGE, error);
			//informing user about error
				}
			//try-catch block end
		}
}
