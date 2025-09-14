import java.util.*;
public class SortIntegers {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>(Arrays.asList(5,2,9,1,7));
		
		//오름차순 정렬
		Collections.sort(numbers);
		System.out.println("오름차순 정렬: "+numbers);//[1,2,5,7,9]
		
		//내림차순 정렬
		Collections.sort(numbers,Collections.reverseOrder());
		System.out.println("내림차순 정렬: "+numbers);//[9,7,5,2,1]
	}
}
