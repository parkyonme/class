package five.DiceGame;

public class Dice {

	int num = 0;
	
	
	void diceRoll() {
		System.out.println("주사위를 굴렸습니다. 나온 숫자는");
		num =(int)(Math.random()*6+1);
		System.out.println(num + "입니다.");
	}
	
//	void viewDiceNum() {
//		System.out.println("나온 숫자는"+dice.diceRoll()+"입니다.");
//	}
}