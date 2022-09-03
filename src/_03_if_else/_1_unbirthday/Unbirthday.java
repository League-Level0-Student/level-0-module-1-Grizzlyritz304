package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class Unbirthday {
public static void main(String[] args) {
	String birthday_question = JOptionPane.showInputDialog("What is your birthday?(mm/dd)");
	if(birthday_question.equals("09/03")) {
		JOptionPane.showMessageDialog(null, "Happy Birthday!");
	}
	else {
		JOptionPane.showMessageDialog(null, "Happy UNbirthday!");
	}
}
}
