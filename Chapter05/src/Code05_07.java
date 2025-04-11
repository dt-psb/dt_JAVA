
import java.util.Scanner;
public class Code05_07 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);  //Scanner 객체 사용
		int score; //변수 선언
		
		System.out.print("점수 입력 ==> ");
		score = s.nextInt(); //변수에 입력받은 정수 저장
		
		if (score >=90) //만약 score가 90보다 크거나 같다면 A출력
			System.out.print("A");
		else //90보다 작으며
			if (score >=80) //만약 80보다 크거나 같다면 B출력
				System.out.print("B");
			else //80보다 작으며
				if (score >=70) //만약 70보다 크거나 같으면 C출력
					System.out.print("C");
				else//70보다 작으며
					if (score >=60) //만약 60보다 크거나 같으면 D출력
						System.out.print("D");
					else//만약 60보다 작으면
						System.out.print("E");//E출력
		System.out.println("학점입니다.");//공통적인 문구 출력

		s.close();
	}
}
