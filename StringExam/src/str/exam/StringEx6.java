package str.exam;

public class StringEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 

		// 절대 원본 데이터를 변경하지 않는다
		String originStr = "2022/07/27"; // 기준
		String changeStr = "";
		
//		날짜를 아래와 같이 출력하시오 
// 		ex: 출력형태 
//		2022년07월27일 

//		String[] arr = originStr.split("/");
//		String year = arr[0] + "년";
//		String month = arr[1] + "월";
//		String day = arr[2] + "일";
//		changeStr = year + month + day;
		
		String year = originStr.substring(0,4) + "년";
		String month = originStr.substring(5,7) + "월";
		String day = originStr.substring(8,10) + "일";
		changeStr = year + month + day;
		
		
		
		
		System.out.println(originStr);
		System.out.println(changeStr);

	}

}
