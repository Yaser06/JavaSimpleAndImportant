
public class IncrementDecrementOperators {

	public static void main(String[] args) {
		int number=5 ;
		System.out.println("Ýnt normal deðeri :"+ number);
		number++; // post- increment
		System.out.println("Ýnt arttýrma operatörü kullandýktan sonraki (post-inc) deðeri "+ number);
		System.out.println("");
		
		int number2=10;
		System.out.println("Ýnt normal degeri : "+ number2);
		++number2;// pre increment
		System.out.println("Ýnt arttýrma operatörü kullandýldýktan sonraki (pre-inc) degeri + "+number2);
		System.out.println("");
		
		int number3=7 ;
		System.out.println("Ýnt normal deðeri :"+ number3);
		number--;  //post decrment
		System.out.println("Ýnt cýkartma operatörü kullandýktan sonraki (post-dec) deðeri "+ number3);
		System.out.println("");
		
		int number4=15;
		System.out.println("Ýnt normal degeri : "+ number4);
		--number4; // pre decrement
		System.out.println("Ýnt cýkartma operatörü kullandýldýktan sonraki (pre-dec) degeri + "+number4);
		System.out.println("");
		
		 System.out.println("##########################################");
		int sayi =6;
		System.out.println("Sayi deðerine "+ sayi+ " post- inc uygularsak alacaðý deðer : "+ (sayi ++));
		System.out.println("Arttýrma iþlemi yaptýktan sonra ayný degeri cagýrdýgýmýzda " + sayi);
		
		// Alttaki örnekler ile þunu anlýyoruz post da iþlem yapýlýr sonra atanýr.Prede sayý deðiþir sonra iþlem yapýlýr.
		int sayi2=10 ;
		System.out.println(--sayi2);
		System.out.println(sayi2);
		
		int sayi3=5;
		int yeniSayi= sayi3*sayi3++;
		System.out.println(yeniSayi);
		
		
		
	}

}
