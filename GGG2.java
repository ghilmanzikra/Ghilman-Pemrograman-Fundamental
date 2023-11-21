import java.util.Scanner;

public class BelanjaGhilman {
	
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		
		int harga[] = {2500, 3000, 4000, 5000, 6000};
		int item [] = new int[harga.length];
			System.out.println(" Input jumlah barang belanja : ");
			
		for(int a=0; a<harga.length ; a++){
			System.out.print("Jumlah belanja barang- " + a + " Rp " + harga[a] + " : " );
			item[a] = sc.nextInt();
		}
		System.out.println(" ");
		System.out.println("Daftar belanja dan harga ");
		int total = 0;
		for (int a = 0 ; a < harga.length ; a++){
			total = harga[a] * item[a];
			System.out.println("harga barang ke- " + a + " , " + harga[a] + " , " + item[a] + " item " +" : " + total);
		}
		int total1 = 0;
		for (int a = 0; a < harga.length ; a++){
			total1 = total1 + item[a];
		}	
		int belanja = 0;
		for ( int a =0; a < harga.length ; a++ ){
			belanja = belanja + harga[a]*item[a];
		}
		System.out.println(" ");
		System.out.println("TOTAL ITEM BELANJA: " + total1);
		System.out.println("TOTAL BIAYA BELANJA: " + belanja);
	}
}

		
		