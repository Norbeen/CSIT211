//Final Programming Project

//Import statements
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;
import java.lang.String;

public class QuotesChat {
	//Main method. For now this is just going to be used as a driver to test code
	public static void main(String[] args) {
		//Variable declaration
		Sam Sam = new Sam();
		Sarah Sarah = new Sarah();
		Sophia Sophia = new Sophia();
		User[] Users = new User[3];
		Random rand = new Random();
		
		//Populating the array of users
		Users[0] = Sam;
		Users[1] = Sarah;
		Users[2] = Sophia;
		
		//Testing the chatLog method
		chatLog(Users, rand);
		
	} //End of main method


	//Definition for method to generate a chat log
	public static void chatLog(User[] Users, Random rand) {
		for (int i = 0; i <= 20; i++) {
			int u = rand.nextInt(3);
			Users[u].chat();
		} //End of for loop to randomly select users to print out a random quote
	} //End of chatLog method


	//Going to flesh out the GUI here!
	class chatWindow extends JFrame {
	
	} //End of GUI definition
} //End of QuotesChat class definition

