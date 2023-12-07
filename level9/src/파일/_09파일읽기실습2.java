package 파일;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class _09파일읽기실습2 {

	public static void main(String[] args) {
		String[] ids = null;
		String[] pws = null;
		int[] moneys = null;

		String fileName = "file2.txt";
		final String CUR_PATH = System.getProperty("user.dir") + "\\level9\\src\\파일\\";
		
		File file = new File(CUR_PATH + fileName);

		String data = "";
		if (file.exists()) {
			try (FileReader fr = new FileReader(file); BufferedReader br = new BufferedReader(fr)) {
				while (true) { // br.read()
					String temp = br.readLine();
					if (temp == null) {
						break;
					}
					data += temp + "\n";
				}
			} catch (Exception e) {
				System.out.println("파일 에러 ");
			}
		}
		
		String[] temp = data.split("\n");
		ids = new String[temp.length];
		pws = new String[temp.length];
		moneys = new int[temp.length];
		
		for(int i =0; i < temp.length;i+=1) {
			String[] info = temp[i].split("/");
			ids[i] = info[0];
			pws[i] = info[1];
			moneys[i] = Integer.parseInt(info[2]);
		}
		
		// print
		for (int i = 0; i <temp.length; i++) {
			System.out.printf("%s %s : %d\n", ids[i], pws[i], moneys[i]);
		}
		
	}

}
