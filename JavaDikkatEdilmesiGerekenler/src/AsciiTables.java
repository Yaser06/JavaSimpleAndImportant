import java.util.Scanner;

public class AsciiTables {

	public static void main(String[] args) {
		System.out.println("Girilen Sayi deðerini asci degerine cevirme");
		Scanner scanner =new Scanner(System.in);
		System.out.println("Klavyeden bir sayi degeri giriniz : ");
		int a =scanner.nextInt();
		char b= (char)(a);
		System.out.println("Ascii degeri : " + b);
	}

}
