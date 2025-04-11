
import java.util.Scanner;
public class Code05_06 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); //Scanner 객체 사용
		int num;  //변수 선언
		
		System.out.print("숫자 입력 ==> ");
		num = s.nextInt(); //num에 입력받은 정수 저장
		
		if (num>100) { //num이 100보다 크면 아래 if문 판별
			if (num<1000) { //num이 1000보다 크다면 중괄호 안 코드 출력
				System.out.println("100보다 크고 1000보다 작군요."); //100<num<1000
			} else {//num이 100보다 크지만 1000보다 작으면 중괄호 안 코드 출력
				System.out.println("와~ 1000보다 크군요.");  //num>1000
			}
		} else { //num이 100보다 작으면 중괄호 안 코드 출력
			System.out.println("음~ 100보다 작군요."); //num<100
		}
		s.close();
	}
}
