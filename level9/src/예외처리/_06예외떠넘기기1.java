package 예외처리;

import java.util.Random;

// Checked 예외 vs Unchecked 예외
//- 예외처리 필수 여부


class Ex01{
	
//  💡 RuntimeException 과 그 자손들 : unchecked 예외
//  - 주로 개발자의 실수로 일어나는 예외 (실수 안 하면 됨)
//  - 예외처리가 필수가 아님 (하지 않아도 컴파일 가능)
    void unchcekdExcep1 () {
        if (new Random().nextBoolean()) {
            throw new RuntimeException();
        }
    }
    
    
	//  ⚠️ 다른 예외들은 checked 예외
    //  - 해당 메소드 내에서, 또는 호출한 곳에서 예외처리 필수
    //  - 외적 요인으로 발생하는 예외 (조심해도 소용없으므로 대비해야 함)
    //  - ⭐️ IDE의 안내에 따라 두 가지 옵션 실행해보기
    void chcekdExcep1 () {
    	 if (new Random().nextBoolean()) {
            //  throw new FileNotFoundException();
         }
    }
    
    
}

public class _06예외떠넘기기1 {
	public static void main(String[] args) {
	
		Ex01 e = new Ex01(); 
		e.unchcekdExcep1();
	}
}
