
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
		// yukarýdaki total iþleminde byte + byte toplayýp baþka bir byte bu þekilde atama yapamayýz.
		
		byte total2 =1+1; // bu þekilde toplama iþlemi yapýlabilir.
			
		System.out.println("Total 2 :" +total2);
		
		
		//byte number3=127+1; bu þekilde toplama iþlemi yaptýðýmýzda hata verir.
		//Hata vermesinin sebebi  pozitif kýsmý maksimum 127 kadar alýr.Negatif kýsmý -128 dir.
		
		//#############################   ÝNT KISMI      ########################################///
		
		
		
		int maxÝnt =2_147_483_647; // maksimum alabileceði deðer budur.
		System.out.println("Maksimum int degeri : "+ maxÝnt);
		int num =2_147_483_647 +1;
		
		/*
		 * Þimdi merak edilen durum þu maksimum alabileceði deðer budur. Peki +1 deðeri eklediðimizde ne olur.
		 * (-) alabileceði deðere geçer bunu bitlerle anlatmak gerekirse 
		 * 01111111 ->> bunun deðeri 127 +1 eklediðimiz ->>  1000000 --> bunun deðeri -128 dir.
		 * yukarýda yaptýðýmýzda böyledir.
		 */
		
		System.out.println("Ýnt Overflow degeri : "+ num); // int overflow deðeri gerçekleþir.
		
		//#############################   LONG KISMI      ########################################///
		
		long maxLongDegeri= (long)Math.pow(2, 63)-1;
		System.out.println("Maximum Long degeri :" + maxLongDegeri);
		long deger = 1L;
		//int deger2 =1L;   lONG OLDUGUNU 'L' Büyük L harfi ile belirtilir.
		
		
		
		//#############################   FLOAT KISMI      ########################################///
		
		float sayi = 1.1F;
		// float oldugu 'F' Büyük F harfi ile gösterilir.
		
		
	}

}
