
public class PrimitiveTypler {
	/*
	 * boolean = 1 bit;
	 * char= 16 bit ;
	 * short =16 bit 
	 * int= 32 bit;
	 * float= 32 bit;
	 * long =64 bit;
	 * double = 64 bit ;

	 */

	public static void main(String[] args) {
		//#############################   BYTE KISMI      ########################################///
		byte maxByte=127;
		System.out.println("Maksimum byte degeri : "+ maxByte);
		byte number = 1;
		byte number2 = 2;
		
		//byte total=number+number2;
		// yukar�daki total i�leminde byte + byte toplay�p ba�ka bir byte bu �ekilde atama yapamay�z.
		
		byte total2 =1+1; // bu �ekilde toplama i�lemi yap�labilir.
			
		System.out.println("Total 2 :" +total2);
		
		
		//byte number3=127+1; bu �ekilde toplama i�lemi yapt���m�zda hata verir.
		//Hata vermesinin sebebi  pozitif k�sm� maksimum 127 kadar al�r.Negatif k�sm� -128 dir.
		
		//#############################   �NT KISMI      ########################################///
		
		
		
		int max�nt =2_147_483_647; // maksimum alabilece�i de�er budur.
		System.out.println("Maksimum int degeri : "+ max�nt);
		int num =2_147_483_647 +1;
		
		/*
		 * �imdi merak edilen durum �u maksimum alabilece�i de�er budur. Peki +1 de�eri ekledi�imizde ne olur.
		 * (-) alabilece�i de�ere ge�er bunu bitlerle anlatmak gerekirse 
		 * 01111111 ->> bunun de�eri 127 +1 ekledi�imiz ->>  1000000 --> bunun de�eri -128 dir.
		 * yukar�da yapt���m�zda b�yledir.
		 */
		
		System.out.println("�nt Overflow degeri : "+ num); // int overflow de�eri ger�ekle�ir.
		
		//#############################   LONG KISMI      ########################################///
		
		long maxLongDegeri= (long)Math.pow(2, 63)-1;
		System.out.println("Maximum Long degeri :" + maxLongDegeri);
		long deger = 1L;
		//int deger2 =1L;   lONG OLDUGUNU 'L' B�y�k L harfi ile belirtilir.
		
		
		
		//#############################   FLOAT KISMI      ########################################///
		
		float sayi = 1.1F;
		// float oldugu 'F' B�y�k F harfi ile g�sterilir.
		
		
	}

}
