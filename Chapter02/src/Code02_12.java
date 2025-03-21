
public class Code02_12 {
	public static void main(String[ ] args) {
		int num1; //정수 변수
		double num2; //실수 변수
		String str; //문자열 변수
		
		str ="1234"; //문자열 변수에 문자열 "1234"저장 !주의 정수 아님"
		num1 = Integer.parseInt(str);//문자열 "1234"를 정수형태로 변환
		System.out.println("문자열 ==> 정수 : "+num1); //정수 형태의 1234 출력
		
		str="3.14"; //문자열 변수에 문자열 "3.14"저장 !주의 실수 아님"
		num2 = Double.parseDouble(str);//문자열 "3.14"를 실수형태로 변환
		System.out.println("문자열 ==> 실수 : "+num2); //실수 형태의 3.14 출력
		
	}
}
