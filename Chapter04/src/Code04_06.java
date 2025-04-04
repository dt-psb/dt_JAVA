
public class Code04_06 {
	public static void main(String[] args) {
		System.out.printf("%d / %d = %f", 100,200,0.5);
		//만약 "%d / %d = %d"로 작성할 경우 세번째 서식(정수형)과 숫자(0.5,실수형)이 일치하지 않으므로 오류 발생
		
		System.out.println();
		System.out.printf("%d / %d = %3.1f", 100,200,0.5);
		// "%전체자릿수.소숫점아래자릿수f"형식을 사용하면 특정 소수점까지 출력 가능
	}
}
