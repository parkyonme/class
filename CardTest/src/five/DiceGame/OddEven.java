package five.DiceGame;

public class OddEven {

	int num = 0;
	void welcome() {
		System.out.println("홀짝 판별 프로그램입니다"+ "\n"+ "어서오세요 고객님");
	}
	void EvenNumber() {
		if(num%2==0) {
			System.out.println("짝입니다.");
		}else {
			System.out.println("홀입니다.");
		}
	}
}
