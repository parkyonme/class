package str.exam;

public class StringEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 

		// 절대 원본 데이터를 변경하지 않는다
		String originStr = "문자열 메서드를 활용haja하자"; // 기준
		String firstStr = "";
		String secondStr = "";
		String thirdStr = "";
		
//		문자열에서 띄워쓰기 되어있는 각각의 단어를 분리하여 출력하시오 
// 		ex: 출력형태 
//		문자열 
//		메서드를  
//		활용HAJA하자
		
		System.out.println(originStr.length());
		firstStr = originStr.substring(0,4);
		secondStr = originStr.substring(4,9);
		thirdStr = originStr.substring(9,17).toUpperCase();
		
		
		System.out.println(originStr);
		System.out.println(firstStr);
		System.out.println(secondStr);
		System.out.println(thirdStr);
		System.out.println(firstStr + secondStr + thirdStr);

	}

}
