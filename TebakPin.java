import java.util.Scanner;

public class TebakPin{
	public static void main(String[]args){
		int pinAsli = 1234;
		int maksPerulangan = 3;
		int jumlahPerulangan = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while (jumlahPerulangan < maksPerulangan){
			System.out.println("Masukkan 4 digit angka PIN: ");
			
			int pinTebakan = scanner.nextInt();
			
			if (pinTebakan == pinAsli){
				System.out.println("PIN yang anda masukkan benar!");
				break;
			}else{
				System.out.println("PIN yang anda masukkan salah!");
				jumlahPerulangan++;
			}
		}
		if (jumlahPerulangan == maksPerulangan){
			System.out.println("Akun anda telah diblokir");
		}
		
		scanner.close();
	}
}

