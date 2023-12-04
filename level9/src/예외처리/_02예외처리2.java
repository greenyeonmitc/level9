package 예외처리;

public class _02예외처리2 {
	public static void main(String[] args) {

		// 에러의 종류 (참고사이트) 
		// https://butter-shower.tistory.com/87
	
		
		// 주석처리 해보면서 하나씩 실행해보자 
		int arr[] = new int[3];
		try {
			arr[100] = 100;
			
		}catch(ArrayIndexOutOfBoundsException e) {
			//예외에 대한 간략 정보 문자열로 반환
			System.out.println("메세지 => " + e.getMessage());
			e.printStackTrace();
		}
		
		//-----------------------------------
		
		int a = 10;
		try {
			int b = a/0;
			
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}
		
		//-----------------------------------
		
		String str = "aaa";
		try {
			int num = Integer.parseInt(str);
		}catch(NumberFormatException e) {
			e.printStackTrace();
		}
		
		
	}
}
