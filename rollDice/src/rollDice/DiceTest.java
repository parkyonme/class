package rollDice;

import java.util.Scanner;

public class DiceTest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		RollDice diceUser = new RollDice();
		RollDice diceCom = new RollDice();
//		BoardPad pad = new BoardPad(27);
		BoardPad2 pad = new BoardPad2();
		int time = 750;
		
		while(true) {
			System.out.println("========================================================");
			System.out.println("1. 주사위 굴리기");
			System.out.println("2. 그만하기");
			System.out.print("하고싶으신 행동을 골라 주세요 : ");
			String select = in.nextLine();
			
			if(select.equals("1")) {
				//사용자 주사위 굴리기
				int user = diceUser.dice();
				System.out.print("사용자의 주사위 눈금 : " + user);
				System.out.println();
				pad.diceUserSet(user);
				
				System.out.println("----------------------------------------");
				System.out.print("AI가 주사위를 굴리고 있습니다.");
				try {
					Thread.sleep(time);
					System.out.print(".");
					Thread.sleep(time);
					System.out.print(".");
					Thread.sleep(time);
					System.out.print(".");
					Thread.sleep(time);
					System.out.print(".");
					System.out.println();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("----------------------------------------");
				//컴퓨터 주사위 굴리기
				int computer = diceUser.dice();
				System.out.print("AI의 주사위 눈금 : " + computer);
				System.out.println();
				pad.diceComSet(computer);

//				pad.boardPad();
				if(pad.gameUseSet) {
					System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
					System.out.println("축하드립니다!!!  플레이어가 이겼습니다!!");
					System.out.println("프로그램을 종료 합니다.");
					break;
				}else if(pad.gameComSet) {
					System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
					System.out.println("아쉽게도 AI가 승리하였습니다...");
					System.out.println("프로그램을 종료 합니다....");
					break;
				}
				
			}else if(select.equals("2")) {
				break;
			}else {
				System.out.println("========================================================");
				System.out.println(" - 잘못 누르셨습니다.");
				System.out.println(" - 2가지 행동 중 골라주세요.");
			}
		}	
	}
}

class BoardPad {
	int user;
	int com;
	int maxScoure;
	
	public BoardPad(int maxScoure) {
		this.maxScoure = maxScoure;
	}
	
	public void boardPad() {
		System.out.println("========================================================");
		System.out.println("현재 진행 중인 보드 판입니다.");
		System.out.print("User:"+"\t");
		for(int count = 0; count < user; count++) {
			System.out.print("■");
		}
		for(int count = user + 1; count < maxScoure; count++) {
			System.out.print("□");
		}
		System.out.print("\t 현재 점수 : " + user + " / " + maxScoure);
		System.out.println();
		System.out.print("Comp:"+"\t");
		for(int count = 0; count < com; count++) {
			System.out.print("■");
		}
		for(int count = com + 1; count < maxScoure; count++) {
			System.out.print("□");
		}
		System.out.print("\t 현재 점수 : " + com + " / " + maxScoure);
		System.out.println();
	}
}


class BoardPad2{
	int uX = 4, uY = 4;
	int cX = 4, cY = 4;
	
	boolean uS = false, gameUseSet = false;
	boolean cS = false, gameComSet = false;
	public void boardPad() {
		System.out.println("========================================================");
		System.out.println("현재 진행 중인 보드 판입니다.");
		
		for(int higth = 0; higth < 5; higth++) {
			if(higth % 2 != 0) {
				for(int width = 0; width < 5; width++) {
					if((uY == higth && uX == width) && (cY == higth && cX == width)) {
						System.out.print("\t" + "■"+"★");
					}else if(uY == higth && uX == width){
						System.out.print("\t" + "■");
					}else if(cY == higth && cX == width) {
						System.out.print("\t" + "★");
					}else{
						System.out.print(((width != 2)? ("\t" + "□") : ("\t")));
					}
				}
			}else if(higth ==2) {
				for(int width = 0; width < 5; width++) {
					if((uY == higth && uX == width) && (cY == higth && cX == width)) {
						System.out.print("\t" + "■"+"★");
					}else if(uY == higth && uX == width){
						System.out.print("\t" + "■");
					}else if(cY == higth && cX == width) {
						System.out.print("\t" + "★");
					}else{
						System.out.print(((width % 2 == 0)? ("\t" + "□") : ("\t")));
					}
				}
			}else {
				for(int width = 0; width < 5; width++) {
					if((uY == higth && uX == width) && (cY == higth && cX == width)) {
						System.out.print("\t" + "■"+"★");
					}else if(uY == higth && uX == width){
						System.out.print("\t" + "■");
					}else if(cY == higth && cX == width) {
						System.out.print("\t" + "★");
					}else{
						System.out.print("\t" + "□");
					}
				}
			}
			System.out.println();
		}
	}
	
	
	public void diceUserSet(int dice) {
		if((uX >= 4 && uY >= 4) && uS == true) {
			gameUseSet = true;
		}
		if(uX == 4 && uY == 0) {
			uX = Math.abs(uX - dice);
			uY = (dice < 5)? dice : 4;  	
		}else if(uX == 3 && uY == 1) {
			uX = Math.abs(uX - dice);
			uY = (uY + dice < 5)? (uY + dice) : 4;  
		}else if(uX == 1 && uY == 3) {
			uX = Math.abs(uX - dice);
			uY = (uY + dice < 5)? (uY + dice) : 4;  
		}else if(uX == 0 && uY == 0) {
			uX += dice;
			uY += dice;
		}else if(uX == 2 && uY == 2) {
			uX += dice;
			uY += dice;
		}else if((uX == 1 && uY == 1) || (uX == 3 && uY == 3)) {
			uX += dice;
			uY += dice;
		}else if(uX == 4 && uY > 0 && uY >= dice) {
			uY -= dice;
			uS = true;
		}else if(uX == 4 && uY > 0 && uY < dice) {
			uX -= (dice - uY);
			uY = 0;
		}else if(uY == 0 && uX > 0 && uX >= dice) {
			uX -= dice;
		}else if(uY == 0 && uY < 5 && uX < dice) {
			uY += (dice - uX);
			uX = 0;
		}else if(uX == 0 && uY < 5 && (uY + dice) < 5) {
			uY += dice;
		}else if(uX == 0 && (uY + dice) > 4) {
			uY = 4;
			uX += Math.abs(dice - uY);
		}else if(uY == 4 && uX < 5) {
			uX += dice;
		}
		boardPad();
	}
	public void diceComSet(int dice) {
		if((cX >= 4 && cY >= 4) && cS == true) {
			gameComSet = true;
		}
		if(cX == 4 && cY == 0) {
			cX = Math.abs(cX - dice);
			cY = (dice < 5)? dice : 4;  	
		}else if(cX == 3 && cY == 1) {
			cX = Math.abs(cX - dice);
			cY = (cY + dice < 5)? (cY + dice) : 4;  
		}else if(cX == 1 && cY == 3) {
			cX = Math.abs(cX - dice);
			cY = (cY + dice < 5)? (cY + dice) : 4;  
		}else if(cX == 0 && cY == 0) {
			cX += dice;
			cY += dice;
		}else if(cX == 2 && cY == 2) {
			cX += dice;
			cY += dice;
		}else if((cX == 1 && cY == 1) || (cX == 3 && cY == 3)) {
			cX += dice;
			cY += dice;
		}else if(cX == 4 && cY > 0 && cY >= dice) {
			cY -= dice;
			cS = true;
		}else if(cX == 4 && cY > 0 && cY < dice) {
			cX -= (dice - cY);
			cY = 0;
		}else if(cY == 0 && cX > 0 && cX >= dice) {
			cX -= dice;
		}else if(cY == 0 && cY < 5 && cX < dice) {
			cY += (dice - cX);
			cX = 0;
		}else if(cX == 0 && cY < 5 && (cY + dice) < 5) {
			cY += dice;
		}else if(cX == 0 && (cY + dice) > 4) {
			cY = 4;
			cX += Math.abs(dice - cY);
		}else if(cY == 4 && cX < 5) {
			cX += dice;
		}
		boardPad();
	}
}