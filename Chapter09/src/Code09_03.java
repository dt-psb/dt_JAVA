import java.util.Scanner;
public class Code09_03 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);//Scanner  객체 생성
		int[] numAry = new int[4];//정수형 배열 선언하고 크기를 4로 지정
		int hap = 0;//합을 저장할 변수
		
		for(int i =0;i<=3;i++) { //4번 반복, i(0~3)으로 반복함
			System.out.print("숫자 : "); 
			numAry[i] = s.nextInt();//배열의 i번 인덱스에 입력받은 숫자 저장
		}
		
		hap = numAry[0] +numAry[1] +numAry[2] +numAry[3]; //numAry의 모든 요소를 더해서 hap에 저장
		System.out.println("합계 ==> "+hap);//합 출력
		
		s.close();
	} 
}