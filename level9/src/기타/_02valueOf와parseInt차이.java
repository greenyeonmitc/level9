package 기타;

public class _02valueOf와parseInt차이 {

	public static void main(String[] args) {
		// valueOf 는 Integer 클래스로 반환 
		
		Integer num = Integer.valueOf("123");
		
		  //  parseInt(CharSequence, 진수)
        //  정수 자료형들에만 존재
		
	        int num_oct = Integer.parseInt("123", 8);
	        int num_dec = Integer.parseInt("123", 10);
	        int num_hex = Integer.parseInt("123", 16);
	        
	        //  parseInt(CharSequence, 시작위치, 끝위치, 진수)
	        int test = Integer.parseInt("1234567", 3, 5, 10);
	}

}
