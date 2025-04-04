
public class Code03_02 {
	public static void main(String[] args) {
		int n1, n2, res;
		n1 =5; //n1에 5 저장
		n2 =3; //n2에 3 저장
		res =n1 + n2; // res에 n1(5)와 n2(3)을 더한 값을 저장 =>res에는 8이 대입됨
		System.out.println(res); //res 출력
		res =n1 - n2; // res에 n1(5)와 n2(3)을 뺀 값을 저장 =>기존의 8은 사라지고 2가 대입
		System.out.println(res); //res 출력
		res =n1 * n2; // res에 n1(5)와 n2(3)을 곱한값을 저장 =>기존의 2은 사라지고 15가 대입
		System.out.println(res); //res 출력
		res =n1 / n2; // res에 n1(5)와 n2(3)을 나눈 값을 저장 =>기존의 15은 사라지고 1이 대입
		System.out.println(res); //res 출력
		res =n1 % n2; // res에 n1을 n2로 나눈 값의 나머지를 저장 =>기존의 1은 사라지고 2가 대입
		System.out.println(res); //res 출력
	}
}
