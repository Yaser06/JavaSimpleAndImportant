
public class MathOperat�rler {

	public static void main(String[] args) {
		int a = 5 ;
		int b = 3 ;
		System.out.println("A degeri " + a);
		System.out.println("B degeri "+ b);

		
		int sum = a + b ;
		System.out.println("A + B SONUCU : " + sum);
		
		int diff = a - b ;
		System.out.println("A - B SONUCU : " +diff);
		
		int carpma = a*b ;
		System.out.println("A * B SONUCU : "+ carpma);
		
		int bolme = 10/ 2 ;
		System.out.println("10 / 2 SONUCU "+ bolme);
		
		int kalan = 10 %3 ;
		System.out.println("10 % 3 SONUCU "+ kalan);
		
		System.out.println("a degerine Atama i�lemi yapmak i�in (=) kullan�yoruz "+ (a=1003) );
		System.out.println("Sayiya eksi veya art� operat�r atamas� yapabiliriz " + (-a));
		//Atama i�lemi yap�ld�ktan sonra a say�s� ayn� scopeda atanan degerdir ve i�lem sonras�nda 1003 degerini al�r.
		System.out.println("Tekrardan a ve b yi toplarsak "+ (a+b));
		
	}

}
