//Apparently you need to use import statements for classes...
import java.util.Random;

//Super class for users. The users are going to be defined 4 different times (and maybe one for an
// admin/professor type user) Each with varying
public class User {
	//We're going to add some method(s) to keep track of bannable offenses and a user's ban status here
	
	//Each user needs to have a random number generator to select a random string to print
	Random rand = new Random();
	
	//Chat method to be overwritten
	public void chat() {
		
	}
}
