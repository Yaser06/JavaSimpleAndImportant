
public class BitBasedOperations {

	public static void main(String[] args) {

		byte a = 127;
		byte c = 1;
		byte ac = (byte) (a &= c);
		System.out.println(ac);

		/*
		 * a = 0111 1111 c =0000 0001 ikisini and ledigimizdeki deger bu olur bu da 0000
		 * 0001 -->> 1 dir. Ve degeri ikisininde 1 oldu�u durumda sadece 1 verir.Di�er
		 * durumlar 0 d�r.
		 */

		int sayi1 = 16;
		int sayi2 = 8;
		System.out.println(sayi1 |= sayi2);

		//

		/*
		 * sayi1 = 0001 0000 , sayi2 =0000 1000 -->> or oldu�u i�in 0001 1000 ; ��kt�
		 * b�yle olur Or birinin 1 de�eri almas� durumunda direk 1 de�erini
		 * verir.�kisinin 0 almas� durumunda 0 verir.
		 */

		int sayi3 = 16;
		int sayi4 = 16;
		System.out.println(sayi3 ^= sayi4);
		int sayi5 = 16;
		int sayi6 = 8;
		System.out.println(sayi5 ^= sayi6);

		/*
		 * sayi3= 0001 0000 sayi4 = 0001 0000 sonuc s�f�r. C�nk� xor kap�s� sadece
		 * farkl� oldugu durumlarda 1 verir.Ayn� oldugu durumlarda 0 sayi5= 0001 0000
		 * sayi6= 0000 1000 bu durumda sonuc -->> 0001 1000 ->>24 dur.
		 */

		System.out.println(~2); // bit not operator
		/*
		 * 0000 0010 not operatorunu uygulad�g�m�zda -1 oluyor sonra -1 -2 = -3 oluyor.
		 */

		byte f = 33;
		// 0010  0001  ->> 001 0000 1000 ->>> 264  (3 bit sola kayd�r�yoruz ve kayd�rd�g�m�z kadar s�f�r ekliyoruz.) 
		System.out.println(f << 3);
		
		
	
     	byte r = -128;
		// 1 0 0 0 0 0 0 0
		// 1 1 0 0 0 0 0 0 >> 1
     	// 1 1 1 0 0 0 0 0 >>2
		System.out.println(r >> 2); // sa�a do�ru kayd�rmalarda i�aret �nemli
		// isaret eksi ise 1 ekliyoruz. isaret + ise 0 ekliyoruz.
	
	}

}
