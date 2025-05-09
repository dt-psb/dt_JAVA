class Rabbit_04{
	
	Rabbit_04() {
		System.out.println("1. 슈퍼 클래스(토끼)의 생성자가 호출됩니다.");
	}
}

class HouseRabbit_04 extends Rabbit_04{
	HouseRabbit_04(){
		System.out.println("2. 서브 클래스(집토끼)의 생성자가 호출됩니다.");
	}
}

public class Code08_03 {
	public static void main(String[] args) {
		HouseRabbit_04 hRabbit = new HouseRabbit_04();

	} 
}
