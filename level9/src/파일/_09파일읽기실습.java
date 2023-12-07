package 파일;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class _09파일읽기실습 {

	public static void main(String[] args) {
		String[] ids = null;
		String[] pws = null;
		int[] moneys = null;

		int cnt = 0;

		String fileName = "file2.txt";
		final String CUR_PATH = System.getProperty("user.dir") + "\\level9\\src\\파일\\";
		
		File file = new File(CUR_PATH + fileName);


		if (file.exists()) {
			try ( FileReader fr = new FileReader(file); BufferedReader br = new BufferedReader(fr)){

				String data = br.readLine();
				while (data != null) { // br.read()
					String tempIds[] = ids;
					String tempPws[] = pws;
					int tempMoneys[] = moneys;
					ids = new String[cnt + 1];
					pws = new String[cnt + 1];
					moneys = new int[cnt + 1];
					if (cnt > 0) {
						for (int i = 0; i < cnt; i++) {
							ids[i] = tempIds[i];
							pws[i] = tempPws[i];
							moneys[i] = tempMoneys[i];
						}
					}
					String info[] = data.split("/");
					ids[cnt] = info[0];
					pws[cnt] = info[1];
					moneys[cnt] = Integer.parseInt(info[2]);
					cnt++;
					data = br.readLine();
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

		// print
		for (int i = 0; i < cnt; i++) {
			System.out.printf("%s %s : %d\n", ids[i], pws[i], moneys[i]);
		}
		
	}

}
