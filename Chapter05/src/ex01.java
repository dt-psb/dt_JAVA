import java.util.Scanner;
public class ex01 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("요일에 해당하는 숫자를 입력하시요(월-1~일-7) : ");
		//switch문은 숫자말고도 문자로도 사용가능
		int day = s.nextInt();
		System.out.println("=====오늘일정=====");
		switch(day) {
		case 1:
			System.out.println("월요일 : 회의 준비");
			break;
		case 2:
			System.out.println("화요일 : 프로젝트");
			break;
		case 3:
			System.out.println("수요일 : 미팅");
			break;
		case 4:
			System.out.println("목요일 : 코드 리뷰");
			break;
		case 5:
			System.out.println("금요일 : 업무 정리");
		case 6:
			System.out.println("토요일 : 휴식");
		case 7:
			System.out.println("일요일 : 휴식 2 ");
			break;
		default :
			System.out.println("올바른 숫자를 입력하세요(1~7)");
		}
		s.close();
	}
}
