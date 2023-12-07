package 콜랙션;
/*
- 가장 많이 사용되는 컬렉션 클래스
- 요소들을 들어오는 순서대로 저장
int 는 값인지 인덱스인지 해깔리기 때문에 
이렇게 박싱을 하면 원하는 것을 삭제할 수 있다

ArrayList 는 장점은 내가 원하는 거 찾는거 빠름 
초기 저장공간 10개 가지고 있음 

- 배열과 달리, 크기가 동적으로 증가 가능
    - 지정하지 않을 시 초기 공간 10
        - 공간 *(capacity)* ≠ 요소의 수 *(size)*
    - 배열처럼 메모리상에 연속으로 나열
        - 그래서 Array(배열)List
    - 공간 초과 시 추가 공간 확보
        - 더 넓은 공간을 확보한 뒤 요소들 복사
            - 더 넓은 땅으로 이주하는 개념
    - 중간의 요소 제거 시 이후 요소들 당겨옴
- 용도
    - 장점 : 각 요소들로의 접근이 빠름
    - 단점 : 요소 추가/제거 시 성능 부하, 메모리 더 차지
    - 변경이 드물고 빠른 접근이 필요한 곳에 적합
*/
import java.util.ArrayList;
import java.util.Arrays;

public class _01어레이리스트 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		for(int num : list) {
			System.out.print(num +" ");
		}
		System.out.println();
		list.remove(1); // 인덱스로 삭제
		list.remove((Integer)30); // 값으로 삭제 
		list.add(1,100); // 인덱스 1에 100 삽입 
		list.set(0,1000); // 인덱스 0 1000으로 수정
		
		System.out.println("-----------");
		
		for(int i =0; i < list.size();i+=1) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		
		System.out.println(list.isEmpty());
		
		System.out.println(list.contains(101));
		
		// 간단하게 리스트 생성 
		ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(10,20,30,40,50));
		

		

	}
}
