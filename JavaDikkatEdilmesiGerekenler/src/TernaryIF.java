
public class TernaryIF {
	
	/*
	 * Tek sat�rda if c�mlesi yazmak i�in kullanilir.
	 */

	public static void main(String[] args) {
		
		int i = 25 ;
		
		int result = i < 35 ? i*10 : i*5 ; 
		//  sorgu islemi dogru ise ilk islem yapilir. Yanlis ise ikinci islem yapilacaktir.
		System.out.println("�lk sorgunun cevab�  : " + result );
		
		int a=45 ;
		
		int result2 =a < 35 ? a*10 : a*5 ;
		// ayn� islemi yanlis sorguyla yapt�g�m�zda ikinci islemi yaptigi g�r�lecektir.
		System.out.println("Ikinci isleminin cevab�: " +result2);
	}

}
