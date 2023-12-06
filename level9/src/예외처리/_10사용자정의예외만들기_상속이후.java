package 예외처리;


//- 예외의 타입으로 어떤 예외인지 전달
// - 예외에 추가적 기능을 담을 때

// Exception 클래스에서 상속받으면ㅁ checked expection 
class WrongInputException extends Exception{
	WrongInputException(int idx){
		super("인덱스 %d는 사용할 수 없는 인덱스 값입니다".formatted(idx));
	}
	
}

public class _10사용자정의예외만들기_상속이후 {

	public static void main(String[] args) {

		
		try {
			throw new WrongInputException(12);
        } catch (WrongInputException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
		
	}

}
