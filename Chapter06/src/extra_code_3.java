import java.util.Scanner;
public class extra_code_3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int password;
		System.out.print("비밀번호를 입력해주세요 : ");
		password = s.nextInt();
		for (int i=0 ; i<=10; i++) {
			System.out.println(i+" 시도 중...");
			if(i==password) {
				System.out.printf("비밀번호가 찾았습니다! : %d \n", i);
				break;
			}
		}
	} 
}

