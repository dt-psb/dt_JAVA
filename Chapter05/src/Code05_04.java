
public class Code05_04 {
	public static void main(String[] args) {
		int num =200;//변수 선언 및 초기값 설정
		
		if (num<100) {//만약  num(200)가 100보다 작으면 아래 코드 실행
			System.out.println("100보다 작군요.");
			System.out.println("여기는 참입니다.");
		} else {//만약 if문을 실행하지 않으면 아래 코드 실행
			System.out.println("100보다 크군요.");
			System.out.println("여기는 거짓입니다.");
		}//실행할 문장이 여러 개라면 중괄호로 묶어서 사용
		
		System.out.println("프로그램 끝!");
	}
}
