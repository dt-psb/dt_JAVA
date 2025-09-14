interface Rabbit_09{
	abstract void sleep();
}

class HouseRabbit_09 implements Rabbit_09{
	public void sleep() {
		System.out.println("집토끼가 우리에서 잠자고 있습니다.");
	}
}	

class MountainRabbit_09 implements Rabbit_09{
	public  void sleep() {
		System.out.println("산토끼가 굴속에서 잠자고 있습니다.");
	}
}


public class Code08_09 {
	public static void main(String[] args) {
		HouseRabbit_09 hRabbit = new HouseRabbit_09();
		MountainRabbit_09 mRabbit = new MountainRabbit_09();
		
		hRabbit.sleep();
		mRabbit.sleep();
		
		
	
	} 
}
