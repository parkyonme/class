package five.DiceGame;

import java.util.Scanner;

public class OddEvenTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 0;
		OddEven oddEven = new OddEven();
		Scanner scan = new Scanner (System.in); 
		
		oddEven.welcome();
		num = scan.nextInt();
		
		oddEven.EvenNumber();
		
		
		
		
		
	}

}
