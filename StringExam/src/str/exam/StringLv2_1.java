package str.exam;

public class StringLv2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 절대 원본 데이터를 변경하지 않는다
		String originStr = "자바를 자바라"; // 기준
		String changeStr = "";          // 결과   
		
		
//		문자열 안에서 마지막 문자가 무엇인지 출력하시오 
		changeStr = originStr.substring(originStr.length()-1);
		
//		for(int i = originStr.length()-1; i < originStr.length(); i++) {
//			changeStr = originStr.substring(i);
//		}
		
		System.out.println(originStr);
		System.out.println(changeStr);
		
		
	}

}
