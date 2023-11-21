import java.util.Scanner;

public class KodeNegara {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Masukkan Kode Negara: ");
		String kodeNegara = sc.nextLine();
		
		String namaNegara;
		
		if(kodeNegara.equals("ES")){
			namaNegara = "Spain";
		}else if(kodeNegara.equals("TN")){
			namaNegara = "Tunisia";
		}else if(kodeNegara.equals("ID")){
			namaNegara = "Indonesia";
		}else if(kodeNegara.equals("MM")){
			namaNegara = "Myanmar";
		}else if(kodeNegara.equals("IN")){
			namaNegara = "India";
		}else {
			System.out.println("Maaf Kode Negara Yang Anda Masukkan Tidak Diketahui");
			return;
		}
		System.out.println("Nama Negara: " + namaNegara);
	}
}