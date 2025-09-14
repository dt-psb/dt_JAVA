class Rabbit_01{
	String shape;
	int xPos;
	int ypos;
	static int count; //생성한 토끼의 수
	
	void move(int x, int y) {
		this.xPos =x;
		this.ypos = y;
	}
	Rabbit_01() {
		count++;
	}
}

class HouseRabbit_02 extends Rabbit_01{
	String owner;
	void eatFood() {
		System.out.println("집토끼가 사료를 먹습니다.");
	}
}

class MountainRabbit_02 extends Rabbit_01{
	String mountain;
	void eatWildglass() {
		System.out.println("산토끼가 풀를 먹습니다.");
	}
}

public class Code08_01 {
	public static void main(String[] args) {
		System.out.println("객체 생성 전의 총 토끼 수 ==>" + Rabbit_01.count);
		
		Rabbit_01 rabbit1=new Rabbit_01();
		System.out.println("토끼 객체1 생성 후의 총 토끼 수 ==>" + Rabbit_01.count);
		
		Rabbit_01 rabbit2=new Rabbit_01();
		System.out.println("토끼 객체2 생성 후의 총 토끼 수 ==>" + Rabbit_01.count);
		
		MountainRabbit_02 mrabbit=new MountainRabbit_02();
		mrabbit.eatWildglass();
	} 
}
