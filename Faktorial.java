#pemrograman java

import java.util.Scanner;
// Buatlah sebuah program yang menampilkan hasil sebuah factorial
// Contoh
// 2! = 2X1 = 2
// 3! = 3X2X1 = 6
// 4! = 4X3X2X1 = 24

public class latihan3{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan angka faktorial = ");
		int x = input.nextInt();

		int  factorial = x;
		int hasil_factorial = 1;
		for(int i = factorial ; i >= 1 ; i--){
		hasil_factorial = hasil_factorial * i ;
		}
		System.out.println("Hasil = " + hasil_factorial);
	}
}
