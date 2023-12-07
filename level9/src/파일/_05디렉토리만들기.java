package 파일;

import java.io.File;

public class _05디렉토리만들기 {

	public static void main(String[] args) {
		final String CUR_PATH = "level9\\src\\파일\\";
		String fileName = "file22222.txt" ;
		String folderName = "test";
        File folder = new File(CUR_PATH + folderName);

        //  💡 디렉토리 만들기
        boolean folderMade = folder.mkdir();
        System.out.println(folderMade? "폴더만들었음" : "안만들었음");
		
        
	}

}
