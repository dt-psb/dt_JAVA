
public class Lab06_03 {
	public static void main(String[] args) {
		int count =0; //횟수 변수 선언 및 초기화
		int dice1, dice2, dice3; //주사위값 변수
		
		while(true) { //break까지 계속반복
			count++; //횟수 증가
			dice1 = (int)(Math.random()*6 +1);//1~6 랜덤한 수 지정
			dice2 = (int)(Math.random()*6 +1);//1~6 랜덤한 수 지정
			dice3 = (int)(Math.random()*6 +1);//1~6 랜덤한 수 지정
			
			if ((dice1==dice2) &&(dice2==dice3)) //만약 dice1,2,3 수가 모두 같다면
				break;//반복문 탈출
		}//결과 출력
		System.out.printf("3개 주사위는 모두 %d입니다. \n", dice1);
		System.out.printf("같은 숫자가 나올 때까지 %d번 던졌습니다. \n", count);
	} 
}

