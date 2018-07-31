package elseif;

import javax.swing.JOptionPane;

public class AreYouHappy {

	public static void main(String[] args) {
		// Yes - 0
		// No - 1
		// ? - 2
		
		boolean Answered = false;
		int Answer = 2;
		
		// Are you happy?
		while (Answered = false) {
			Answer = JOptionPane.showConfirmDialog(null, "Are you happy?");
			System.out.println(Answer);
			if (Answer < 2) {
				Answered = true;
			}
		}
		
		// Do you want to be happy?
		if (Answer == 0) {
			JOptionPane.showMessageDialog(null, "Just keep doing whatever you are doing.");
		} else {
			Answered = false;
			
			while (Answered = false) {
				Answer = JOptionPane.showConfirmDialog(null, "Do you want to be happy?");
				
				if (Answer < 2) {
					Answered = true;
				}
			}
		}
		
		if (Answer == 0) {
			JOptionPane.showMessageDialog(null, "Change something.");
		} else {
			JOptionPane.showMessageDialog(null, "Just keep doing whatever you are doing.");
		}
	}

}
