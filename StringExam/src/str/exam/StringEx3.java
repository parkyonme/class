package str.exam;

public class StringEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 

		// 절대 원본 데이터를 변경하지 않는다
		String originStr = "문자열 메서드를 활용haja하자"; // 기준
		String changeStr = "";
		
//		영어로 적힌 부분들을 모두 대문자화 하여 영어만 출력하시오 
		changeStr = originStr.toUpperCase();
		changeStr = changeStr.substring(11,15);
		
		System.out.println(originStr);
		System.out.println(changeStr);

	}

}
