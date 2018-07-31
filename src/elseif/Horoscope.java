package elseif;

import javax.swing.JOptionPane;

public class Horoscope {
	public static void main(String[] args) {

		String Answer = JOptionPane.showInputDialog("What is your Zodiac sign?");
		
		if (Answer.equalsIgnoreCase("aries")) {
			JOptionPane.showMessageDialog(null, "Most Aries are known to be very competitive, though not all are.");
		} else if(Answer.equalsIgnoreCase("taurus")) {
			JOptionPane.showMessageDialog(null, "As a Taurus, you're probably very perseverent and loves luxury.");
		} else if(Answer.equalsIgnoreCase("gemini")) {
			JOptionPane.showMessageDialog(null, "Communication is a Gemini's way of life, and they live typically interesting lives.");
		} else if(Answer.equalsIgnoreCase("cancer")) {
			JOptionPane.showMessageDialog(null, "A person with the Zodiac of Cancer often has a differentiating sense of humor.");
		} else if(Answer.equalsIgnoreCase("leo")) {
			JOptionPane.showMessageDialog(null, "Leos are often very organized, and they appreciate downtime passionately.");
		} else if(Answer.equalsIgnoreCase("virgo")) {
			JOptionPane.showMessageDialog(null, "Virgos are creative thinkers with a kind heart.");
		} else if(Answer.equalsIgnoreCase("libra")) {
			JOptionPane.showMessageDialog(null, "A Libra is someone who respects fairness and balance greatly while being prone to be upset otherwise.");
		} else if(Answer.equalsIgnoreCase("scorpio")) {
			JOptionPane.showMessageDialog(null, "A Scorpio is mostly, if not always, the leader of the group as they are intelligent thinkers with a strong sense of justice.");
		} else if(Answer.equalsIgnoreCase("sagittarius")) {
			JOptionPane.showMessageDialog(null, "People of this Zodiac sign loves freedom, and they often are seen around intelligent people to suit their intelligent beings.");
		} else if(Answer.equalsIgnoreCase("capricorn")) {
			JOptionPane.showMessageDialog(null, "Capricorns are great logical thinkers and often ends up making a difference on others.");
		} else if(Answer.equalsIgnoreCase("aquarius")) {
			JOptionPane.showMessageDialog(null, "Aquarians are normally the most friendliest of the signs, while also greatly appreciating alone time.");
		} else if(Answer.equalsIgnoreCase("pisces")) {
			JOptionPane.showMessageDialog(null, "People born as a Pisces are super empathetic people and often feels deeply about things, even if it isn't shown on the surface.");
		} else {
			JOptionPane.showMessageDialog(null, "That's not a star sign!");
		}
	}
}
