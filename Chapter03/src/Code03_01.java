
public class Code03_01 {
/*
 산술 연산자
 + 더하기 a=5+3 / 5와 3을 더한 값을 a에 대입
 - 빼기 a=5-3 / 5에서 3을 뺀 값을 a에 대입
 * 곱하기 a=5*3 /  5와 3을 곱한 값을 a에 대입
 / 나누기 a=5/3 /  5를 3으로 나눈 값을 a에 대입
  % 나머지 a=5%3 /  5를 3으로 나누고 남은 값을 a에 대입
 */
	public static void main(String[] args) {
		int n1, n2, res; //정수형 변수 3개 선언
		n1 =5; //n1에 5 저장
		n2 =3; //n2에 3 저장
		res =n1 + n2; // res에 n1(5)와 n2(3)을 더한 값을 저장 =>res에는 8이 대입됨
		System.out.println(res); //res 출력
	}
	
}
