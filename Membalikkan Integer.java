# Java_program

import java.util.Scanner;
// Buatlah program yang bisa membalikkan 
// sebuah integer, contoh: 12345 menjadi 54321

public class membalikkan_int {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan angka integer = ");
		int scan = input.nextInt();

		int angka = scan;
		int angka_dibalikkan = 0;
		int temp = angka;
		int sisa = 0;

		while(temp>0){
			sisa = temp % 10;
			angka_dibalikkan = angka_dibalikkan * 10 + sisa;
			temp /= 10;
			}
			System.out.println("Balik angka dari " + angka + " adalah " + angka_dibalikkan);
		}
	}
