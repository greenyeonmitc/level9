package 예외처리;

import java.util.InputMismatchException;
import java.util.Scanner;

public class 예외처리실습 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int currentYear = 2023;
		try {
		System.out.println("나이를 입력하세요");
		int age = sc.nextInt();
		System.out.println(" 태어난 연도 : " + (currentYear-age) +"년");
		}catch(InputMismatchException e) {
			System.out.println("숫자값을 입력하세요");
		}finally {
			System.out.println("프로그램 종료 ");
			sc.close();
		}
		
	}

}
