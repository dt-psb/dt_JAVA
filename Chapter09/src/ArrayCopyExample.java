
public class ArrayCopyExample {
	public static void main(String[] args) {
		//원본 배열 생성
		String[] original = {"쟁반짜장", "탕수육","군만두"};
		
		//얕은 복사 (shallow copy)
		String[] shallowCopy = original;
		
		//깊은 복사 (deep copy)
		String[] deepCopy = original.clone();
		
		//복사 후 내용 출력
		System.out.println("===복사 후 상태===");
		System.out.println("original[0]: "+original[0]);
		System.out.println("shallowCopy[0]: "+shallowCopy[0]);
		System.out.println("deepCopy[0]: "+deepCopy[0]);
		
		//shallowCopy의 값을 변경
		shallowCopy[0] = "짜장";
		
		//deepCopy의 값을 변경
		deepCopy[1]="짬뽕";
		
		//복사 후 내용 출력
		System.out.println("===변경 후 상태===");
		System.out.println("original[0]: "+original[0]); //얕은 복사에 의해 같이 변경됨
		System.out.println("shallowCopy[0]: "+shallowCopy[0]);//변경됨
		System.out.println("deepCopy[1]: "+deepCopy[1]);//독립적으로 변경됨
		System.out.println("original[1]: "+original[1]); //영향 없음
	}
}
