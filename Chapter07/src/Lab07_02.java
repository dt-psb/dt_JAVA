class Dice{
	private int number;
	
	public void setNumber(int number) {
		this.number = number;
	}
	public int getNumber() {
		return this.number;
	}
}


public class Lab07_02 {
	public static void main(String[] args) {
		int count=0; //횟수 변수 선언 및 초기화
		Dice dice1 = new Dice(); //주사위1 객체 생성
		Dice dice2 = new Dice(); //주사위2 객체 생성
		Dice dice3 = new Dice(); //주사위3 객체 생성
		
		while(true) {//3개의 주사위 수가 모두 같아질 때까지 계속 반복
			count++; //횟수 증가
			dice1.setNumber((int)(Math.random()*6 +1)); //1부터 6까지 랜덤값 생성
			dice2.setNumber((int)(Math.random()*6 +1));
			dice3.setNumber((int)(Math.random()*6 +1));
			
			if((dice1.getNumber() == dice2.getNumber())&&
					dice2.getNumber() == dice3.getNumber()) {
				break; //반복문 탈출
		}
			
		}
		System.out.printf("3개 주사위는 모두 %d입니다.\n", dice1.getNumber());
		System.out.printf("같은 숫자가 나올 때까지 %d번 던졌습니다.\n", count);
	}
}
