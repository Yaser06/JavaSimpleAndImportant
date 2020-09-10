
public class MathOperatörler {

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
		
		System.out.println("a degerine Atama iþlemi yapmak için (=) kullanýyoruz "+ (a=1003) );
		System.out.println("Sayiya eksi veya artý operatör atamasý yapabiliriz " + (-a));
		//Atama iþlemi yapýldýktan sonra a sayýsý ayný scopeda atanan degerdir ve iþlem sonrasýnda 1003 degerini alýr.
		System.out.println("Tekrardan a ve b yi toplarsak "+ (a+b));
		
	}

}
