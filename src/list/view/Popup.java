package list.view;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 * Object oriented version of a Popup window to transition away from console IO.
 * @author cody.henrichsen
 * @version November 29, 2022
 */
public class Popup
{
	/**
	 * Displays the supplied message parameter inside a popup. 
	 * </p>
	 * The {@code null} parameter to the {@code JOptionPane} method can be replaced with a 
	 * {@code JFrame} reference to make a more pleasing visual centered on the app in question. 
	 * @param message The {@code String} to be displayed in the popup.
	 */
	public void displayMessage(String message)
	{
		JOptionPane.showMessageDialog(null, message);
	}
	
	public void displayMessage(String title, String imageName)
	{
		JLabel imageLabel = new JLabel("");
		ImageIcon image = new ImageIcon(getClass().getResource("/list/view/images/" + imageName));
		imageLabel.setIcon(image);
		
		JOptionPane.showMessageDialog(null, imageLabel, title, JOptionPane.INFORMATION_MESSAGE);
	}
	
	/**
	 * Displays the supplied question parameter in a popup window. The user supplied response is returned.
	 * If the user presses the cancel or window close button the resulting {@code null} value is replaced with an empty {@code String}.
	 * </p>
	 * The {@code null} parameter to the {@code JOptionPane} method can be replaced with a 
	 * {@code JFrame} reference to make a more pleasing visual centered on the app in question.
	 * @param question The question to be asked in the popup.
	 * @return The users response to the question.
	 */
	public String askQuestion(String question)
	{
		String response = "";
		
		response = JOptionPane.showInputDialog(null, question);
		
		if (response == null)
		{
			response = "";
		}
		
		return response;
	}
}
