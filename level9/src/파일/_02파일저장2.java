package 파일;

import java.io.File;
import java.io.IOException;

public class _02파일저장2 {
	public static void main(String[] args) {

		// 프로젝트에 맞게
		final String CUR_PATH = "level9\\src\\파일\\";
		// String fileName = "file01.txt"; // 기본적으로 프로젝트에 저장이 된다
		String fileName = "file1.txt"; // 기본적으로 프로젝트에 저장이 된다

		String filePath = CUR_PATH + fileName;

		File file1 = new File(filePath);
		System.out.println(file1.exists()); // 생성 후 다시 실행해 볼 것
		try {
			boolean result = file1.createNewFile();
			System.out.println(result ? "파일 생성됨" : "이미 있음");
		} catch (IOException e) {
			// CUR_PATH를 틀리게 작성하고 실행해 볼 것
			throw new RuntimeException(e);
		}

	}
}
