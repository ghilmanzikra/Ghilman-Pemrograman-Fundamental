import static java.lang.System.out;
import java.util.Scanner;
import java.util.Random;

public class TebakAngka {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
 
		int numGuesses = 0;
		
		int randomNumber = new Random().nextInt(10) + 1;
		out.println(" **** ");
		out.println("Selamat Datang di Game Tebak Angka");
		out.println(" **** ");
		out.println();
 
		out.print("Enter an int from 1 to 10: ");
		int inputNumber = keyboard.nextInt();
		numGuesses++;
 
		while (inputNumber != randomNumber) {
			out.println();
			out.println("Coba lagi...");
			out.print("Masukkan sebuah angka dari 1 sampai 10: ");
			inputNumber = keyboard.nextInt();
			numGuesses++;
		}
		
		out.print("Kamu menang setelah ");
		out.println(numGuesses + " guesses.");
		keyboard.close();
	}
}