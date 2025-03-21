import java.util.Scanner;
public class Code02_11 {
	public static void main(String[ ] args) {
		Scanner s = new Scanner(System.in); //Scanner 클래스 사용
				
		double num; //실수 변수 생성
		System.out.print("실수를 입력하세요 : ");
		num = s.nextDouble(); //실수 변수에 입력받은 실수값을 저장
		
		String str;//문자열 변수 생성
		System.out.print("문자열을 입력하세요 : ");
		str = s.next();//문자열 변수에 입력받은 실수값을 저장
		
		System.out.println("사용자가 입력한 값 ==> "+ num); //실수 변수 출력
		System.out.println("사용자가 입력한 값 ==> "+ str); //문자열 변수 출력
		
		s.close();
	}
}

