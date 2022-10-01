package _03_if_else._3_secret_message_box;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


import javax.swing.JOptionPane;

/**
 * Secret Message Box / Secure Messaging System
 * 
 * You want to leave a message on one of the Mac computers so that only your friend can read it.
 * You set up the passcode and the secret message. 
 * Your friend types in the passcode to retrieve the message.
 * 
 */

public class SecretMessageBox {

	// 0. Make a main method and put steps 1-5 inside it
public static void main(String[] args) {
	// 1. Set a password in a String variable
String password = 
"What";
	// 2. Using a pop-up, ask the first person for a secret message and store it in a variable
String question_1 = JOptionPane.showInputDialog("Enter your secret message here.");
	// 3. Now use a pop-up to tell the NEXT user that they can only see the secret message 
	//    if they can guess the password
String question_2 = JOptionPane.showInputDialog("You can only see the secret message if you enter the correct password. What is the password?");
	// 4. If their guess matches the password, show them the secret message
if(question_2.equals(""+password+"")) {
     String Secret_Message =
    		 ""+question_1+"";
     JOptionPane.showMessageDialog(null, Secret_Message);
}
	// 5. If the password does not match, pop-up "INTRUDER!!"
else {
	JOptionPane.showMessageDialog(null, ""+question_2+" IS NOT THE ANSWER!");
	JOptionPane.showMessageDialog(null, "GET AWAY INTRUDER!! COMPUTER SELF-DESTUCT IN 3...");
	JOptionPane.showMessageDialog(null, "2...");
	JOptionPane.showMessageDialog(null, "1...");
	JOptionPane.showMessageDialog(null, "If you are still there then the self-destruct did not work. For now....");
	JOptionPane.showMessageDialog(null, "You can leave now.");
	JOptionPane.showMessageDialog(null, "Like actually just leave");
	JOptionPane.showMessageDialog(null, "WHY ARE YOU STILL HERE, I SAID LEAVE!!!!!!");
	JOptionPane.showMessageDialog(null, "BRUH. I TOLD YOU TO LEAVE. IF YOU DO NOT LEAVE RIGHT NOW I WILL DESTROY THIS COMPUTER!!!!");
	JOptionPane.showMessageDialog(null, "SELF DESTRUCT IN 3 SECONDS, AND I MEAN IT THIS TIME!");
	JOptionPane.showMessageDialog(null, "3!!!");
	JOptionPane.showMessageDialog(null, "2!!!");
	JOptionPane.showMessageDialog(null, "1!!!");
	JOptionPane.showMessageDialog(null, "WHY IS YOUR COMPUTER NOT GONE?!?!?! FINE. YOU WIN. JUST SEE THE SECRET MESSAGE. I DO NOT CARE ANYMORE.");
	JOptionPane.showMessageDialog(null, ""+question_1+"");
	JOptionPane.showMessageDialog(null, "You got the message. You can leave now. AND ACTUALLY LEAVE THIS TIME!!!!");
}
}
}