import java.util.Scanner;
public class Code06_12 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); //Scanner 객체 생성
		int hap =0; //합 저장 변수 선언
		int num1,num2; //더할 숫자 변수 선언
		while(true) { //무한히 반복
			System.out.print("숫자1 ==> ");
			num1 = s.nextInt(); //숫자 입력받기
			System.out.print("숫자2 ==> ");
			num2 = s.nextInt(); //숫자 입력받기
			
			hap = num1+num2; //숫자 더하기
			System.out.println(num1 + " + " + num2 + " = " + hap); //결과 출력
			
		}
	} 
}

