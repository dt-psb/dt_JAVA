//리스트 -> 배열 - list.toArray(new Type[0])
//배열 -> 리스트 - new ArrayList<>(Arrays.asList(array))

import java.util.*;
public class ArrayListConversion {
	public static void main(String[] args) {
		//1.배열 -> 리스트 변환
		String[] fruitsArray = {"사과","바나나","체리"};
		
		//Arrays.asList() 사용 (주의:고정 크기 리스트)
		List<String> fruitList = new ArrayList<>(Arrays.asList(fruitsArray));
		System.out.println("배열 -> 리스트 변환 결과 : " + fruitList);
		
		//리스트에 새 항목 추가
		fruitList.add("오렌지");
		System.out.println("리스트에 추가 후: " + fruitList);

		//2. 리스트->배열 변환
		String[] newArray = fruitList.toArray(new String[0]);//길이 0인 배열을 전달하면 자동으로 크기 생성됨
		
		//변환된 배열 출력
		System.out.println("리스트 -> 배열 변환 결과 : " +Arrays.toString(newArray));
	}
}
