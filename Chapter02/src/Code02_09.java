
public class Code02_09 {
	public static void main(String[ ] args) {
		int number1=10, number2=20;
		int resAdd;
		int resSub;
		int resMul;
		double resDiv; //나누기의 결과가 실수일 수 있으므로 정수형 int가 아닌 실수형 double을 사용
		
		resAdd=number1 +  number2;
		resSub=number1 -  number2;
		resMul=number1 *  number2;
		resDiv=(double)number1 /  number2; //정수인 number1을 (double)로 잠깐 실수로 바꿔줌. 이렇게 하면 실수/정수의 연산이 되어 결과도 실수
		
		
		/*
		 * 정수 (+, -, *, /) 정수 = 정수
		 * 정수 (+, -, *, /) 실수 = 실수
		 * 실수 (+, -, *, /) 실수 = 실수
		 */
		
		System.out.println(number1 + "+" + number2 + "="+ resAdd ); //10+20=30출력
		System.out.println(number1 + "-" + number2 + "="+ resSub ); //10-20=-10 출력
		System.out.println(number1 + "x" + number2 + "="+ resMul ); //10x20=200 출력
		System.out.println(number1 + "/" + number2 + "="+ resDiv ); //10/20=0.5 출력
		
		
	}
}