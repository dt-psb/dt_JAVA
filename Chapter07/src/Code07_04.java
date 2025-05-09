
public class Code07_04 {
	public static void main(String[] args) {
		Turtle turtle1 = new Turtle(); //터틀 객체1 생성
		Turtle turtle2 = new Turtle();//터틀 객체2 생성
		Turtle turtle3 = new Turtle();//터틀 객체3 생성


		turtle1.shape("circle");//터틀1 모양 원으로 바꿈
		turtle1.setPosition(100, 100);//터틀1 위치변경
		turtle2.shape("turtle");//터틀2 모양 거북이으로 바꿈
		turtle2.setPosition(0, -100);//터틀2 위치변경
		turtle3.shape("triangle");//터틀3 모양 삼각형으로 바꿈
		turtle3.setPosition(-100, 100);//터틀3 위치변경
	} 
}
