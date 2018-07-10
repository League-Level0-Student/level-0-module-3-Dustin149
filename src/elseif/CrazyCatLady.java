//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;
import java.net.URI;

public class CrazyCatLady {
	public static void main(String[] args) {
		// 1. Ask the user how many cats they have
		int Cats = Integer.parseInt(JOptionPane.showInputDialog("How many cats do you have? (Enter in number form)"));
		// 2. Convert their answer into an int
		
		// 3. If they have 3 or more cats, tell them they are a crazy cat lady
		
		// 4. If they have less than 3 cats AND more than 0 cats, call the method below to show them a cat video

		// 5. If they have 0 cats, show them a video of A Frog Sitting on a Bench Like a Human
		if (Cats >= 3) {
			JOptionPane.showMessageDialog(null, "You are a crazy cat lover! Just kidding, please don't hurt me...");
		}else if (Cats >0) if (Cats<3) {
			playVideo("https://www.youtube.com/watch?v=5Dbvd4E-334");
		}else if (Cats == 0) {
			playVideo("https://www.youtube.com/watch?v=C0mE2v7n3a4");
		}
	}

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

