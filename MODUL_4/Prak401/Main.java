package Prak401;
import java.util.Scanner;
public class Main {
	public static void main(String[]args) {
		Scanner scanner = new Scanner (System.in);	
		System.out.println("Nama Hewan Peliharaan: ");
		String nama = scanner.nextLine();
		System.out.println("Ras: ");
		String ras = scanner.nextLine();
		

		HewanPeliharaan h1 = new HewanPeliharaan(nama,ras);
		h1.display();
		scanner.close();
		}

	}
