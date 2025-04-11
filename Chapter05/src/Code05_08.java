import java.util.Scanner;
public class Code05_08 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); //Scanner 객체 사용
		int score;//변수 선언
		
		System.out.print("점수 입력 ==> ");
		score = s.nextInt(); //변수에 입력받은 정수 저장
		
		if (score >=90) //만약 score가 90보다 크거나 같다면 A출력
			System.out.print("A");
		else if (score >=80) // score이 90보다 작으면서 80보다 크거나 같으면 B출력
				System.out.print("B");
		else if (score >=70) // score이 80보다 작으면서 70보다 크거나 같으면 B출력
				System.out.print("C");
		else if (score >=60) // score이 70보다 작으면서 60보다 크거나 같으면 B출력
				System.out.print("D");
		else
			System.out.print("E"); //그 어느 if, else if문에도 걸리지 않으면 출력
		// else~if를 else if문으로 줄여 더 짧고 깔끔한 코드 가능
		System.out.println(" 학점입니다.");
		s.close();
	}
}
