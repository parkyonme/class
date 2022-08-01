package rollDice;

import java.util.Scanner;

public class DiceTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RollDice roll = new RollDice();
		RollDice user = new RollDice();
		RollDice com = new RollDice();
		Scanner sc = new Scanner(System.in);
		int start = 0;
		int playTime = 1;

		System.out.println("★☆★☆★☆★☆dice game !!☆★☆★☆★☆★");
		System.out.println("1 - start" + "\t" + "2 - end");
		start = sc.nextInt();
		while (true) {
			if (start == 1) {
				System.out.println("user님의 주사위 눈 :" + user.dice() + "\t" + "user님의 점수 :" + user.score);
				System.out.println("com님의 주사위 눈 : " + com.dice() + "\t"  + "com님의 점수 :" + com.score);
				System.out.println("플레이 횟수 :" + playTime++);
				System.out.println();
				if (user.score >= 21) {
					System.out.println("★☆★☆you win☆★☆★");
					break;
				} else if (com.score >= 21) {
					System.out.println("★☆★☆you lose☆★☆★");
					break;
				}
				System.out.println("계속하시겠습니까?");
				System.out.println("1 - Yes" + "\t" + "2-No");
				start = sc.nextInt();

			} else if (start == 2) {
				System.out.println("게임을 종료했습니다.");
				break;
			} else {
				System.out.println("1과 2 중에 하나만 입력해주세요!!");
			}
		}

	}

}
