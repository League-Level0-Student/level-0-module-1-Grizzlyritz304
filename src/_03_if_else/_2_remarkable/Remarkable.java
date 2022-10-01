package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
String idk = JOptionPane.showInputDialog("Tell me something remarkable about you (say it as if you are talking to yourself, example: you placed 1st in the olympics instead of I placed 1st in the olympics)");
		// 2. Ask the user to enter a name. Store their answer in a variable.
String idk2 = JOptionPane.showInputDialog("What is your name?");


		// 3. In a pop-up, tell the user what is remarkable about that person. 
String remarkable =
"Your name is "+idk2+" and something cool about you is "+idk+"";

JOptionPane.showMessageDialog(null, remarkable);
	}
}

