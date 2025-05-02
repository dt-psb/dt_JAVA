import java.util.Scanner;
public class Code06_14 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); //Scanner 객체 생성
		int hap =0; //합 저장할 변수
		int num1,num2; //숫자 받을 변수
		
		while(true) {
			System.out.print("숫자1 ==> ");
			num1 =s.nextInt(); //숫자1 입력받음
			if(num1==0)//만약 숫자1이 0이면
				break;//반복문 탈출
			System.out.print("숫자2 ==> ");
			num2 = s.nextInt();//숫자2 입력받음
			
			hap = num1+num2; //더한 뒤 출력
			System.out.println(num1+ " + " + num2 + " = " + hap);
		}
		
		System.out.println("0을 입력해서 계산을 종료합니다.");
		s.close();
	} 
}

