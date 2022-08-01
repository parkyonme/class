package rollDice;

public class RollDice {

	int dice;
	int score;

	public int dice() {
		dice = (int) (Math.random() * 6 + 1);
		score += dice;
		return dice;
	}
//	public int score() {
//		return dice;
//	}
}
