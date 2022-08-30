package bukodyazilmadanogrenilmez;

import java.util.Scanner;

public class taksimetreyap {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int baslangic = 10;
		System.out.println("kac km gideceksiniz: ");
		int km = scan.nextInt();
		
		double tutar = (km * (2.20)) + baslangic;
		
		if (tutar<20) {
			System.out.println("ucretiniz: 20 tl" );
			}else {
				System.out.println("ucretiniz: " + tutar);
			}
		

	}

}
