import java.util.Scanner;
public class extra_code_3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); //Scanner 객체 생성
		int password; //비밀번호를 받을 변수 선언
		System.out.print("비밀번호를 입력해주세요 : ");
		password = s.nextInt(); //입력받기
		for (int i=0 ; i<=10; i++) { //0에서 10까지 반복
			System.out.println(i+" 시도 중...");
			if(i==password) { //i와 password가 일치하면 아래 출력
				System.out.printf("비밀번호가 찾았습니다! : %d \n", i);
				break; //비밀번호를 찾았으므로 반복문 탈출
			}
		}
	} 
}

