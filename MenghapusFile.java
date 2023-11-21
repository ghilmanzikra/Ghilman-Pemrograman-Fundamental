import java.io.File;
import static java.lang.System.out;
import java.util.Scanner;

public class MenghapusFile {
	
	public static void main (String args[]) {
		File evidence = new File ("Menghitung judul.txt");
		
		if (evidence.exists()) {
			Scanner keyboard = new Scanner(System.in);
			char reply;
			
			do {
				out.print("Hapus File ini? (y/n) ");
				reply =
					keyboard.findWithinHorizon(".", 0).charAt (0);
					
			} while (reply != 'y' && reply != 'n');
			if (reply == 'y') {
				out.println("Okay, here goes...");
				evidence.delete();
				out.println("The file has been delete.");
			} else {
				out.println("Sorry, Buddy. Just asking.");
			}
			
			keyboard.close();
		}
	}
}	
