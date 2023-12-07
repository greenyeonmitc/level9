package 파일;

import java.io.File;
import java.io.FileWriter;

public class _06디렉토리 {
	public static void main(String[] args) {
//		String dir = System.getProperty("user.dir");
		String dir = System.getProperty("user.home"); 
		System.out.println(dir);            // /Users/KimJiyeon
		
		dir += "/desktop";
		
		File file = new File(dir, "test.txt");
		System.out.println(file.getPath()); // /Users/KimJiyeon/desktop/test.txt
		
		String data = "박연미";
		FileWriter fw = null;
		
		try {
			fw = new FileWriter(file);
			fw.write(data);
			fw.close();
			System.out.println("저장완료");
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("저장실패");
		}
	}
}
