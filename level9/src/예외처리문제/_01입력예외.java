package 예외처리문제;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _01입력예외 {

	public static void main(String[] args) {

		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			System.out.println("숫자 입력>>");
			int num = sc.nextInt();
			System.out.println("num =" + num);
		}catch(InputMismatchException e) {
			System.out.println("숫자만 입력해 주세요");
			e.printStackTrace();
		}finally {
			sc.close();
		}
		
		System.out.println(" 프로그램 종료");
		
	}

}
