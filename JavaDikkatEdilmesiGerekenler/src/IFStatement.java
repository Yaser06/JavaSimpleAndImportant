import java.util.Scanner;

public class IFStatement {

	public static void main(String[] args) {


		Scanner scanner  = new Scanner(System.in);
		System.out.println("Please enter your note : ");
		int note = scanner.nextInt();
		
		if(note >= 90) {
			System.out.println("A");
		}else if(note >= 80) {
			System.out.println("B");
		}else if(note >= 70) {
			System.out.println("C");
		}else if(note >= 60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		
	}

}
