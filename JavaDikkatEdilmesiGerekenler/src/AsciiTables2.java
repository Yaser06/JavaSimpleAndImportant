import java.util.Scanner;

public class AsciiTables2 {

	public static void main(String[] args) {
		System.out.println("GÝRÝLEN HARFÝ ASCI KODUNA CEVÝRME");
		Scanner scanner =new Scanner(System.in);
		System.out.println("Lütfen bir harf giriniz");
		String girdi =scanner.next();
		
		char ch =girdi.charAt(0);
		
		int deger =(int)ch;
		
		System.out.println("Girilen harf :  '"+ch +"' Ascii sayi degeri :  "+ deger);
	}

}
