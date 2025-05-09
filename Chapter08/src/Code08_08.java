abstract class Rabbit_08{ //추상 클래스
	String shpae;
	int xPos;
	int yPos;
	
	void move(int x, int y) {
		this.xPos =x;
		this.yPos = y;
	}
	//추상 메서드가 하나라도 있으면 클래스는 무조건 추상 클래스 지정
	abstract void sleep(); //추상 메서드
}

//추상 클래시를 상속 받은 서브 클래스는 추상 메서드를 반드시 오버라이딩 해야한다
class HouseRabbit_08 extends Rabbit_08{
	void sleep() {//오버라이딩
		System.out.println("집토끼가 우리에서 잠자고 있습니다.");
	}
}	

class MountainRabbit_08 extends Rabbit_08{
	void sleep() {//오버라이딩
		System.out.println("산토끼가 굴속에서 잠자고 있습니다.");
	}
}


public class Code08_08 {
	public static void main(String[] args) {
		HouseRabbit_08 hRabbit = new HouseRabbit_08();
		MountainRabbit_08 mRabbit = new MountainRabbit_08();
		
		hRabbit.sleep();
		mRabbit.sleep();
		
		
	
	} 
}
