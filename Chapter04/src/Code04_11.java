import java.util.Scanner;
public class Code04_11 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); //Scanner 객체 생성
		String var1, var2;
		int diff; //두 문자열 길이 차이를 저장할 변수
		
		System.out.print("첫 번째 문자열 ==> ");
		var1 = s.nextLine(); //첫 번째 문자열 저장
		System.out.print("두 번째 문자열 ==> ");
		var2 = s.nextLine(); //두 번째 문자열 저장
		
		diff = var1.length()-var2.length(); //var1과 var2차이를 계산하여 diff에 저장
		System.out.println("두 문자열 길이의 차이는 " + diff + "입니다."); //길이 차이 출력
		s.close();
	}
}
