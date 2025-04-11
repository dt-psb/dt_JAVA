
public class p234 {
	public static void main(String[] args) {
		double randomValue = Math.random();
		System.out.println("1. Math.random()의 결과 (0.0 이상 1.0 미만) : "+randomValue);
		
		double scaledValue = randomValue * 5;
		System.out.println("2. 5를 곱한 결과 (0.0 이상 5.0 미만) : "+scaledValue);
		
		double shiftedValue = scaledValue +1;
		System.out.println("3. 1을 더한 결과 (1.0 이상 6.0 미만) : "+shiftedValue);
		
		int finalResult = (int)shiftedValue + 1;
		System.out.println("4. 정수로 형변환된 값 (1 이상 5 이하의 정수) : "+finalResult);
	}
}
//굳이 실습안해도 되는 코드
