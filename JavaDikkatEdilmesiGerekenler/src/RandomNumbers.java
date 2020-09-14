import java.util.Scanner;

public class RandomNumbers {

	public static void main(String[] args) {
		// RANDOM SAYIYI KULLANARAK ARALIK BİR DEGER OLUŞTURALİM
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Lütfen aralik icin iki sayi giriniz ");
		int sayi1 =scanner.nextInt();
		int sayi2 =scanner.nextInt();
		
		int sonuc;
		
		if(sayi1>sayi2) {
			
			sonuc =((int)((sayi1-sayi2)*Math.random()))+sayi2;
			System.out.println(" Aralik degeri -->> " + sayi1 + " > "+ sonuc+ "> "+ sayi2);
			
		}else {
			
			sonuc =((int)((sayi2-sayi1)*Math.random()))+sayi1;
			System.out.println(" Aralik degeri -->> " + sayi2 + " > "+ sonuc+ "> "+ sayi1);
			
		}
		
		
		
	}

}
