package 파일;

import java.io.BufferedReader;
import java.io.FileReader;

public class _08파일읽기 {

	public static void main(String[] args) {
		
		final String CUR_PATH = System.getProperty("user.dir") + "\\level9\\src\\파일\\";
		
		String fileName = "file2.txt";
		
		try (FileReader fr = new FileReader(CUR_PATH + fileName);
				BufferedReader br = new BufferedReader(fr);){
			
			String data = br.readLine();			// 한 줄 읽어오기
			System.out.println(data);  // 데이터가 출력된다. 

		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
