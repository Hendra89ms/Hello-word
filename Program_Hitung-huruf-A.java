#Pemrograman java 
import java.util.Scanner;

public class Hitung_huruf_A {
	public static void main(String[] args) {
		
		// Buatlah sebuah program yang bisa mengecek berapa banyak jumlah huruf "a"dalam sebuah kata/kalimat.
		// contoh : 
		// String kalimat = "saya senang sekali";
		// Hasil 
		// jumlah huruf a = 4;
    
		Scanner input = new Scanner(System.in);

		int jumlahHurufA = 0;
		System.out.print("Masukkan kalimat yang anda ingin tulis = ");
		String kalimat = input.nextLine();

		for (int i = kalimat.length() - 1; i >= 0; i--) {
			if (kalimat.charAt(i) == 'a'){
				jumlahHurufA++;
			}
		}
		System.out.print("Jumlah huruf a : " + jumlahHurufA);

	}
}
