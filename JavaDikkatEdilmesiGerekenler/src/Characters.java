
public class Characters {

	public static void main(String[] args) {

		char a ='A';
		char a1 = '\u0041';
		char a2 =65;
		System.out.println(a);
		System.out.println(a1);
		System.out.println(a2);
		// Ascý tablosundaki deðerlerinden dolayý hepsi A harfini göstermektedir.
		
		System.out.println(022);
		// Bir sayinin basina 0 koyarsak 8 lik tabana cekmis oluruz ve Ascii deki OCT sonucu gösterir.Yani sonuc 18 çikacaktir..
		
		
		System.out.println((char) (a+1));
		//Buradan da anlasilacagi gibi bilgisayar harfleri sayi olarak tutmaktadýr.Ve bize sayi karsiligini göstermektedir.
	
		
		System.out.println("Someting \t \n \"special\"");
		// Bir yazýnýn içinde çift týrnak yapmak istediðimizde \".... \"  bu þekilde kullanmamýz gerekir.
		
		
		
		char ch = (char)65.25;
		System.out.println(ch); // A yazdýracak Ascýde 65 degerinden dolayý casting islemi yapildiginde 65 degerini alir.
		
		System.out.println(ch++);// A yazdiracak cünkü post-inc islemi yapiyoruz yani önce yazdir sonra islem yap.
		System.out.println(++ch); // C yazdiracak cünkü islemi yapip sonra yazdiracak.
		
		
		byte b = (byte)'\uFFFF';
		System.out.println(b);
		
	}

}
