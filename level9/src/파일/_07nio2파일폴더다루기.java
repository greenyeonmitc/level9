package 파일;

import java.nio.file.Path;
import java.nio.file.Paths;

/*
- 자바7에 도입
- 기존의 `[java.io](http://java.io)` 패키지보다 안정적이고 다양한 기능

### `[java.io] 패키지

- `File` 클래스를 사용하여 파일들을 다룸
- 여러 문제점과 한계를 갖고 있었음
    - 멀티쓰레드에서 안전하지 않음
    - 기능 한정
    - OS간의 이식성 문제 *( 경로 처리 이슈 )*

### 1. `Paths` 클래스
- 파일 시스템 경로를 인스턴스화한 `Path` 객체 생성
- 경로를 보다 편리하고 직관적으로 다루는 기능들 제공

*/
public class _07nio2파일폴더다루기 {
	public static void main(String[] args) {
		final String CUR_PATH = "level9\\src\\파일\\";
		// 💡 프로젝트 폴더 경로
		Path path1 = Paths.get("");
		Path path1Abs = path1.toAbsolutePath();

		System.out.println(path1.toString());
		System.out.println(path1Abs.toString());

		Path path2 = Paths.get("file1.txt");
		Path path2Abs = path2.toAbsolutePath();

		System.out.println(path2.toString());
		System.out.println(path2Abs.toString());

		// 💡 인자로 들어온 문자열을 각각 내부 폴더로
		Path path3 = Paths.get(CUR_PATH, "sub1", "sub2", "sub3");

		System.out.println(path3.toString());

		// 💡 두 경로를 통합
		Path path4 = path3.resolve(path2);
		System.out.println(path4.toString());
		// 💡 부모 경로
		Path path5 = path4.getParent();
		System.out.println(path5.toString());
		// 💡 한 경로에서 다른 경로로의 상대 경로
		Path path6 = path4.relativize(path2);
		System.out.println(path6.toString());
		// 💡 끝단 파일/폴더명
		Path path7 = path4.getFileName();
		System.out.println(path7.toString());
		// 💡 서브경로
		Path path8 = path4.subpath(3, 5);
		System.out.println(path8.toString());
	}
}
