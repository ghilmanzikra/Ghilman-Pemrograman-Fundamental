import java.util.Scanner;

public class NilaiIndex {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukkan Nilai Huruf :");
		String nilaiHuruf = input.nextLine();
		
		double nilaiIndex;
		if(nilaiHuruf.equals("A")){
			nilaiIndex = 4.0;
		}else if(nilaiHuruf.equals("B")){
			nilaiIndex = 3.0;
		}else if(nilaiHuruf.equals("C")){
			nilaiIndex = 2.0;
		}else if(nilaiHuruf.equals("D")){
			nilaiIndex = 1.0;
		}else if(nilaiHuruf.equals("E")){
			nilaiIndex = 0.0;
		}else{
			System.out.println("Konversi nilai tidak valid.");
			return;
		}
			System.out.println("Nilai Index = " + nilaiIndex);
	}
}