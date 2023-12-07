package 파일;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

class FileEx2 {
	Scanner sc = new Scanner(System.in);
	String fileName = "vector.txt";
	int count = 0;
	final String CUR_PATH = System.getProperty("user.dir") + "\\level9\\src\\파일\\";
	int[] vector = null;
	// 입력 값 문자 입력 예외처리 하기

	void init() {
		File file = new File(CUR_PATH + fileName);
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	int getValue(String msg, int start, int end) {
		while (true) {
			System.out.printf("%s[%d-%d] 입력: ", msg, start, end);
			try {
				int num = sc.nextInt();
				sc.nextLine();
				if (num < start || num > end) {
					System.out.println(start + " ~ " + end + " 값 입력해주세요");
				}
				return num;
			} catch (InputMismatchException e) {
				sc.nextLine();
				System.out.println("숫자값을 입력해주세요");
			}
		}
	}

	void addData() {
		if (count == 0) {
			vector = new int[count + 1];
		} else if (count > 0) {
			int[] temp = vector;
			vector = new int[count + 1];

			for (int i = 0; i < count; i++) {
				vector[i] = temp[i];
			}
			temp = null;
		}
		int data = getValue("[추가]데이터", -1000, 1000);

		vector[count] = data;
		count += 1;
	}

	boolean isDataEmty() {
		if (count == 0) {
			System.out.println("데이터가 없습니다");
			return true;
		}
		return false;
	}

	void deleteData() {
		if (isDataEmty())
			return;
		int delIdx = getValue("[삭제]인덱스", 0, count);

		if (count == 1) {
			vector = null;
		} else if (count > 1) {
			int[] temp = vector;
			vector = new int[count - 1];
			int k = 0;
			for (int i = 0; i < count; i++) {
				if (i != delIdx) {
					vector[k] = temp[i];
					k += 1;
				}
			}
			temp = null;
		}
		count -= 1;

	}

	void saveToFile() {
		if (isDataEmty())
			return;
		String data = "";
		for (int i = 0; i < count; i++) {
			data += vector[i] + "\n";
		}
		data = data.substring(0, data.length() - 1);

		try (FileWriter fw = new FileWriter(CUR_PATH + fileName)) {
			fw.write(data);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	void loadFromFile() {
		String data = "";

		try (FileReader fr = new FileReader(CUR_PATH + fileName); BufferedReader br = new BufferedReader(fr)) {
			while (true) {
				String line = br.readLine();
				if (line == null) {
					break;
				}
				data += line;
				data += "\n";
			}
			data = data.substring(0, data.length() - 1);

			String[] temp = data.split("\n");
			count = temp.length;

			vector = new int[count];

			for (int i = 0; i < count; i++) {
				vector[i] = Integer.parseInt(temp[i]);
			}

			System.out.println("로드완료 ");
		} catch (Exception e) {
			System.out.println("로드 실패 ");
			e.printStackTrace();
		}
	}

	void printMenu() {

		System.out.println("[벡터 컨트롤러]");
		System.out.println("[1]추가하기");
		System.out.println("[2]삭제하기(인덱스)");
		System.out.println("[3]저장하기");
		System.out.println("[4]로드하기");
		System.out.println("[5]종료하기");

		while (true) {
			printAll();
			int sel = getValue("메뉴", 1, 5);

			if (sel == 1) {
				addData();
			} else if (sel == 2) {
				deleteData();
			} else if (sel == 3) {
				saveToFile();
			} else if (sel == 4) {
				loadFromFile();
			} else {
				System.out.println("프로그램 종료");
				return;
			}
		}
	}

	void printAll() {
		if (vector == null)
			return;
		System.out.println("-------------");
		for (int num : vector) {
			System.out.print(num + " ");
		}
		System.out.println();
		System.out.println("-------------");
	}

	void run() {
		init();
		printMenu();
		sc.close();
	}
}

public class _10백터컨트롤러2 {

	public static void main(String[] args) {

		FileEx e = new FileEx();
		e.run();

	}

}
