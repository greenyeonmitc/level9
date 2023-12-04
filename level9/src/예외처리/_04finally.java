package 예외처리;

public class _04finally {

	public static void main(String[] args) {

		
		// try catch finally
		
		// finally 는 에러 유무 상관없이 무조건 실행된다.
		// 코드가 잘 작동했는지 확인 할때 쓴다. (안내문구용)
		
		//- 예외 발생 여부에 상관없이 반드시 실행할 코드
	    //- 데이터베이스 연결을 열어 작업한 뒤 닫아줄 때 등에 사용
			
		int num1 = 10;
		int num2 = 0;
		
		try {
			System.out.println(num1 / num2);
		}catch(Exception e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}finally {
			System.out.println("예외발생과 상관없이 무조건 실행할 문장을 적는다.");
			
		}
		
	}

}
