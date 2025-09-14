import java.util.*;
public class ListFunctions {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("사과");
		list.add("바나나");
		list.add(1, "포도"); //특정 인덱스에 요소 삽입
		
		System.out.println("전체 리스트: "+ list); // 출력 : [사과, 포도, 바나나]
		System.out.println("0번째 요소: "+ list.get(0)); //출력:사과
		System.out.println("index 0이상 1미만 : "+list.subList(0, 1));//출력:[사과]
		//subList(fromIndex, toIndex)는 get(index)과 달리 리스트 형식으로 반환
		
		list.set(2,  "오렌지"); // 바나나 -> 오렌지
		System.out.println("수정 후 리스트: "+ list); // 출력 : [사과, 포도, 오렌지]
		
		list.remove("포도"); //리스트 포도 요소 삭제
		System.out.println("삭제 후 리스트: "+ list); // 출력 : [사과, 오렌지]
		
		System.out.println("리스트 크기: "+ list.size()); // 2
		System.out.println("오렌지 포함 여부: "+ list.contains("오렌지")); // true
		
		list.clear(); //리스트 초기화, 전체 삭제
		System.out.println("비운 후 리스트: "+ list); // 출력 : []
		System.out.println("비었는가?: "+ list.isEmpty()); // true
	}
}
