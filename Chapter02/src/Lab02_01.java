import java.util.Scanner;
public class Lab02_01 {
	public static void main(String[ ] args) {
		Scanner s = new Scanner(System.in); //키보드 값을 입력받기 위해 Scanner 클래스 사용
				
		String personName, personAddr; //문자열으로 받을 이름, 주소 변수 생성
		int weight; //정수로 받을 무게 변수 생성
		
		System.out.println("## 택배보내기입니다. 다음을 각각 입력하세요 ##"); //입력부탁문구
		
		System.out.print("받는 사람 : "); 
		personName = s.nextLine(); //받는 사람 입력 받아서 문자열 변수에 저장
		System.out.print("주소  : "); 
		personAddr = s.nextLine(); //주소 입력 받아서 문자열 변수에 저장
		System.out.print("무게(g) : ");
		weight = s.nextInt(); //무게 입력 받아서 정수 변수에 저장
		
		System.out.println("** 받는 사람 ==> "+ personName); //personName 출력
		System.out.println("** 주소 ==> "+ personAddr); //personAddr 출력
		System.out.println("** 배송비 ==> "+ weight*5+"원"); //입력받은 무게 * 5를 하여 배송비 출력
		
		s.close();
	}
}
