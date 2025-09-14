class Rabbit_03{
	String shape;
	int xPos;
	int ypos;
	static int count; //생성한 토끼의 수
	
	void move(int x, int y) {
		this.xPos =x;
		this.ypos = y;
	}
	Rabbit_03() {
		count++;
	}
}

class HouseRabbit_03 extends Rabbit_03{
	String owner;
	void eatFood() {
		System.out.println("집토끼가 사료를 먹습니다.");
	}
}

class MountainRabbit_03 extends Rabbit_03{
	String mountain;
	void eatWildglass() {
		System.out.println("산토끼가 풀를 먹습니다.");
	}
}

public class Code08_04 {
	public static void main(String[] args) {
		HouseRabbit_03 hRabbit = new HouseRabbit_03();
		MountainRabbit_03 mRabbit=new MountainRabbit_03();
		
		hRabbit.shape = "삼각형";
		hRabbit.owner = "난쟁이";
		hRabbit.move(100,100);
		hRabbit.eatFood();
		
		mRabbit.shape = "네모";
		mRabbit.mountain = "설악산";
		mRabbit.move(200,200);
		mRabbit.eatWildglass();
	} 
}
