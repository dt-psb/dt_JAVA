interface Car_10{
	void move();
}

interface Cannon_10{
	void fire();
}
class Tank_10 implements Car_10, Cannon_10{
	public void move() {
		System.out.println("탱크가 앞으로 이동합니다.");
	}
	public void fire() {
		System.out.println("탱크에서 대포를 발사합니다.");
	}
}
public class Code08_10 {
	public static void main(String[] args) {
		Tank_10 tank1 = new Tank_10();
		tank1.move();
		tank1.fire();
	
	} 
}
