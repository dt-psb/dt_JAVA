class Rabbit_05{
	private String shape;
	int xPos;
	int yPos;
	static int count; //생성한 토끼의 수
	
	private void move(int x, int y) {
		this.xPos =x;
		this.yPos = y;
	}
	Rabbit_05() {
		count++;
	}
}

class HouseRabbit_05 extends Rabbit_05{
	String owner;
	void eatFood() {
		System.out.println("집토끼가 사료를 먹습니다.");
	}
}


public class Code08_05 {
	public static void main(String[] args) {
		HouseRabbit_05 hRabbit = new HouseRabbit_05();

		
		hRabbit.eatFood();
		hRabbit.owner = "난쟁이";
//		hRabbit.shape = "삼각형";
//		hRabbit.move(100,100);
		hRabbit.xPos=100;
		hRabbit.yPos=100;
	
	} 
}
