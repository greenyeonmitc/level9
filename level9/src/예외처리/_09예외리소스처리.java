package 예외처리;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
- 사용한 뒤 닫아주어야 하는 리소스 접근에 사용
- 파일 열람, 데이터베이스 접근 등
- 기존에 `finally` 블록으로 명시해야 했던 것을 간편화
*/
public class _09예외리소스처리 {
	public static void main(String[] args) {
	
			try (Scanner sc = new Scanner(System.in)) {
				System.out.println("숫자 값만 입력 ");
				int num = sc.nextInt();
				System.out.println("num=" + num);

			} catch (InputMismatchException e) {
				System.err.println("숫자 값만 입력하세요 ");
				// e.printStackTrace();
			}
			
			System.out.println("종료");
		
	}
}
