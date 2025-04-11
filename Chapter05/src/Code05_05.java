import java.util.Scanner;
public class Code05_05 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); //Scanner 객체 사용
		int num; //변수 선언
		
		System.out.print("숫자 입력 ==> ");
		num = s.nextInt(); //num에 입력받은 정수 저장
		
		if (num%2==0) //num을 2로 나눈 나머지가 0인지 확인 (짝수 판별)
			System.out.println("짝수입니다."); //짝수일 경우 실행
		else
			System.out.println("홀수입니다."); //홀수일 경우 실행
		
		s.close();
	}
}