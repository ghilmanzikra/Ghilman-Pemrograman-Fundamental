import java.util.Scanner;

public class KodeNegara2 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Masukkan Kode Negara: ");
		String kodeNegara = sc.nextLine();
		
		String namaNegara;
		
		switch(kodeNegara){
			case "ES":
				namaNegara = "Spain";
				break;
			case "TN":
				namaNegara = "Tunisia";
				break;
			case "ID":
				namaNegara = "Indonesia";
				break;
			case "MM":
				namaNegara = "Myanmar";
				break;
			case "IN":
				namaNegara = "India";
				break;
			default:
				System.out.println("Maaf, kode negara yang anda masukkan tidak diketahui");
				return;
			}
			System.out.println("Nama Negara: " + namaNegara);
	}
}