package 파일;

import java.io.File;

public class _04파일삭제 {
	public static void main(String[] args) {
		final String CUR_PATH = "level9\\src\\파일\\";
		String fileName = "file22222.txt" ;
		//  💡 파일의 삭제하고 결과 반환
	     File file = new File(CUR_PATH + fileName);
        boolean deleteResult = file.delete();
        System.out.println(deleteResult ? "삭제됨" : "해당 파일 없음");
	}
}
