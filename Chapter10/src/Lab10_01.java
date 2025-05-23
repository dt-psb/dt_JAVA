import java.util.Scanner;
public class Lab10_01 {
	//계산기 메소드, 두 정수와 연산자를 매개변수로 받음
	static int calc(int v1, int v2, char op) {
		int result;//결과를 저장할 변수
		switch(op) {//연산자에 따른 다른 계산, switch문 사용
			case '+': 	result = v1 + v2; break;
			case '-': 	result = v1 - v2; break;
			case '*': 	result = v1 * v2; break;
			case '/': 	result = v1 / v2; break;
			default: result =0; //잘못된 입력일 경우 0으로 저장
		}
		return result;//결과 반환
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);//Scanner 객체 생성
		int res;//계산 결과 변수
		char oper;//연산자
		int num1, num2;//두 정수
		
		System.out.printf("계산 입력(+,=,*,/)  : ");
		oper = s.next().charAt(0);//연산자 입력
		
		System.out.printf("첫 번째 숫자 입력 : ");
		num1 = s.nextInt();//정수 1 입력
		
		System.out.printf("두 번째 숫자 입력 : ");
		num2 = s.nextInt();//정수 2 입력
		
		res=calc(num1,num2,oper);//메소드 호출하여 계산한후 반환값(결과)를 저장
		System.out.println("계산 결과 : "+res);//결과 출력
		
		s.close();
		
	}
}
