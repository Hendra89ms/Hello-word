# pemrograman java

import java.util.Scanner;
// Bilangan prima adalah bilangan lebih dari 1 dan hanya bisa dibagi dengan angka 1 atau bilangan itu sendiri.
// Buatlah sebuah program yang bisa menentukan sebuah angka adalah bilangan prima atau
// tidak , Contoh angka prima = 7

public class latihan2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan angka integer = ");
		int scan = input.nextInt();

		int angka = scan ;
		boolean bisaDibagiOlehAngkaLain = false;
		for(int i = 2; i < angka; i++){
			if(angka % i == 0 ){
			bisaDibagiOlehAngkaLain = true;
			break;
			}
		}
		if(!bisaDibagiOlehAngkaLain && angka > 1){
		System.out.println("Angka Prima");
		}
		else{
		System.out.println("Bukan Angka Prima");
		}		
	}
}


