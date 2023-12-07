package 파일;

import java.io.File;

public class _03파일변경 {
	public static void main(String[] args) {
		final String CUR_PATH = "level9\\src\\파일\\";
		String newName = "file22222.txt" ;

        File file1 = new File(CUR_PATH + "file1.txt");
        File nameChange = new File(CUR_PATH + newName);

        //  💡 파일의 이름 변경하고 결과 반환
        boolean renameResult = file1.renameTo(nameChange);
        System.out.println(renameResult ? "이름 변경됨" : "해당 파일 없음");
	}
}
