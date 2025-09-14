import java.util.Scanner; 
public class Code09_02 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);//Scanner  객체 생성
		int[] numAry = new int[4]; //정수형 배열 선언하고 크기를 4로 지정
		int hap = 0;//합을 저장할 변수
		
		System.out.print("숫자 : ");
		numAry[0] = s.nextInt(); //배열의 0번 인덱스에 입력받은 숫자 저장
		System.out.print("숫자 : ");
		numAry[1] = s.nextInt(); //배열의 1번 인덱스에 입력받은 숫자 저장
		System.out.print("숫자 : ");
		numAry[2] = s.nextInt(); //배열의 2번 인덱스에 입력받은 숫자 저장
		System.out.print("숫자 : ");
		numAry[3] = s.nextInt(); //배열의 3번 인덱스에 입력받은 숫자 저장
		
		hap = numAry[0] +numAry[1] +numAry[2] +numAry[3]; //numAry의 모든 요소를 더해서 hap에 저장
		System.out.println("합계 ==> "+hap);//합 출력
		
		s.close();
	} 
}
