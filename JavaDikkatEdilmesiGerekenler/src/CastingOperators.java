
public class CastingOperators {

	public static void main(String[] args) {
		
		double number =4.7;
		int intNumber= (int)number;
		
		System.out.println("Double number degeri : " +number );
		System.out.println("Double degeri int cast edildiðindeki degeri : " + intNumber);
		System.out.println("");
		
		double number2 =6.3;
		int intNumber2= (int)number2;
		System.out.println("Double number2 degeri : " +number2 );
		System.out.println("Double degeri int cast edildiðindeki degeri : " + intNumber2);
		System.out.println("");
		
		int maxÝnt= 2_147_483_647;
		byte deger = (byte) maxÝnt ;
		System.out.println("Maksimum int degeri "  + maxÝnt);
		System.out.println("Maksimum int degeri byte cast edildiðinde deðeri " + deger);
		/*
		 * Bunun sebebi  int degerinin son 8 biti 1 dir. byte cast edildiðinde kalan deger 
		 * 0111 1111 ->> bu deger 127 dir    1000 0000 -->> bu deðer -128 dir.
		 * ikisinin toplamýnýn sonucu -1 dir . bu yüzden byte cast edildiðinde -1 deðerini alýr.  
		 */
		


	}

}
