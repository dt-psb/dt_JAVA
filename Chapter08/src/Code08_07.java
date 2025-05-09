abstract class Rabbit_07{
	String shpae;
	int xPos;
	int yPos;
	
	void move(int x, int y) {
		this.xPos =x;
		this.yPos = y;
	}
}

class HouseRabbit_07 extends Rabbit_07{
}

class MountainRabbit_07 extends Rabbit_07{
}


public class Code08_07 {
	public static void main(String[] args) {
//		Rabbit_07 rabbit = new Rabbit_07();
		HouseRabbit_07 hRabbit = new HouseRabbit_07();
		System.out.println("집토끼 객체 생성~~");
		MountainRabbit_07 mRabbit = new MountainRabbit_07();
		System.out.println("산토끼 객체 생성~~");

		
		
	
	} 
}
