package str.exam;

public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "12abQX34Aa";
		String intStr = "";
		String upper = "";
		String lower = "";

		for (int i = 0; i <= str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= '0' && ch <= '9') {
				intStr = intStr + ch;
//			}else if (ch >= 'a' && ch <= 'z') {
//				lower = lower + ch;
//			}else if (ch >= 'A' && ch <= 'Z') {
//				upper = upper + ch;
//		}
				System.out.println(intStr);
				System.out.println(upper);
				System.out.println(lower);
			}
		}
	}

}
