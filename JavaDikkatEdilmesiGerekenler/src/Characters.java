
public class Characters {

	public static void main(String[] args) {

		char a ='A';
		char a1 = '\u0041';
		char a2 =65;
		System.out.println(a);
		System.out.println(a1);
		System.out.println(a2);
		// Asc� tablosundaki de�erlerinden dolay� hepsi A harfini g�stermektedir.
		
		System.out.println(022);
		// Bir sayinin basina 0 koyarsak 8 lik tabana cekmis oluruz ve Ascii deki OCT sonucu g�sterir.Yani sonuc 18 �ikacaktir..
		
		
		System.out.println((char) (a+1));
		//Buradan da anlasilacagi gibi bilgisayar harfleri sayi olarak tutmaktad�r.Ve bize sayi karsiligini g�stermektedir.
	
		
		System.out.println("Someting \t \n \"special\"");
		// Bir yaz�n�n i�inde �ift t�rnak yapmak istedi�imizde \".... \"  bu �ekilde kullanmam�z gerekir.
		
		
		
		char ch = (char)65.25;
		System.out.println(ch); // A yazd�racak Asc�de 65 degerinden dolay� casting islemi yapildiginde 65 degerini alir.
		
		System.out.println(ch++);// A yazdiracak c�nk� post-inc islemi yapiyoruz yani �nce yazdir sonra islem yap.
		System.out.println(++ch); // C yazdiracak c�nk� islemi yapip sonra yazdiracak.
		
		
		byte b = (byte)'\uFFFF';
		System.out.println(b);
		
	}

}
