import java.util.Scanner; //Scanner 클래스를 가져오기
public class Code02_10 {
	public static void main(String[ ] args) {
		Scanner s = new Scanner(System.in);
				
		int num; //정수 변수 생성
		
		num=s.nextInt(); //정수만 받을 수 있음, 실수를 받으려면 nextDouble(), 문자열을 입력받으려면 next() 사용
		System.out.println("사용자가 입력한 값 ==> "+num); //정수 변수 출력
		
		s.close(); //자바프로그램이 종료되면 scanner가 자동으로 닫히기 때문에 생략 가능할 수도 있음
	}
}

