package 파일;

import java.io.FileWriter;

public class _07파일저장실습2 {

	public static void main(String[] args) {

		// mom/1111/20000
		// megait/2222/30000
		// github/3333/40000
		
		String[] names = {"mom", "megait", "github"};
		String[] pws   = {"1111",   "2222",   "3333"};
		int[]    moneys= { 20000,    30000,    40000};
		
		String fileName = "file2.txt";
		
		String data = "";

		int size = names.length;
		for(int i=0; i<size; i++) {
			data += "%s/%s/%d%n".formatted(names[i],pws[i],moneys[i]);
		}

		System.out.println(data);
		System.out.println(data.split("\n").length);
		
		final String CUR_PATH = System.getProperty("user.dir") + "\\level9\\src\\파일\\";
		
		try (FileWriter fw= new FileWriter(CUR_PATH + fileName)){
			fw.write(data);
		}catch(Exception e) {
			e.printStackTrace();
		}

		
	}

}
