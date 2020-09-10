
public class CastingOperators {

	public static void main(String[] args) {
		
		double number =4.7;
		int intNumber= (int)number;
		
		System.out.println("Double number degeri : " +number );
		System.out.println("Double degeri int cast edildi�indeki degeri : " + intNumber);
		System.out.println("");
		
		double number2 =6.3;
		int intNumber2= (int)number2;
		System.out.println("Double number2 degeri : " +number2 );
		System.out.println("Double degeri int cast edildi�indeki degeri : " + intNumber2);
		System.out.println("");
		
		int max�nt= 2_147_483_647;
		byte deger = (byte) max�nt ;
		System.out.println("Maksimum int degeri "  + max�nt);
		System.out.println("Maksimum int degeri byte cast edildi�inde de�eri " + deger);
		/*
		 * Bunun sebebi  int degerinin son 8 biti 1 dir. byte cast edildi�inde kalan deger 
		 * 0111 1111 ->> bu deger 127 dir    1000 0000 -->> bu de�er -128 dir.
		 * ikisinin toplam�n�n sonucu -1 dir . bu y�zden byte cast edildi�inde -1 de�erini al�r.  
		 */
		


	}

}
