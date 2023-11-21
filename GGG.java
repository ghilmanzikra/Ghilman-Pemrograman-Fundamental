import java.util.Scanner;

public class GanjilGenapGhilman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahAngka;
        System.out.print("Jumlah Data: ");
        jumlahAngka = sc.nextInt();
		
        System.out.println("Input Angka Adalah sebagai berikut");
		int[] angka = new int[6];
        int jumlah, rerata;

        for (int i = 0; i < jumlahAngka; i++) {
            System.out.print("Data ke-" + i + " : ");
            angka[i] = sc.nextInt();
        }
		System.out.println(" ");
        System.out.println("Keterangan Setiap Angka");
        for (int j = 0; j < jumlahAngka; j++) {
            if (angka[j] % 2 == 0) {
                System.out.println(" " + angka[j] + "->> GENAP");
            } else {
                System.out.println(" " + angka[j] + "->> GANJIL");
            }
        }

        jumlah = 0;
        for (int k = 0; k < jumlahAngka; k++) {
            jumlah = jumlah + angka[k];
        }
        rerata = jumlah / jumlahAngka;
        System.out.println("TOTAL PENJUMLAHAN: " + jumlah);
        System.out.println("RATA-RATA: " + rerata);
    }
}