
public class extra_code_1 {
	public static void main(String[] args) {
		int password = 7; //비밀번호 선언 및 초기값
		for (int i=0 ; i<=10; i++) { //0에서 10 반복
			if(i==password) { //만약 i랑 password가 같으면 아래 출력
				System.out.printf("비밀번호가 찾았습니다! : %d \n", i);
			}
		}
	} 
}

