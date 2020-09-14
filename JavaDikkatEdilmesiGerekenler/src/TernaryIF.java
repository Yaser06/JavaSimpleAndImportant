
public class TernaryIF {
	
	/*
	 * Tek satýrda if cümlesi yazmak için kullanilir.
	 */

	public static void main(String[] args) {
		
		int i = 25 ;
		
		int result = i < 35 ? i*10 : i*5 ; 
		//  sorgu islemi dogru ise ilk islem yapilir. Yanlis ise ikinci islem yapilacaktir.
		System.out.println("Ýlk sorgunun cevabý  : " + result );
		
		int a=45 ;
		
		int result2 =a < 35 ? a*10 : a*5 ;
		// ayný islemi yanlis sorguyla yaptýgýmýzda ikinci islemi yaptigi görülecektir.
		System.out.println("Ikinci isleminin cevabý: " +result2);
	}

}
