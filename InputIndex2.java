import java.util.Scanner;

public class InputIndex2{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Masukkan Nilai Huruf : ");
		String nilaiHuruf = input.nextLine();
		
		Sring nilaiIndex;
		switch (nilaiHuruf){
			case "A":
				nilaiIndex = 4.0;
				break;
			case "B":
				nilaiIndex = 3.0;
				break;
			case "C":
				nilaiIndex = 2.0;
				break;
			case "D":
				nilaiIndex = 1.0;
				break;
			case "E":
				nilaiIndex = 0.0;
				break;
			default:
				System.out.println("Maaf Index Yang Anda Masukkan Tidak Valid");
				return;
			}
			System.out.println("Nilai Index: " + nilaiIndex);
	}
}