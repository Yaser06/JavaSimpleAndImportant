import java.util.Scanner;

public class AsciiTables2 {

	public static void main(String[] args) {
		System.out.println("G�R�LEN HARF� ASCI KODUNA CEV�RME");
		Scanner scanner =new Scanner(System.in);
		System.out.println("L�tfen bir harf giriniz");
		String girdi =scanner.next();
		
		char ch =girdi.charAt(0);
		
		int deger =(int)ch;
		
		System.out.println("Girilen harf :  '"+ch +"' Ascii sayi degeri :  "+ deger);
	}

}
