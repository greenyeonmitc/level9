package 예외처리;

// Checked 예외 vs Unchecked 예외
//- 예외처리 필수 여부


class Ex02{
	void sample() {
		// 발생할 수 있는 에러를 내가 처리할께 
		try {
			int a = 10/0;
		}catch(Exception e) {
		//	e.printStackTrace();
		//	System.out.println(e.toString());
			System.out.println("0으로 나눌 수 없습니다 ");
		}
	}
	
	void sample2() throws Exception{
		// 나를 호출한 곳에서 에러를 처리해줘
		// sample2 그냥 호출 불가 try{}catch(){} 로 호출 가능 
		int a = 10/0;
		System.out.println("test");
	}
	
    
}

public class _07예외떠넘기기2 {
	public static void main(String[] args) {
	
		Ex02 e = new Ex02();
		e.sample();
		
		try {
			e.sample2();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
}
