package 예외처리;

public class _08예외객체주의사항 {
	public static void main(String[] args) {
		try {
			
			//int a = 10/0;
			Exception e = new Exception("에러 그냥 발생했음"); // 그냥 익셥션 객체만 만든것 
			throw e; // throw 에러 객체 발생

//			int a = 101;
//			
//			if(a < 0 || a > 100) {
//				// 위에것 한줄로 처리 
//				throw new Exception("점수값은 0 - 100 사이값 입니다");
//			}
//			System.out.println("test");
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}catch(Exception e) {
			System.out.println(e.getMessage());
			
//			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료");
	}
}
