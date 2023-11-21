import java.io.File;
import static java.lang.System.out;
import java.util.Scanner;

public class DeleteEvidence {
	
	public static void main (String args[]) {
		File evidence = new File ("cookedBooks.txt");
		if (evidence.exists()) {
			Scanner keyboard = new Scanner(System.in);
			char reply;
			
			do {
				out.print("Delete evidence? (y/n) ");
				reply =
					keyboard.findWithinHorizon(".", 0).charAt (0);
			} while (reply != 'n');
			if (reply == 'y') {
				out.println("Okay, here goes...");
				evidence.delete();
				out.println("The evidence has been delete.");
			} else {
				out.println("Sorry,buddy.just asking.");
			}
			
			keyboard.close();
		}
	}
}	
