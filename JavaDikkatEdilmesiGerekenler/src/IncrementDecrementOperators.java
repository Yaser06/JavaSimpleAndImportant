
public class IncrementDecrementOperators {

	public static void main(String[] args) {
		int number=5 ;
		System.out.println("�nt normal de�eri :"+ number);
		number++; // post- increment
		System.out.println("�nt artt�rma operat�r� kulland�ktan sonraki (post-inc) de�eri "+ number);
		System.out.println("");
		
		int number2=10;
		System.out.println("�nt normal degeri : "+ number2);
		++number2;// pre increment
		System.out.println("�nt artt�rma operat�r� kulland�ld�ktan sonraki (pre-inc) degeri + "+number2);
		System.out.println("");
		
		int number3=7 ;
		System.out.println("�nt normal de�eri :"+ number3);
		number--;  //post decrment
		System.out.println("�nt c�kartma operat�r� kulland�ktan sonraki (post-dec) de�eri "+ number3);
		System.out.println("");
		
		int number4=15;
		System.out.println("�nt normal degeri : "+ number4);
		--number4; // pre decrement
		System.out.println("�nt c�kartma operat�r� kulland�ld�ktan sonraki (pre-dec) degeri + "+number4);
		System.out.println("");
		
		 System.out.println("##########################################");
		int sayi =6;
		System.out.println("Sayi de�erine "+ sayi+ " post- inc uygularsak alaca�� de�er : "+ (sayi ++));
		System.out.println("Artt�rma i�lemi yapt�ktan sonra ayn� degeri cag�rd�g�m�zda " + sayi);
		
		// Alttaki �rnekler ile �unu anl�yoruz post da i�lem yap�l�r sonra atan�r.Prede say� de�i�ir sonra i�lem yap�l�r.
		int sayi2=10 ;
		System.out.println(--sayi2);
		System.out.println(sayi2);
		
		int sayi3=5;
		int yeniSayi= sayi3*sayi3++;
		System.out.println(yeniSayi);
		
		
		
	}

}
