package 예외처리;


//예외 **던지기** *throw*

// 컴퓨터가 문제라고 인식하지 못하는 상황에서 인위적으로 예외 발생

public class _05예외정의발생 {

	public static void main(String[] args) {

		//  ⭐️ 예외가 오류가 던져지면 그 아래의 코드는 작성할 수 없음
       // throw new NullPointerException();

        //  💡 메시지를 특정하여 던지기
        //throw new NullPointerException("값이 비어있어요 ");

		try {
			int idx = 5;
			System.out.println("idx = " + idx);
			int[] arr = new int[5];
			
			if(idx >= arr.length || idx < 0) {
				throw new ArrayIndexOutOfBoundsException("인덱스 값이 이게 뭡니까?");
			}
			System.out.println(arr[idx]);
			
		}catch(Exception e) {

			e.printStackTrace();
		}
		System.out.println("프로그램 종료");

	}

}
